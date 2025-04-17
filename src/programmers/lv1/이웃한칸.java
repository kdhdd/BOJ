package programmers.lv1;

public class 이웃한칸 {
    public static void main(String[] args) {
        String[][] board = {
                {"blue", "red", "blue"},
                {"red", "red", "blue"},
                {"blue", "blue", "red"}
        };

        int h = 1;
        int w = 1;

        int result = solution(board, h, w);

        System.out.println("같은 색 인접 칸 수: " + result);
    }

    public static int solution(String[][] board, int h, int w) {
        int answer = 0;

        // 방향 벡터: 상, 하, 우, 좌
        int[] dh = {-1, 1, 0, 0};
        int[] dw = {0, 0, 1, -1};

        String targetColor = board[h][w]; // 기준 색상

        for (int i = 0; i < 4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            // 배열 범위 체크
            if (h_check >= 0 && h_check < board.length && w_check >= 0 && w_check < board[0].length) {
                // 인접한 칸의 색이 동일하면 카운트
                if (board[h_check][w_check].equals(targetColor)) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
