package programmers.lv2;

import java.util.Arrays;

public class 쿼드압축후개수세기 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,0},
                {1,0,0,0},
                {1,0,0,1},
                {1,1,1,1}
        };

        int[] result = solution(arr);
        System.out.println("결과: " + Arrays.toString(result));
    }

    static int[] answer;

    public static int[] solution(int[][] arr) {
        answer = new int[2];
        Quad(arr, 0, 0, arr.length);
        return answer;
    }

    public static boolean isSame(int[][] arr, int x, int y, int n, int val) {
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (arr[i][j] != val)
                    return false;
            }
        }
        return true;
    }

    public static void Quad(int[][] arr, int x, int y, int n) {
        if (isSame(arr, x, y, n, arr[x][y])) {
            answer[arr[x][y]]++;
            return;
        }

        n /= 2;
        Quad(arr, x, y, n);               // 1사분면
        Quad(arr, x, y + n, n);           // 2사분면
        Quad(arr, x + n, y, n);           // 3사분면
        Quad(arr, x + n, y + n, n);       // 4사분면
    }
}

