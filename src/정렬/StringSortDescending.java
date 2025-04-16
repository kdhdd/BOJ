package 정렬;

import java.util.Arrays;
import java.util.Comparator;

public class StringSortDescending {

    public static void main(String[] args) {
        String str = "helloworld";

        // char 배열을 Character 배열로 변환
        char[] chars = str.toCharArray();
        Character[] charObjects = new Character[chars.length];

        for (int i = 0; i < chars.length; i++) {
            charObjects[i] = chars[i];
        }

        // 내림차순 정렬
        Arrays.sort(charObjects, Comparator.reverseOrder());

        // 정렬된 문자 배열을 다시 문자열로 변환
        StringBuilder sorted = new StringBuilder();
        for (char c : charObjects) {
            sorted.append(c);
        }

        System.out.println("내림차순 정렬 결과: " + sorted); // wroolllhed
    }
}
