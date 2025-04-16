package 정렬;

import java.util.Arrays;
import java.util.Comparator;

public class ObjectArraySort2 {

    public static void main(String[] args) {
        String[] names1 = {"banana", "apple", "cherry", "Apple"};
        System.out.println("정렬 전: " + Arrays.toString(names1));

        Arrays.sort(names1, Comparator.reverseOrder());

        System.out.println("정렬 후: " + Arrays.toString(names1));

        String[] names2 = {"바나나", "사과", "체리", "사과"};
        System.out.println("정렬 전: " + Arrays.toString(names2));

        Arrays.sort(names2, Comparator.reverseOrder());

        System.out.println("정렬 후: " + Arrays.toString(names2));
    }
}
