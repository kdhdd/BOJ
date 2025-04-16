package 정렬;

import java.util.Arrays;
import java.util.List;

public class ListSortCustomLength {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "C++", "JavaScript");

        // 길이 기준 오름차순
        words.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println("길이 오름차순: " + words);

        // 길이 기준 내림차순
        words.sort((s1, s2) -> s2.length() - s1.length());
        System.out.println("길이 내림차순: " + words);
    }
}
