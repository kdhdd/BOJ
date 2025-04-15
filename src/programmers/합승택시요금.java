package programmers;

import java.util.*;

public class 합승택시요금 {
    public static void main(String[] args) {
        int n = 6;
        int s = 4;
        int a = 6;
        int b = 2;
        int[][] fares = {
                {4, 1, 10},
                {3, 5, 24},
                {5, 6, 2},
                {3, 1, 41},
                {5, 1, 24},
                {4, 6, 50},
                {2, 4, 66},
                {2, 3, 22},
                {1, 6, 25}
        };

        int result = solution(n, s, a, b, fares);
        System.out.println("최소 요금: " + result);
    }

    public static int solution(int n, int s, int a, int b, int[][] fares) {
        int[][] map = new int[n + 1][n + 1];
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], 100000 * n); // 충분히 큰 수로 초기화
            map[i][i] = 0;
        }

        // 요금 정보 저장
        for (int[] fare : fares) {
            map[fare[0]][fare[1]] = map[fare[1]][fare[0]] = fare[2];
        }

        // 플로이드-워셜 알고리즘
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
                }
            }
        }

        // 경로 분기 없이 각자 가는 비용
        int answer = map[s][a] + map[s][b];

        // 경로 분기 지점 i를 기준으로 최소값 탐색
        for (int i = 1; i <= n; i++) {
            answer = Math.min(answer, map[s][i] + map[i][a] + map[i][b]);
        }

        return answer;
    }
}

