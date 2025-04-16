package programmers.lv1;

import java.util.*;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        String[] result = solution(strings, n);

        System.out.println("정렬 결과: " + Arrays.toString(result));
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            // n번째 문자가 같으면 사전순 정렬
            if (s1.charAt(n) == s2.charAt(n))
                return s1.compareTo(s2);
            // n번째 문자 기준 정렬
            return s1.charAt(n) - s2.charAt(n);
        });

        return strings;
    }
}
