package programmers.lv2;

import java.util.*;

public class 신입사원교육 {
    public static void main(String[] args) {
        int[] ability = {10, 20, 30};
        int number = 2;

        int result = solution(ability, number);

        System.out.println("최종 능력치 총합: " + result);
    }

    public static int solution(int[] ability, int number) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int ab : ability)
            pq.offer(ab); // 초기 능력치 삽입

        while (number-- > 0) {
            int o1 = pq.poll(); // 가장 작은 값
            int o2 = pq.poll(); // 두 번째로 작은 값

            int temp = o1;
            o1 += o2;
            o2 += temp;

            pq.offer(o1);
            pq.offer(o2);
        }

        for (int num : pq)
            answer += num;

        return answer;
    }
}

