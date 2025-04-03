import java.util.*;

public class BOJ25516 {
    static ArrayList<ArrayList<Integer>> tree;
    static boolean[] visited;
    static int[] apples;
    static int appleCount = 0;

    static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        k = sc.nextInt();

        tree = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tree.add(new ArrayList<>());
        }
        visited = new boolean[n];

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            tree.get(u).add(v);
            tree.get(v).add(u);
        }

        apples = new int[n];
        for (int i = 0; i < n; i++) {
            apples[i] = sc.nextInt();
        }

        bfs(0, 0);
        System.out.println(appleCount);
    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});

        visited[x] = true;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int node = cur[0];
            int depth = cur[1];

            if (apples[node] == 1) appleCount++;

            if (depth >= k) continue;

            for (int neighbor : tree.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.offer(new int[]{neighbor, depth + 1});
                }
            }
        }
    }
}
