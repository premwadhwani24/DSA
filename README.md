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
- `Rod_Cutting.java` — Classic rod cutting dynamic programming problem to maximize profit.
- `People_Capacity.java` — Capacity or constraint-based selection problem.
- `Sum_of_Queries.java` — Query sum processing problem.
- `Min_total_travel_cost.java` — Assign 2N employees to two cities and minimize travel cost.
- `First_Missing_Positive.java` — Finds the smallest missing positive integer in O(n) time and O(1) extra space.
- `Discount.java` — Coupon discount problem placeholder.
- `Variable_remaining.java` — Computes the edit distance between two strings and converts it into a remaining discount value.
- `MinimumClassesUsingBFS.java` — Finds the minimum number of classes needed by treating the input relationships as an undirected graph and using BFS over connected components.
- `DIVIDE_AND_CONQUER.java` — Computes the largest connected component size in a graph to determine how many groups or classrooms are needed.
- `FindAdditionalIds.java` — Finds IDs present in the second list but missing from the first list.
- `maximum_weight_possible_frequency_balanced_windows.java` — Maximum total weight for a frequency-dominant subarray.
- `maximum_possible_sum_mode_frequencies_all_K_groups.java` — Maximum total mode frequency sum across K groups.
- `Friends_Restaurant.java` — Maximize restaurant orders under type and doubling constraints.
- `Summer_sell_off.java` — Select the best days to double the profit and maximize total gain.
- `one_remove_max_return.java` — Remove one occurrence of a digit to maximize the remaining number.
- `Beauty_Every_Subarray.java` — Compute the beauty value for every subarray of size k using a sliding window and frequency counting.
- `Count_Possible_Messages.java` — Count the number of possible text messages represented by a pressed-key string using dynamic programming.
- `Maximum_Sum_Mode_Frequencies.java` — Divide the array into K contiguous groups to maximize the sum of each group’s mode frequency.
- `Min_Swaps_Array.java` — Minimum swaps needed to make all `1`s form one contiguous segment in a binary array.
- `Longest_Common_Subsequence_K_Replacements.java` — Maximum length of a common subsequence when up to K mismatched pairs may be treated as replacements.
- `Longest_subarray_delete_one.java` — Find the longest contiguous subarray with at most one zero in a binary array.
- `Minimum_delection.java` — Minimum deletions needed so that all remaining distinct values have unique frequencies.

### Infosys Hack With Infy Sample Problems
- `Gym_Energy.java` — Sample 1: gym energy exhaustion using each exercise at most twice.
- `Heroes_Villains.java` — Sample 2: minimum prefix of villains to remove for hero victory.
- `Road_Construction.java` — Sample 3: minimum days to make terrain strictly decreasing.
- `Mountain_Array.java` — Sample 4: minimum changes to turn an array into a mountain shape.
- `Toll_Calculation.java` — Computes the minimum toll cost from city 1 to city N using at most K coupon-based free rides.
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

### Rod_Cutting.java
- Solves the rod cutting problem using dynamic programming.
- Input: rod length and an array of prices for each piece length.
- Output: the maximum obtainable value from cutting the rod.
- Approach: computes the best value for every prefix length using a DP table.

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

### First_Missing_Positive.java
- Solves the classic first missing positive problem by placing each value in its correct index when possible.
- Input: an unsorted integer array.
- Output: the smallest positive integer missing from the array.
- Approach: uses in-place rearrangement to achieve O(n) time and O(1) extra space.

### Discount.java
- Intended to solve a coupon discount problem.
- Current file is a placeholder and does not contain implementation.

### Variable_remaining.java
- Computes the minimum number of edit operations needed to transform one string into another using dynamic programming.
- Input: two strings entered by the user.
- Output: edit distance and the remaining discount after applying the formula $5000 - 5 \times \text{editDistance}$.
- Approach: builds a DP table over prefixes of the two strings to evaluate insert, delete, and replace operations.

### MinimumClassesUsingBFS.java
- Models student relationships as an undirected graph and finds the largest connected component size using BFS.
- Input: number of students, number of relationships, and each relationship pair.
- Output: the minimum number of classes required to separate all students so that no connected pair is in the same class.
- Approach: explores each connected component with BFS and returns the maximum component size.

### DIVIDE_AND_CONQUER.java
- Treats the input relationships as an undirected graph and counts the size of each connected component.
- Input: number of people, number of relationships, and the relationship pairs.
- Output: the largest component size, which represents the maximum number of people that must stay together.
- Approach: builds an adjacency list and uses DFS to explore each connected component.

### FindAdditionalIds.java
- Compares two integer lists and returns the values that appear in the second list but not in the first.
- Input: sizes and elements of two arrays.
- Output: the list of additional IDs.
- Approach: checks each element of the second list against the first list and collects the unmatched values.

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

### Beauty_Every_Subarray.java
- Computes the beauty value for every subarray of length `k` based on the `x`-th smallest value in the window.
- Input: integer array, window size `k`, and threshold `x`.
- Output: an array of beauty values for all sliding windows.
- Approach: maintains a frequency array while sliding the window to achieve efficient processing.

### Count_Possible_Messages.java
- Counts the total number of text messages that can produce a given pressed-key sequence.
- Input: a string of digits from `2` to `9`.
- Output: the number of possible messages modulo $10^9 + 7$.
- Approach: uses dynamic programming over runs of equal digits and multiplies the counts for each run.

### Maximum_Sum_Mode_Frequencies.java
- Partitions an array into exactly `K` non-empty contiguous groups to maximize the sum of each group’s mode frequency.
- Input: array size `N`, group count `K`, and `N` integers.
- Output: the maximum possible total score.
- Approach: uses dynamic programming with prefix-based frequency scoring for each subarray.

### Min_Swaps_Array.java
- Given a binary array, find the minimum number of swaps required to bring all `1`s together into one contiguous segment.
- If the array contains no `1`, the answer is `0`.
- Input: array size `n`, followed by `n` values that are either `0` or `1`.
- Output: the minimum number of swaps.
- Approach: uses a sliding window of size equal to the number of `1`s and counts how many `1`s are inside each window.

### Longest_Common_Subsequence_K_Replacements.java
- Given two lowercase strings and an integer `K`, find the maximum length of a common subsequence when up to `K` mismatched pairs may be treated as replacements.
- Input: strings `S`, `T`, and integer `K`.
- Output: the maximum possible subsequence length.
- Approach: uses dynamic programming over the two strings and the remaining replacement budget.

### Minimum_delection.java
- Given an integer array, delete the minimum number of elements so that all remaining distinct values have different frequencies.
- If all elements are the same, the answer is `0`.
- Input: array size `N`, followed by `N` integers.
- Output: the minimum number of deletions required.
- Approach: counts frequencies, sorts them, and greedily assigns unique frequency values while avoiding duplicates.

### Longest_subarray_delete_one.java
- Given a binary array, find the longest contiguous subarray that contains at most one `0`.
- Input: array size `N`, followed by `N` binary values.
- Output: the maximum length of a valid subarray.
- Approach: uses a sliding window with a zero counter to maintain the longest valid window.

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

### Toll_Calculation.java
- Computes the minimum possible toll cost to travel from city `1` to city `N`.
- You may use up to `K` coupons that make a road segment free, and each route is explored with DFS while tracking the remaining coupons.
- Input: `N`, `M`, `K`, followed by `M` undirected road edges with toll values.
- Output: the minimum total toll cost, or `-1` if the destination is unreachable.

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
