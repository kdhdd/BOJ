package programmers.lv2;

public class 체육대회 {
    public static void main(String[] args) {
        int[][] ability = {
                {40, 10, 10},
                {20, 5, 0},
                {30, 20, 20},
                {70, 0, 70}
        };

        int result = solution(ability);

        System.out.println("최대 능력치 합: " + result);
    }

    static int N, M;
    static int[][] adj;
    static boolean[] visited;
    static int max;

    public static int solution(int[][] ability) {
        N = ability.length;     // 총 사람 수
        M = ability[0].length;  // 종목 수

        adj = ability;
        max = Integer.MIN_VALUE;
        visited = new boolean[N];

        dfs(0, 0);

        return max;
    }

    public static void dfs(int depth, int sum) {
        // 모든 종목에 사람을 배정했을 때
        if (depth == M) {
            max = Math.max(max, sum);
            return;
        }

        // depth는 종목 인덱스
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(depth + 1, sum + adj[i][depth]); // i번째 사람을 depth 종목에 배정
                visited[i] = false; // 백트래킹
            }
        }
    }
}
