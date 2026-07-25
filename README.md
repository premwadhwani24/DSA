# DSA Practice Repository

This repository contains Java solutions for competitive programming and data structures & algorithms problems.
It includes classic contest problems, Infosys sample challenges, graph traversal, string transformation, query processing, pattern generation, and more.

## Unified Contents

### General Java Solutions
- `Graph.java` — DFS traversal on an undirected graph.
- `CP_Flip_Bits.java` — Flip the Bits transformation problem.
- `CP_Vanya_Lanterns.java` — Vanya and Lanterns minimum radius problem.
- `Grid_Shape.java` — Grid shape / geometry-based problem.
- `Number_Pattern.java` — Numeric pattern generation.
- `People_Capacity.java` — Capacity or constraint-based selection problem.
- `Sum_of_Queries.java` — Query sum processing problem.
- `Min_total_travel_cost.java` — Assign 2N employees to two cities and minimize travel cost.
- `Discount.java` — Coupon discount problem placeholder.
- `maximum_weight_possible_frequency_balanced_windows.java` — Maximum total weight for a frequency-dominant subarray.
- `maximum_possible_sum_mode_frequencies_all_K_groups.java` — Maximum total mode frequency sum across K groups.
- `Friends_Restaurant.java` — Maximize restaurant orders under type and doubling constraints.
- `Summer_sell_off.java` — Select the best days to double the profit and maximize total gain.
- `one_remove_max_return.java` — Remove one occurrence of a digit to maximize the remaining number.

### Infosys Hack With Infy Sample Problems
- `Gym_Energy.java` — Sample 1: gym energy exhaustion using each exercise at most twice.
- `Heroes_Villains.java` — Sample 2: minimum prefix of villains to remove for hero victory.
- `Road_Construction.java` — Sample 3: minimum days to make terrain strictly decreasing.
- `Mountain_Array.java` — Sample 4: minimum changes to turn an array into a mountain shape.
- `Sample Questions.pdf` — Problem statements for the Infosys sample set.

## Problem Summaries

### Graph.java
- Performs DFS traversal on a graph represented by an adjacency list.
- Input: number of vertices, number of edges, and each undirected edge pair.
- Output: DFS visit order covering all connected components.

### CP_Flip_Bits.java
- Determines whether string `a` can be transformed into string `b` by inverting prefixes that contain equal numbers of `0` and `1`.
- Input: multiple test cases, string length, string `a`, string `b`.
- Output: `YES` or `NO` for each test case.

### CP_Vanya_Lanterns.java
- Finds the minimum radius needed to cover a road segment using lantern positions.
- Input: lantern count, road length, and lantern positions.
- Output: minimum radius.

### Grid_Shape.java
- Solves a grid geometry problem by analyzing grid shape properties.
- Input and output vary based on the problem specifics.

### Number_Pattern.java
- Prints a numeric pattern based on input size.
- Input: pattern size.
- Output: formatted numeric pattern.

### People_Capacity.java
- Solves a capacity or constraints-based allocation problem.
- Input and output vary depending on the problem details.

### Sum_of_Queries.java
- Processes queries on an array to compute aggregated sums.
- Input: array size, array values, and query operations.
- Output: query results.

### Min_total_travel_cost.java
- Assigns `2N` employees to City A and City B to minimize total travel cost.
- Input: integer `N`, `2N` values for `A`, and `2N` values for `B`.
- Output: minimum total cost.

### Discount.java
- Intended to solve a coupon discount problem.
- Current file is a placeholder and does not contain implementation.

### maximum_weight_possible_frequency_balanced_windows.java
- Finds the maximum total weight of a contiguous subarray where one category is strictly dominant.
- Input: stream length, category values, and weights.
- Output: maximum total weight of a valid window.

### maximum_possible_sum_mode_frequencies_all_K_groups.java
- Splits values into `K` groups to maximize the sum of group mode frequencies.
- Input: array size, group count, and array values.
- Output: maximum possible mode frequency sum.

### Friends_Restaurant.java
- Selects disjoint friend groups to maximize the number of valid restaurant orders.
- Input: test cases, number of friends, friend budgets and planned spends.
- Output: maximum number of valid order groups.

### one_remove_max_return.java
- Removes exactly one specified digit from a number string to maximize the resulting value.
- Input: number string and a digit to remove.
- Output: the lexicographically largest resulting string.

### Gym_Energy.java
- Sample 1: With energy `E` and exercise costs `A[i]`, determine the minimum number of exercises required to reduce energy to `<= 0` using each exercise at most twice.
- Input: `E`, `N`, then `N` exercise drain values.
- Output: minimum number of exercises or `-1`.

### Heroes_Villains.java
- Sample 2: Given `M` heroes with health `H` and `N` villains with health `V[i]`, remove the fewest villains from the front so heroes can defeat the rest.
- Input: `N`, `M`, `H`, then `N` villain health values.
- Output: minimum villains removed.

### Road_Construction.java
- Sample 3: Transform the terrain heights into a strictly downward slope by digging selected segments over days.
- On day `D`, scheduled segments can be reduced by `2^(D-1)` meters.
- Input: `N` and `N` heights.
- Output: minimum days.

### Mountain_Array.java
- Sample 4: Change the least number of elements so the array becomes a mountain.
- Requirements: both ends equal, values rise by exactly 1 toward the center, and a central peak or plateau exists.
- Input: `N` and `N` array values.
- Output: minimum number of changes.

## Infosys Sample Question Coverage
The attached `Sample Questions.pdf` contains 7 sample problems from the Infosys challenge. The repository currently implements the first 4 of those problems.

## How to Build and Run
Compile any Java file using:

```bash
javac <FileName>.java
```

Run the compiled class using:

```bash
java <ClassName>
```

Example:

```bash
javac Mountain_Array.java
java Mountain_Array
```

## Repository Cleanup
This repository now keeps only one unified `README.md` file and removes all secondary README fragments so the documentation is centralized.
