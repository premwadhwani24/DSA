<<<<<<< HEAD
# Infosys Hack With Infy Sample Problems

This repository contains Java solutions and analysis for the Infosys "Hack With Infy" sample questions.

## Current Implementations

- `Gym_Energy.java` — Sample 1: minimum exercises to reach zero energy, with each exercise usable at most twice.
- `Heroes_Villains.java` — Sample 2: minimum prefix of villains to remove so heroes with fixed health can win.
- `Road_Construction.java` — Sample 3: minimum days to make terrain strictly downward-sloping with day-based digging power.

## Sample Questions Analyzed

The file `Sample Questions.pdf` defines the following problems:

1. **Gym Energy**
   - Input: energy `E`, number of exercises `N`, and exercise drain values `A[i]`.
   - Task: perform a minimum number of exercises so that energy `E` becomes `<= 0`.
   - Constraint: each exercise can be used at most twice.
   - Output: minimum exercise count or `-1` if impossible.
   - Topic: greedy selection, sorting, simulation.

2. **Heroes vs Villains**
   - Input: number of villains `N`, number of heroes `M`, hero health `H`, and villain health values `V[i]`.
   - Task: remove the smallest number of villains from the front such that the remaining villains can be defeated by `M` heroes with health `H`.
   - Key behavior: a hero loses health equal to defeated villain health; equal health means both are defeated.
   - Output: minimum villains removed.
   - Topic: binary search, simulation, greedy strategy.

3. **Road Construction**
   - Input: terrain heights `L[i]` for `N` segments.
   - Task: reduce selected segments across days so the resulting sequence is strictly decreasing.
   - Digging rule: on day `D`, any scheduled segment can be reduced by `2^(D-1)` meters.
   - Output: minimum number of days required.
   - Topic: binary search on answer, monotonic feasibility, bit-based reductions.

4. **Mountain Array Transformation**
   - Input: array `A` of length `N`.
   - Task: change the fewest elements so that the array becomes a mountain shape:
     - both ends equal,
     - values increase by exactly 1 toward the center from both sides,
     - a center peak exists.
   - Output: minimum number of changes.
   - Topic: array symmetry, pattern matching, minimum edit cost.

5. **Interesting String Pieces**
   - Input: string `S`.
   - Task: reorder characters globally and cut `S` into the maximum number of equal contiguous pieces.
   - Key insight: the maximum number of pieces is limited by character frequency divisibility.
   - Output: maximum piece count.
   - Topic: string frequency, greatest common divisor, combinatorics.

6. **One Swap Lexicographically Smallest**
   - Input: array `A` and distance limit `K`.
   - Task: perform at most one swap between elements whose indices differ by at most `K`.
   - Goal: minimize the resulting array lexicographically.
   - Output: resulting array after the best one swap.
   - Topic: lexicographic optimization, sliding window minimum, greedy swap.

7. **Restaurant Dish Sequence**
   - Input: `N` dishes with types described by `Arr[i]`.
   - Task: select a sequence of orders using distinct dish types, where each order contains twice as many dishes as the previous order.
   - Constraint: each dish type can be used only once.
   - Output: maximum total dishes eaten.
   - Topic: frequency counts, greedy selection, doubling sequence.

## Repository Status

- The PDF contains 7 sample problems.
- Java implementations currently cover the first 3 problems.
- Additional implementations for the remaining problems can be added here.

## Run Instructions

Compile any Java file with:

```bash
javac <FileName>.java
```

Run the compiled program with:

```bash
java <ClassName>
```

Example:

```bash
javac Gym_Energy.java
java Gym_Energy
=======
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
- `Min_total_travel_cost.java` — Assign 2N employees to two cities to minimize total travel cost using a special City B cost formula.
- `Discount.java` — Choose the best coupon to minimize total chocolate purchase cost by getting the cheapest bar free among selected bars.
- `maximum_weight_possible_frequency_balanced_windows.java` — Find the maximum total weight of subarrays where some value occurs more than half the time.
- `maximum_possible_sum_mode_frequencies_all_K_groups.java` — Compute the maximum total mode frequencies sum when splitting into K groups.

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

## Solution: Minimum Total Travel Cost

- File: `Min_total_travel_cost.java`
- Problem: assign exactly `N` of `2N` employees to City A and the remaining `N` employees to City B so that the total travel cost is minimized.
- Approach: compute each employee's City A cost as `A[i]`, City B cost as `min(A[i], B[i]) + B[i]`, then sort employees by `A[i] - BCost[i]` and assign the `N` cheapest-to-assign employees to City A and the rest to City B.

### Problem Description

There are `2N` employees and two cities, City A and City B. Exactly `N` employees must be assigned to each city.

For every employee `i`:
- Cost to City A is `A[i]`.
- Cost to City B is `min(A[i], B[i]) + B[i]`, where `B[i]` is the travel cost from the transit hub to City B.

Your task is to choose assignments so that the total travel cost is minimized.

### Input Format

- The first line contains integer `N`.
- The second line contains `2N` space-separated integers `A[0] ... A[2N-1]`.
- The third line contains `2N` space-separated integers `B[0] ... B[2N-1]`.

### Output

- Print a single integer representing the minimum total travel cost.

### Constraints

- `1 ≤ N ≤ 10^5`
- `1 ≤ A[i], B[i] ≤ 10^5`

### Example

Input:
```
2
10 30 50 20
20 10 40 30
```

Output:
```
120
```

Explanation:
- City B cost for each employee is `min(A[i], B[i]) + B[i]`.
- Assign employees 3 and 4 to City A, and employees 1 and 2 to City B for minimum total cost.

## Solution: Discounts

- File: `Discount.java`
- Problem: select one coupon to minimize total spending on `n` chocolate bars, where each coupon lets you choose `q_i` bars and pay only for the `q_i-1` most expensive of them.
- Approach: sort the bar prices, precompute prefix sums, and for each coupon compute `total - price[n - q_i]` to remove the cheapest bar among the chosen `q_i` most expensive bars.

### Problem Description

You want to buy all `n` chocolate bars. You have `m` coupons, and coupon `i` lets you buy `q_i` bars while paying only for the `q_i-1` most expensive ones among them.

For each coupon, determine the minimum amount of money you must pay if you use that coupon optimally and purchase the remaining bars at full price.

### Input Format

- The first line contains integer `n`.
- The second line contains `n` integers `a_1, a_2, ..., a_n`.
- The third line contains integer `m`.
- The fourth line contains `m` integers `q_1, q_2, ..., q_m`.

### Output

- Print `m` integers, where the `i`-th output is the minimum amount to pay when using coupon `i`.

### Constraints

- `2 ≤ n ≤ 3⋅10^5`
- `1 ≤ a_i ≤ 10^9`
- `1 ≤ m ≤ n-1`
- `2 ≤ q_i ≤ n`
- all `q_i` are pairwise distinct

### Example

Input:
```
7
7 1 3 1 4 10 8
2
3 4
```

Output:
```
27
30
```

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
- Problem: find the maximum total weight of a frequency-balanced window in a stream of packets.
- Approach: enumerate all windows, maintain category frequencies and weight sums, and record the maximum weight when a category strictly dominates the window.

### Problem Description

In satellite signal processing, a stream of `N` data packets is received. Each packet has:
- a category `A[i]` in the range `[0, C-1]`
- a weight `W[i]`

A window `[L, R]` is a contiguous subarray of packets. A window is frequency-balanced if some category appears more than half the time in that window.

Your task is to compute the maximum total window weight among all frequency-balanced windows.

### Input Format

- The first line contains an integer `N`.
- The second line contains an integer `C`.
- The next `N` lines each contain an integer representing `A[i]`.
- The next `N` lines each contain an integer representing `W[i]`.

### Output

- Print a single integer representing the maximum total weight of any frequency-balanced window.

### Constraints

- `1 ≤ N ≤ 10^5`
- `1 ≤ C ≤ 10^5`
- `0 ≤ A[i] < C`
- `1 ≤ W[i] ≤ 10^9`

### Example

Input:
```
7
3
1
1
2
1
0
1
1
4
2
3
5
1
6
2
```

Output:
```
23
```

## Solution: Maximum Possible Sum Mode Frequencies All K Groups

- File: `maximum_possible_sum_mode_frequencies_all_K_groups.java`
- Problem: partition an array into exactly `K` non-empty contiguous groups to maximize the sum of mode frequencies of each group.
- Approach: recursively generate valid partitions, compute the most frequent element count for each segment, and maximize the total score.

### Problem Description

You are given an array `a` of size `N` and an integer `K`. Divide the array into exactly `K` non-empty contiguous groups. The score of a group is the frequency of the most frequent element in that group.

Your task is to maximize the sum of the scores of all `K` groups.

### Input Format

- The first line contains an integer `N`.
- The second line contains an integer `K`.
- The next `N` lines each contain one integer `a[i]`.

### Output

- Print a single integer representing the maximum total score.

### Constraints

- `1 ≤ N ≤ 500`
- `1 ≤ K ≤ N`
- `1 ≤ a[i] ≤ 10^5`

### Example

Input:
```
7
2
1
2
2
3
1
1
1
```

Output:
```
5
>>>>>>> origin/main
```
