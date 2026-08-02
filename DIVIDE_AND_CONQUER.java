import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DIVIDE_AND_CONQUER  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read n (number of people) and m (number of relationships)
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Array to store starting nodes of edges
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        // Read the second 'm' value
        int m2 = sc.nextInt();

        // Array to store ending nodes of edges
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        // Build Adjacency List for the graph
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = a[i];
            int v = b[i];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // Find the maximum component size
        boolean[] visited = new boolean[n + 1];
        int maxClassroomsNeeded = 1;

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                int currentComponentSize = dfs(i, adj, visited);
                if (currentComponentSize > maxClassroomsNeeded) {
                    maxClassroomsNeeded = currentComponentSize;
                }
            }
        }

        // Print the answer
        System.out.println(maxClassroomsNeeded);

        sc.close();
    }

    // DFS helper to count the total nodes in a connected component
    private static int dfs(int u, List<List<Integer>> adj, boolean[] visited) {
        visited[u] = true;
        int count = 1;

        for (int neighbor : adj.get(u)) {
            if (!visited[neighbor]) {
                count += dfs(neighbor, adj, visited);
            }
        }

        return count;
    }
}