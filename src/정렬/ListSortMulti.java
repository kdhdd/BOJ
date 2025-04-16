package 정렬;

import java.util.Arrays;
import java.util.List;

public class ListSortMulti {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "kiwi", "banana", "pear", "apricot");

        words.sort((s1, s2) -> {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            }
            // compareTo() 메소드는 자연 비교(사전순)을 수행한다.
            return s1.compareTo(s2);
        });

        System.out.println("다중 조건 정렬: " + words);
    }
}
