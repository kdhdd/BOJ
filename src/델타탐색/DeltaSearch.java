package 델타탐색;

public class DeltaSearch {

    public static void main(String[] args) {
        int[][] map = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 9, 0, 0}, // '9'의 위치 (2, 2)를 기준으로 탐색
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        };

        int rows = map.length;
        int cols = map[0].length;

        // 4방 탐색용 델타 배열 (상, 하, 좌, 우)
        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};

        // 기준 위치 (예: map[2][2] == 9)
        int y = 2;
        int x = 2;

        // 4방향 탐색
        for (int d = 0; d < 4; d++) {
            int ny = y + dy[d]; // 다음 행 위치
            int nx = x + dx[d]; // 다음 열 위치

            // 경계 검사
            if (ny >= 0 && ny < rows && nx >= 0 && nx < cols) {
                // 범위 안이면 해당 좌표와 값 출력
                System.out.println("다음 행 좌표: " + ny + ", 다음 열 좌표: " + nx + ", 값: " + map[ny][nx]);
            }
        }
    }
}
