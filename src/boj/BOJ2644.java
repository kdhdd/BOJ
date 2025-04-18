package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2644 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());   // 전체 사람의 수

        st = new StringTokenizer(br.readLine());
        int startNode = Integer.parseInt(st.nextToken()) - 1;
        int endNode = Integer.parseInt(st.nextToken()) - 1;

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());   // 관계의 개수

        ArrayList<Integer>[] adj = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            adj[u].add(v);
            adj[v].add(u);
        }

        boolean[] visited = new boolean[n];

        // 이동 거리도 저장하고 싶다
        Queue<int[]> q = new ArrayDeque<>();
        // 시작 : 시작노드, 이동 거리 : 0
        q.offer(new int[]{startNode, 0});
        visited[startNode] = true;

        int count = -1;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curV = cur[0];
            int d = cur[1];

            if (curV == endNode) {
                count = d;
                break;
            }

            for (int next : adj[curV]) {
                if (!visited[next]) {
                    q.offer(new int[]{next, d + 1});
                    visited[next] = true;
                }
            }

        }

        System.out.println(count);
    }
}
