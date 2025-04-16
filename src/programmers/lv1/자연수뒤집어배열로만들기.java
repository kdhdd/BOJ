package programmers.lv1;

import java.util.*;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        long n = 12345;

        int[] result = solution(n);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(long n) {
        String s = Long.toString(n);
        String[] sArr = s.split("");

        int[] answer = new int[sArr.length];
        int index = 0;

        // 뒤에서부터 배열에 담기
        for (int i = sArr.length - 1; i >= 0; i--) {
            answer[index++] = Integer.parseInt(sArr[i]);
        }

        return answer;
    }
}
