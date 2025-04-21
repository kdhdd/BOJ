package 백트래킹;

public class BackTracking1 {
    // 순열
    // 1 ~ 4 숫자
    // 길이가 3인 순열
    static int N = 4;
    static int M = 3;

    // 수열 저장 배열
    static int[] level = new int[M];
    // 방문 배열
    static boolean[] visited = new boolean[N + 1];

    public static void main(String[] args) {
        dfs(0);
    }

    static void dfs(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(level[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int num = 1; num <= N; num++) {
            if (!visited[num]) {
                visited[num] = true;

                level[depth] = num;
                dfs(depth + 1);
                visited[num] = false;
            }
        }
    }
}
