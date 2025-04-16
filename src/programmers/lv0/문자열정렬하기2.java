package programmers.lv0;

import java.util.*;

public class 문자열정렬하기2 {
    public static void main(String[] args) {
        String my_string = "Bcad";

        String result = solution(my_string);

        System.out.println("정렬된 문자열: " + result);
    }

    public static String solution(String my_string) {
        // 1. 모두 소문자로 변환
        my_string = my_string.toLowerCase();

        // 2. 문자 배열로 변환
        char[] ch = my_string.toCharArray();

        // 3. 정렬
        Arrays.sort(ch);

        // 4. 문자열로 변환해서 반환
        return new String(ch);
    }
}

