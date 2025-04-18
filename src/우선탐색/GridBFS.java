package 우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class GridBFS {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 세로
        int M = Integer.parseInt(st.nextToken()); // 가로

        // 이차원 배열과 방문 배열 생성
        int[][] map = new int[N][M];
        boolean[][] visited = new boolean[N][M];

        // 이차원 배열 입력
        for (int y = 0; y < N; y++) {
            st = new StringTokenizer(br.readLine());
            for (int x = 0; x < M; x++) {
                map[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        // BFS 시작 (0,0)
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0});
        visited[0][0] = true;

        StringBuilder sb = new StringBuilder();
        sb.append("(0,0) ");

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int y = cur[0];
            int x = cur[1];

            for (int d = 0; d < 4; d++) {
                int ny = y + dy[d];
                int nx = x + dx[d];

                // 경계 검사
                if (ny < 0 || ny >= N || nx < 0 || nx >= M) {
                    continue;
                }

                if (visited[nx][nx]) {
                    continue;
                }

                if (map[nx][ny] == 0) {
                    continue;
                }

                visited[nx][ny] = true;
                q.offer(new int[]{ny, nx});
                sb.append("(").append(ny).append(",").append(nx).append(") ");
            }
        }

        System.out.println("BFS 방문 순서:");
        System.out.println(sb);
    }
}
