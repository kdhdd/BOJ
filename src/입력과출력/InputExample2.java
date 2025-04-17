package 입력과출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputExample2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = 0;

        // 반환할 수 있는 문자열이 남아있는지 boolean 값으로 반환한다.
        // while문과 사용하여 입력의 길이를 알 수 없을 때 활용할 수 있다.
        while (st.hasMoreTokens()) {
            total += Integer.parseInt(st.nextToken());
        }

        System.out.println(total);
    }
}
