package programmers.lv1;

public class 실습용로봇 {
    public static void main(String[] args) {
        String command = "GRGLGRG";

        int[] result = solution(command);

        System.out.println("최종 위치: (" + result[0] + ", " + result[1] + ")");
    }

    public static int[] solution(String command) {
        // 방향: 0: ↑, 1: →, 2: ↓, 3: ←
        int[] dx = {0, 1, 0, -1};  // x 방향 이동
        int[] dy = {1, 0, -1, 0};  // y 방향 이동

        int x = 0, y = 0; // 시작 좌표
        int idx = 0;      // 방향 인덱스 (처음은 ↑)

        for (char ch : command.toCharArray()) {
            switch (ch) {
                case 'R':
                    idx = (idx + 1) % 4; // 오른쪽으로 90도
                    break;
                case 'L':
                    idx = (idx + 3) % 4; // 왼쪽으로 90도 (== -1 mod 4)
                    break;
                case 'G':
                    x += dx[idx]; // 현재 방향으로 전진
                    y += dy[idx];
                    break;
                case 'B':
                    x -= dx[idx]; // 현재 방향으로 후진
                    y -= dy[idx];
                    break;
            }
        }

        return new int[]{x, y};
    }
}

