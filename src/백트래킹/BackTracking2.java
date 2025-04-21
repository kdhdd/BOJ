package 백트래킹;

public class BackTracking2 {
    static int N = 4;
    static int M = 3;
    static int[] level = new int[M];

    public static void main(String[] args) {
        dfs(0, 1);
    }

    static void dfs(int depth, int cur) {

        if (depth == M) {
            for (int node : level) {
                System.out.print(node + " ");
            }
            System.out.println();
            return;
        }

        for (int num = cur; num < N + 1; num++) {
            level[depth] = num;
            dfs(depth + 1, num + 1);
        }
    }
}
