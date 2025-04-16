package 정렬;

import java.util.Arrays;

public class PrimitiveArraySort {

    public static void main(String[] args) {
        // 기본 자료형 정렬
        int[] numbers = {3, 1, 4, 1, 5, 9, 2};
        System.out.println("정렬 전: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("정렬 후: " + Arrays.toString(numbers));
    }
}
