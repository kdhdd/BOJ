package 해시;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        // 요소 추가 (add)
        System.out.println("10 추가: " + numbers.add(10)); // true
        System.out.println("20 추가: " + numbers.add(20)); // true
        System.out.println("30 추가: " + numbers.add(30)); // true
        System.out.println("초기 집합: " + numbers); // [20, 10, 30]

        // 중복 요소 추가 시도
        System.out.println("20 추가 재시도: " + numbers.add(20)); // false
        System.out.println("중복 후: " + numbers); // [20, 10, 30]

        // 요소 포함 여부 확인
        System.out.println("10 포함? " + numbers.contains(10)); // true
        System.out.println("50 포함? " + numbers.contains(50)); // false

        // 요소 삭제 (remove)
        System.out.println("30 삭제: " + numbers.remove(30)); // true
        System.out.println("삭제 후: " + numbers); // [20, 10]

        // 집합 크기
        System.out.println("크기: " + numbers.size()); // 2

        // 집합 순회 (향상된 for문)
        System.out.println("향상된 for문");
        numbers.forEach(System.out::println);

        // 모든 요소 삭제
        numbers.clear();
        System.out.println("비어있는지? " + numbers.isEmpty()); // true
    }
}
