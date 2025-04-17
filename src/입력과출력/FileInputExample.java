package 입력과출력;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FileInputExample {

    public static void main(String[] args) throws IOException {
        /**
        1. 프로젝트의 루트 폴더에 `input.txt` 를 생성합니다.
        - 예시 : `Practice/input.txt`
        2. 텍스트 파일에 예시 입력을 작성합니다.
        3. 기존 사용자 입력 코드를 주석 처리하고, 파일 입력 코드를 추가합니다.
         */
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
