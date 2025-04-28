package boj;

import java.io.*;
import java.util.*;

public class BOJ1303 {
    static int M, N;             // M = 행, N = 열
    static char[][] map;
    static boolean[][] visited;
    static final int[] dx = {-1, 1, 0, 0};
    static final int[] dy = {0, 0, -1, 1};

    static int W = 0, B = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());   // 열
        M = Integer.parseInt(st.nextToken());   // 행

        map = new char[M][N];
        visited = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            String line = br.readLine().trim();
            for (int j = 0; j < N; j++) map[i][j] = line.charAt(j);
        }

        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                if (!visited[i][j]) bfs(i, j);

        System.out.println(W + " " + B);
    }

    static void bfs(int sx, int sy) {
        char team = map[sx][sy];
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{sx, sy});
        visited[sx][sy] = true;

        int cnt = 1;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int d = 0; d < 4; d++) {
                int nx = cur[0] + dx[d];
                int ny = cur[1] + dy[d];
                if (0 <= nx && nx < M && 0 <= ny && ny < N &&
                        !visited[nx][ny] && map[nx][ny] == team) {
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx, ny});
                    cnt++;
                }
            }
        }

        if (team == 'W') W += cnt * cnt;
        else             B += cnt * cnt;
    }
}
