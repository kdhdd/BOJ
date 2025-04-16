package 정렬;

import java.util.ArrayList;
import java.util.List;

public class ListSort {

    public static void main(String[] args) {
        // String 리스트 오름차순 정렬
        List<String> names = new ArrayList<>();
        names.add("banana");
        names.add("Apple");
        names.add("cherry");
        System.out.println("문자열 리스트 정렬 전: " + names);

        names.sort(null); // 방법 2

        System.out.println("문자열 리스트 정렬 후: " + names); // [Apple, banana, cherry]
    }
}
