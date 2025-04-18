package 우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class LoopBFS {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());   // 정점(Vertex) 수
        int E = Integer.parseInt(st.nextToken());   // 간선(Edge) 수

        // 인접 리스트
        ArrayList<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        // 간선 입력 (무방향 그래프)
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        // 시작 정점
        int start = 0;

        // 방문 배열 생성
        boolean[] visited = new boolean[V];
        visited[start] = true;

        // 큐 생성
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(start);

        StringBuilder sb = new StringBuilder();

        while (!q.isEmpty()) {
            int node = q.poll();
            sb.append(node).append(' ');

            for (int next : adj[node]) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.offer(next);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
