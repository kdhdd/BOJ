package programmers;

import java.util.*;

public class 특이한정렬 {
    public static void main(String[] args) {
        int[] numlist = {1, 2, 3, 4, 5, 6};
        int n = 4;

        int[] result = solution(numlist, n);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] numlist, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> Math.abs(a - n) == Math.abs(b - n) ? b - a : Math.abs(a - n) - Math.abs(b - n)
        );

        for (int num : numlist) {
            pq.add(num);
        }

        int index = 0;
        while (!pq.isEmpty()) {
            numlist[index++] = pq.poll();
        }

        return numlist;
    }
}

