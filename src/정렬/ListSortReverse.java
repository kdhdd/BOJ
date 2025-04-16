package 정렬;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSortReverse {

    public static void main(String[] args) {
        // Integer 리스트 내림차순 정렬
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);
        System.out.println("정수 리스트 정렬 전: " + numbers);

        numbers.sort(Comparator.reverseOrder());

        System.out.println("정수 리스트 내림차순 정렬 후: " + numbers); // [4, 3, 1, 1]
    }
}
