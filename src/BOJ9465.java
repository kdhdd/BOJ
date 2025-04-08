import java.util.Arrays;
import java.util.Scanner;

public class BOJ9465 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            sc.nextLine();

            int[][] dp = new int[2][n];
            for (int i = 0; i < 2; i++)
                Arrays.fill(dp[i], 0);

            int[][] arr = new int[2][n];
            for (int i = 0; i < 2; i++) {
                String[] line = sc.nextLine().split(" ");
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(line[j]);
                }
            }

            dp[0][0] = arr[0][0];
            dp[1][0] = arr[1][0];
            if (n == 1) {
                System.out.println(Math.max(dp[0][0], dp[1][0]));
                continue;
            }

            dp[0][1] = arr[1][0] + arr[0][1];
            dp[1][1] = arr[0][0] + arr[1][1];
            if (n == 2) {
                System.out.println(Math.max(dp[0][1], dp[1][1]));
                continue;
            }

            for (int i = 2; i < n; i++) {
                dp[0][i] = Math.max(dp[1][i-2], dp[1][i-1]) + arr[0][i];
                dp[1][i] = Math.max(dp[0][i-2], dp[0][i-1]) + arr[1][i];
            }
            System.out.println(Math.max(dp[0][n-1], dp[1][n-1]));
        }

    }
}
