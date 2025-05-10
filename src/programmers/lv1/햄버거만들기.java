package programmers.lv1;

public class 햄버거만들기 {
    public static void main(String[] args) {

        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int result = solution(ingredient);

        System.out.println("햄버거 개수: " + result);  // 예상 결과: 2
    }

    public static int solution(int[] ingredient) {
        int answer = 0;

        int[] stack = new int[ingredient.length];
        int sp = 0;

        for (int ing : ingredient) {
            stack[sp++] = ing;

            if (sp >= 4) {
                if (stack[sp - 4] == 1 &&
                        stack[sp - 3] == 2 &&
                        stack[sp - 2] == 3 &&
                        stack[sp - 1] == 1) {
                    sp -= 4;
                    answer++;
                }
            }
        }

        return answer;
    }
}

