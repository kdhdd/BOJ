package 입력과출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class InputExample1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];

        // 한 줄에 여러 개의 값이 공백으로 구분되어 들어올 때 사용한다.
        // 내부적으로 readLine()으로 한 줄을 읽은 후, 공백 기준으로 나눈다.
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(numbers));
    }
}
