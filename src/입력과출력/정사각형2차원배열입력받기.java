package 입력과출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 정사각형2차원배열입력받기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] matrix = new int[n][n];

        StringTokenizer tokens;

        for (int i = 0; i < n; i++) {
            tokens = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(tokens.nextToken());
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
