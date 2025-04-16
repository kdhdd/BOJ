package programmers.lv2;

import java.util.*;

public class 가장큰수 {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};

        String result = solution(numbers);

        System.out.println("가장 큰 수: " + result);
    }

    public static String solution(int[] numbers) {
        String[] str = new String[numbers.length];

        // 숫자 → 문자열로 변환
        for (int i = 0; i < numbers.length; i++)
            str[i] = String.valueOf(numbers[i]);

        // 정렬 기준: s2 + s1이 더 크면 s2가 앞에 오도록
        Arrays.sort(str, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        // 0으로만 이루어진 경우 처리 (ex. [0, 0, 0])
        if (str[0].equals("0"))
            return "0";

        // 문자열 이어붙이기
        StringBuilder sb = new StringBuilder();
        for (String s : str)
            sb.append(s);

        return sb.toString();
    }
}
