package programmers.lv2;

import java.util.*;

public class 석유시추 {
    public static void main(String[] args) {
        int[][] land = {
                {1, 0, 1, 0, 0},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };

        int result = solution(land);

        System.out.println("최대로 뽑을 수 있는 석유량: " + result);
    }

    static boolean[][] visited;
    static int[] oil;
    static int n, m;
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, 1, -1};

    public static int solution(int[][] land) {
        n = land.length;
        m = land[0].length;

        oil = new int[m]; // 열 별로 뽑을 수 있는 석유량 저장
        visited = new boolean[n][m];

        // 모든 땅에 대해 BFS 실행
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    bfs(land, i, j);
                }
            }
        }

        return Arrays.stream(oil).max().getAsInt(); // 가장 많이 뽑을 수 있는 열 반환
    }

    public static void bfs(int[][] land, int x, int y) {
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{x, y});
        visited[x][y] = true;

        Set<Integer> set = new HashSet<>(); // 석유 덩어리가 걸쳐 있는 열 기록
        int count = 1; // 석유량 카운트

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];
            set.add(cy);

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (land[nx][ny] == 1 && !visited[nx][ny]) {
                        q.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        count++;
                    }
                }
            }
        }

        // 덩어리에 걸쳐 있는 열마다 석유량 더하기
        for (int index : set) {
            oil[index] += count;
        }
    }
}

