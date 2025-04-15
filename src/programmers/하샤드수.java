package programmers;

public class 하샤드수 {
    public static void main(String[] args) {
        int x = 18;

        boolean result = solution(x);

        System.out.println("하샤드 수인가요? " + result);
    }

    public static boolean solution(int x) {
        int num = 0;
        int number = x;

        // 자릿수 합 계산
        while (number > 0) {
            num += number % 10;
            number /= 10;
        }

        return x % num == 0;
    }
}
