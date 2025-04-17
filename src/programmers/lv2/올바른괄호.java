package programmers.lv2;

import java.util.*;

public class 올바른괄호 {
    public static void main(String[] args) {
        String s = "()()";

        boolean result = solution(s);

        System.out.println("올바른 괄호 문자열인가요? " + result);
    }

    public static boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                // 닫는 괄호일 때
                if (stack.isEmpty()) {
                    return false; // 짝이 맞지 않음
                } else {
                    stack.pop(); // 짝 맞는 여는 괄호 제거
                }
            }
        }

        // 모두 짝이 맞았으면 스택이 비어 있어야 함
        return stack.isEmpty();
    }
}
