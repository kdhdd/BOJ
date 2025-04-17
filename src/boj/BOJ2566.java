package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2566 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxNum = Integer.MIN_VALUE;
        int r = 0;
        int c = 0;

        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            String line = br.readLine();

            StringTokenizer st = new StringTokenizer(line, " ");

            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (maxNum < arr[i][j]) {
                    maxNum = arr[i][j];
                    r = i + 1;
                    c = j + 1;
                }
            }
        }

        System.out.println(maxNum);
        System.out.println(r + " " + c);
    }
}
