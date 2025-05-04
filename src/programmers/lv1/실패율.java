package programmers.lv1;

import java.util.*;

public class 실패율 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        int[] result = solution(N, stages);

        System.out.println("결과: " + Arrays.toString(result));
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        ArrayList<Double> fails = new ArrayList<>();

        Arrays.sort(stages);

        int start = 0;
        int size = stages.length;
        for (int i = 0; i < N; i++) {
            double num = 0.0;
            for (int j = start; j < stages.length; j++) {
                if (stages[j] == i + 1) {
                    num += 1.0;
                }
            }
            if (size - start > 0) {
                fails.add(num / (size - start));
            } else {
                fails.add(0.0);
            }
            start += (int) num;
        }

        for (int i = 0; i < N; i++) {
            double maxVal = -1.0;
            int stage = 0;
            for (int j = 0; j < fails.size(); j++) {
                if (maxVal < fails.get(j)) {
                    maxVal = fails.get(j);
                    stage = j;
                }
            }
            answer[i] = stage + 1;
            fails.set(stage, -1.0);
        }

        return answer;
    }
}

