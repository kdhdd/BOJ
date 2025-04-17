package programmers.lv1;

import java.util.*;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        int[] result = solution(arr);

        System.out.println("결과: " + Arrays.toString(result));
    }

    public static int[] solution(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();

        // 첫 값 넣기
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        // 스택은 역순이므로 배열로 바꾸기 전에 뒤집기
        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
