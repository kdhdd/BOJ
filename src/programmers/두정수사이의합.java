package programmers;

public class 두정수사이의합 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        long result = solution(a, b);

        System.out.println("a부터 b까지의 합: " + result);
    }

    public static long solution(int a, int b) {
        long answer = 0;

        if (a > b) {
            int plum = a;
            a = b;
            b = plum;
        }

        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }
}

