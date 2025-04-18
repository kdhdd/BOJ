package 우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class RecursionDFS {

    // 인접 리스트, 방문 배열 선언
    private static ArrayList<Integer>[] adj;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());   // 정점(Vertex) 수
        int E = Integer.parseInt(st.nextToken());   // 간선(Edge) 수

        // 인접 리스트 초기화
        adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        // 간선 입력
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            adj[u].add(v);
            adj[v].add(u);
        }

        // 시작 정점
        int start = 0;

        // 방문 배열 초기화
        visited = new boolean[V];

        dfs(start);
    }

    private static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int next : adj[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
