package 스택_큐_덱;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {

    public static void main(String[] args) {
        // ArrayDeque는 Deque 인터페이스를 구현한 클래스로 기존 Stack 클래스보다 효율적입니다.
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        System.out.println("peek: " + stack.peek());
        System.out.println("pop: " + stack.pop());
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("pop: " + stack.pop());
        System.out.println("스택 상태: " + stack);
    }
}
