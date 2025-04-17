package 그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AdjMatrixDirected {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken()); // 정점 개수
        int e = Integer.parseInt(st.nextToken()); // 간선 개수

        int[][] adjMatrix = new int[v][v];

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int startNode = Integer.parseInt(st.nextToken());
            int endNode = Integer.parseInt(st.nextToken());
            adjMatrix[startNode][endNode] = 1;
        }

        System.out.println("방향 그래프 인접 행렬:");
        for (int i = 0; i < v; i++) {
            System.out.println(Arrays.toString(adjMatrix[i]));
        }
    }
}
