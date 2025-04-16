package 정렬;

import java.util.Arrays;
import java.util.Comparator;

public class PrimitiveToWrapperSortManual {

    public static void main(String[] args) {
        int[] primitiveNumbers = {3, 1, 4, 1, 5, 9, 2, 6};
        System.out.println("기본형 배열 정렬 전: " + Arrays.toString(primitiveNumbers));

        // 1. 수동으로 Integer 배열 생성 및 복사
        Integer[] wrapperNumbers = new Integer[primitiveNumbers.length];
        for (int i = 0; i < primitiveNumbers.length; i++) {
            wrapperNumbers[i] = primitiveNumbers[i]; // auto-boxing
        }

        // 2. 내림차순 정렬
        Arrays.sort(wrapperNumbers, Comparator.reverseOrder());

        System.out.println("내림차순 정렬 후: " + Arrays.toString(wrapperNumbers));
    }
}
