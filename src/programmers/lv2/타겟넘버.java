package programmers.lv2;

public class 타겟넘버 {
    static int answer = 0;

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        int result = solution(numbers, target);

        System.out.println("타겟 넘버 만들기 경우의 수: " + result);
    }

    public static int solution(int[] numbers, int target) {
        answer = 0; // 정적 변수 초기화 (중복 호출 방지)
        dfs(0, numbers, target, 0);
        return answer;
    }

    private static void dfs(int depth, int[] numbers, int target, int sum) {
        if (depth == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }

        // 현재 숫자를 더하거나 빼는 두 가지 선택
        dfs(depth + 1, numbers, target, sum + numbers[depth]);
        dfs(depth + 1, numbers, target, sum - numbers[depth]);
    }
}
