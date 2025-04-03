import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ21736 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static String[][] campus;
    static boolean[][] visited;
    static int friend = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();
        campus = new String[row][col];

        for (int i = 0; i < row; i++) {
            String[] arr = sc.nextLine().split("");
            campus[i] = arr;
        }
        visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (campus[i][j].equals("I"))
                    bfs(i, j);
            }
        }

        System.out.println(friend == 0 ? "TT" : friend);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});

        visited[x][y] = true;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int row = cur[0];
            int col = cur[1];
            for (int k = 0; k < 4; k++) {
                int nx = row + dx[k];
                int ny = col + dy[k];
                if (nx < 0 || ny < 0 || nx >= campus.length || ny >= campus[0].length)
                    continue;

                if (!campus[nx][ny].equals("X") && !visited[nx][ny]) {
                    if (campus[nx][ny].equals("P"))
                        friend++;

                    visited[nx][ny] = true;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
    }
}
