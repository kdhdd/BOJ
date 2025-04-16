package programmers.lv1;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        int n = 12;
        int m = 18;

        int[] result = solution(n, m);

        System.out.println("최대공약수: " + result[0]);
        System.out.println("최소공배수: " + result[1]);
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int divisor = Math.min(n, m);

        // 최대공약수 구하기
        for (int i = divisor; i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                divisor = i;
                break;
            }
        }

        // 최소공배수는 두 수의 곱 / 최대공약수
        int multiple = (n * m) / divisor;

        answer[0] = divisor;
        answer[1] = multiple;

        return answer;
    }
}

