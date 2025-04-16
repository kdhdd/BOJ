package 정렬;

import java.util.Arrays;

public class StringSortAscending {

    public static void main(String[] args) {
        String str = "helloworld";

        // 문자열을 문자 배열로 변환
        char[] chars = str.toCharArray();

        // 오름차순 정렬
        Arrays.sort(chars);

        // 정렬된 문자 배열을 다시 문자열로 변환
        String sorted = new String(chars);

        System.out.println("오름차순 정렬 결과: " + sorted); // dehllloorw
    }
}
