package programmers;

import java.util.*;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        int[] result = solution(arr);

        System.out.println("결과: " + Arrays.toString(result));
    }

    public static int[] solution(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(arr[0]); // 첫 원소는 무조건 추가
        int k = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arrList.get(k)) {
                arrList.add(arr[i]);
                k++;
            }
        }

        // ArrayList → 배열로 변환
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}
