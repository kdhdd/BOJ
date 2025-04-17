package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class BOJ2164 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 1; i <= n; i++)
            q.offer(i);

        int count = 0;
        while (q.size() > 1) {
            if (count % 2 == 0)
                q.poll();
            else
                q.offer(q.poll());
            count++;
        }

        System.out.println(q.poll());
    }
}
