package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1260 {
    static ArrayList<Integer>[] adj;
    static boolean[] dfsVisited;
    static boolean[] bfsVisited;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        dfsVisited = new boolean[N];
        bfsVisited = new boolean[N];

        adj = new ArrayList[N];
        for (int i = 0; i < N; i++)
            adj[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1;
            int e = Integer.parseInt(st.nextToken()) - 1;
            adj[u].add(e);
            adj[e].add(u);
        }

        for (int i = 0; i < N; i++) {
            adj[i].sort(null);
        }

        dfs(V - 1);
        System.out.println();
        bfs(V - 1);
    }

    public static void dfs(int node) {
        dfsVisited[node] = true;
        System.out.print((node + 1) + " ");

        for (int next : adj[node]) {
            if (!dfsVisited[next])
                dfs(next);
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(start);
        bfsVisited[start] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            System.out.print((cur + 1) + " ");
            for (int next : adj[cur]) {
                if (!bfsVisited[next]) {
                    bfsVisited[next] = true;
                    q.offer(next);
                }
            }
        }
    }
}
