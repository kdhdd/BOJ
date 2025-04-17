package 입력과출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 가변길이2차원배열입력받기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        StringTokenizer tokens;

        for (int i = 0; i < n; i++) {
            tokens = new StringTokenizer(br.readLine());
            ArrayList<Integer> line = new ArrayList<>();

            while (tokens.hasMoreTokens()) {
                line.add(Integer.parseInt(tokens.nextToken()));
            }

            matrix.add(line);
        }

        System.out.println(matrix);
    }
}
