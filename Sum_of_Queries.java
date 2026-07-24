import java.util.*;
public class Sum_of_Queries {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static ArrayList<Integer> component;
    static void dfs(int node) {
        visited[node] = true;
        component.add(node);

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int t = sc.nextInt(); 
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        long answer = 0;
        while (q-- > 0) {
            int type = sc.nextInt();
            if (type == 1) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                graph[u].add(v);
                graph[v].add(u);
            } else {
                int u = sc.nextInt();
                int dummy = sc.nextInt(); 
                visited = new boolean[n + 1];
                component = new ArrayList<>();
                dfs(u);
                Collections.sort(component);
                int ranges = 0;
                if (component.size() > 0) {
                    ranges = 1;
                    for (int i = 1; i < component.size(); i++) {
                        if (component.get(i) != component.get(i - 1) + 1) {
                            ranges++;
                        }
                    }
                }
                answer += ranges;
            }
        }
        System.out.println(answer);
        sc.close();
    }
}