import java.util.*;

public class MinimumClassesUsingBFS {

    public static int minimumClasses(int n, List<Integer> a, List<Integer> b) {

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Create Graph
        for (int i = 0; i < a.size(); i++) {
            int u = a.get(i);
            int v = b.get(i);

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n + 1];
        int answer = 1;

        // BFS for every connected component
        for (int i = 1; i <= n; i++) {

            if (!visited[i]) {

                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i] = true;

                int count = 0;

                while (!q.isEmpty()) {

                    int current = q.poll();
                    count++;

                    for (int next : graph.get(current)) {

                        if (!visited[next]) {
                            visited[next] = true;
                            q.add(next);
                        }
                    }
                }

                answer = Math.max(answer, count);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.print("Enter number of relationships: ");
        int m = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        System.out.println("Enter the relationships:");

        for (int i = 0; i < m; i++) {
            a.add(sc.nextInt());
            b.add(sc.nextInt());
        }

        int result = minimumClasses(n, a, b);

        System.out.println("Minimum Classes Required: " + result);

        sc.close();
    }
}