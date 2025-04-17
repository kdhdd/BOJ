package 그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AdjMatrixUndirected {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 정점 개수와 간선 개수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        int[][] adjMatrix = new int[v][v];  // 인접 행렬 초기화

        // 간선 정보 입력
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }

        // 인접 행렬 출력
        System.out.println("무방향 그래프 인접 행렬");
        for (int i = 0; i < v; i++) {
            System.out.println(Arrays.toString(adjMatrix[i]));
        }
    }
}
