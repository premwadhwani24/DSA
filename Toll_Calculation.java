import java.util.*;
public class Toll_Calculation {
    static class Edge {
        int to;
        int weight;
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
    static ArrayList<Edge>[] graph;
    static long answer;
    static void dfs(int city, int destination, int couponsLeft, long cost, boolean[] visited) {
        if (cost >= answer) {
            return;
        }
        if (city == destination) {
            answer = Math.min(answer, cost);
            return;
        }
        visited[city] = true;
        for (Edge edge : graph[city]) {
            int nextCity = edge.to;
            int toll = edge.weight;
            if (!visited[nextCity]) {
                dfs(nextCity, destination, couponsLeft, cost + toll, visited);
                if (couponsLeft > 0) {
                    dfs(nextCity, destination, couponsLeft - 1, cost, visited);
                }
            }
        }
        visited[city] = false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph[u].add(new Edge(v, w));
            graph[v].add(new Edge(u, w));
        }
        answer = Long.MAX_VALUE;

        boolean[] visited = new boolean[n + 1];
        dfs(1, n, k, 0, visited);
        if (answer == Long.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(answer);
        }
        sc.close();
    }
}