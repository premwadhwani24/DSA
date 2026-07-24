# DSA Practice

A collection of Java practice solutions for data structures and algorithms problems.

## Repository Overview
This repository contains Java programs solving common competitive programming and DSA problems. It includes graph algorithms, string transformation, query processing, pattern generation, and more.

## Included Files
- `Graph.java` — DFS traversal on an undirected graph.
- `CP_Flip_Bits.java` — Solve the "Flip the Bits" transformation problem.
- `CP_Vanya_Lanterns.java` — Solve the "Vanya and Lanterns" minimum radius problem.
- `Grid_Shape.java` — Grid shape or geometry-based solution.
- `Number_Pattern.java` — Number pattern generation or analysis.
- `People_Capacity.java` — People capacity or constraint-based solution.
- `Sum_of_Queries.java` — Query sum processing logic.
- `maximum_weight_possible_frequency_balanced_windows.java` — Find the maximum total weight of subarrays where some value occurs more than half the time.

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
Compile and run the desired Java file. For example:

```bash
javac Graph.java
java Graph
```

For other files, replace `Graph.java` with the desired filename:

```bash
javac CP_Flip_Bits.java
java CP_Flip_Bits
```

## Solution: Friends and the Restaurant

- File: `Friends_Restaurant.java`
- Problem: maximize the number of non-intersecting groups of at least two friends such that each group's total budget is at least the group's total planned spend.
- Approach: compute difference `y_i - x_i` for each friend, sort differences, then greedily pair the smallest and largest remaining differences to form valid groups.

### Problem Description

A group of `n` friends wants to visit a restaurant across several days. Each friend `i` plans to spend `x_i` burles and has `y_i` burles available. Each day, a group of at least two friends visits the restaurant, and friends cannot appear in more than one group. A group is valid only if the sum of budgets in the group is at least the sum of planned spending in the group. The goal is to maximize the number of such groups.

### Input Format

- `t`: number of test cases
- for each test case:
  - `n`: number of friends
  - line of `n` integers `x_1 x_2 ... x_n`
  - line of `n` integers `y_1 y_2 ... y_n`

### Output

- For each test case, print the maximum number of days the friends can visit the restaurant.
- Print `0` if no valid group of at least two friends can be formed.

## Solution: Maximum Weight Possible Frequency Balanced Windows

- File: `maximum_weight_possible_frequency_balanced_windows.java`
- Problem: find the maximum total weight of any subarray where some value appears more than half the time.
- Approach: brute-force all subarrays, track frequency of values and the maximum frequency, and update the maximum sum when the subarray has a majority value.

### Problem Description

Given an array `A` and a weight array `W`, compute the maximum sum of weights over all subarrays in which some element of `A` appears strictly more than half of the subarray's length.

### Input Format

- `n`: number of elements in the arrays
- `c`: unused second input value
- line of `n` integers for `A`
- line of `n` integers for `W`

### Output

- Print the maximum total weight among all valid subarrays.
