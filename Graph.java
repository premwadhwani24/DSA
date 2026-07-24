import java.util.*;

class Graph {
    public void dfs(int node, ArrayList<ArrayList<Integer>> adj,boolean[] vis, ArrayList<Integer> ans) {

        vis[node] = true;
        ans.add(node);

        for (int i = 0; i < adj.get(node).size(); i++) {
            int neighbour = adj.get(node).get(i);

            if (!vis[neighbour]) {
                dfs(neighbour, adj, vis, ans);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {

        int V = adj.size();
        boolean[] vis = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();

        dfs(0, adj, vis, ans);

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, adj, vis, ans);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        System.out.println("Enter the edges (u v):");

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        Graph g = new Graph();

        ArrayList<Integer> result = g.dfs(adj);

        System.out.println("DFS Traversal:");
        for (int node : result) {
            System.out.print(node + " ");
        }

        sc.close();
    }
}
