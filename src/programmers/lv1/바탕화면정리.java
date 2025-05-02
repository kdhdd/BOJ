package programmers.lv1;

import java.util.*;

public class 바탕화면정리 {
    public static void main(String[] args) {
        String[] wallpaper = {
                ".#...",
                "..#..",
                "...#."
        };

        int[] result = solution(wallpaper);

        System.out.println("파일 드래그 범위: " + Arrays.toString(result));
    }

    public static int[] solution(String[] wallpaper) {
        int n = wallpaper.length;
        int m = wallpaper[0].length();

        // '#'의 범위를 찾기 위한 초기값 설정
        int lux = 51, luy = 51;  // 가장 위/왼쪽 좌표 (최소값)
        int rdx = 0, rdy = 0;    // 가장 아래/오른쪽 좌표 (최대값)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    luy = Math.min(luy, i);
                    lux = Math.min(lux, j);
                    rdy = Math.max(rdy, i);
                    rdx = Math.max(rdx, j);
                }
            }
        }

        return new int[]{luy, lux, rdy + 1, rdx + 1}; // 드래그 범위는 오른쪽/아래쪽 열려 있으므로 +1
    }
}
