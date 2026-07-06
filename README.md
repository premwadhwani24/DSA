# DSA Practice

## Solution 1: Graph.java

This file contains a Java program that performs a Depth-First Search (DFS) traversal on a graph. The program takes the number of vertices, number of edges, and the edges from the user, builds the graph, and prints the DFS traversal order.

## What is DFS?

Depth-First Search is a graph traversal technique that starts from a node and explores as far as possible along one branch before backtracking. It is commonly used to visit all nodes in a connected or disconnected graph.

## Logic Explained

### 1. Graph Representation
The graph is stored using an adjacency list:
- `ArrayList<ArrayList<Integer>> adj`
- Each index of the list represents a vertex.
- The inner list contains all the neighbors of that vertex.

This representation is efficient for storing graphs, especially when the number of edges is not too large.

### 2. DFS Helper Method
The method `dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> ans)` is the core of the traversal.

It works like this:
1. Mark the current node as visited using `vis[node] = true`.
2. Add the current node to the answer list.
3. Visit each neighbor of the current node.
4. If a neighbor has not been visited, recursively call DFS on that neighbor.

This ensures that the traversal moves deep into one path before moving to another branch.

### 3. Main DFS Function
The method `dfs(ArrayList<ArrayList<Integer>> adj)` starts the traversal process.

It:
1. Finds the total number of vertices `V`.
2. Creates a boolean array `vis` to track visited nodes.
3. Creates an empty answer list `ans`.
4. Calls DFS starting from vertex `0`.
5. If some nodes are still unvisited, it starts DFS from those nodes too.

This step is important because the graph may be disconnected. Without it, some vertices might be missed.

### 4. Input Handling
In `main`, the user provides:
- Number of vertices
- Number of edges
- Each edge as a pair `(u v)`

The program adds each edge in both directions because this is an undirected graph:
- `adj.get(u).add(v)`
- `adj.get(v).add(u)`

### 5. Output
After traversal, the program prints the DFS order of the vertices.

## Example

Input:
```text
Enter number of vertices: 5
Enter number of edges: 4
Enter the edges (u v):
0 1
0 2
1 3
1 4
```

Output:
```text
DFS Traversal:
0 1 3 4 2
```

## Time Complexity
- DFS visits each vertex and edge at most once.
- Time complexity: O(V + E)
- Space complexity: O(V)

## How to Run
```bash
javac Graph.java
java Graph
```
