package 정렬;

import java.util.Arrays;
import java.util.List;

public class ListSortCustomSecond {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "C++", "JavaScript");

        // 두 번째 문자 기준 오름차순 정렬
        words.sort((s1, s2) -> s1.charAt(1) - s2.charAt(1));

        System.out.println("두 번째 문자 기준 오름차순 정렬 후: " + words);

        // 두 번째 문자 기준 내림차순 정렬
        words.sort((s1, s2) -> s2.charAt(1) - s1.charAt(1));
        System.out.println("두 번째 문자 기준 내림차순 정렬 후: " + words);
    }
}
