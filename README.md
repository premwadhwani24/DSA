# DSA Practice

A collection of Java practice solutions for data structures and algorithms problems.

## Repository Overview
This repository contains Java programs solving common competitive programming and DSA problems. It includes graph algorithms, string transformation, query processing, pattern generation, and more.

## Included Files
- `Graph.java`
- `CP_Flip_Bits.java`
- `CP_Vanya_Lanterns.java`
- `Grid_Shape.java`
- `Number_Pattern.java`
- `People_Capacity.java`
- `Sum_of_Queries.java`
- `Min_total_travel_cost.java`
- `Discount.java`
- `maximum_weight_possible_frequency_balanced_windows.java`
- `maximum_possible_sum_mode_frequencies_all_K_groups.java`
- `Friends_Restaurant.java`
- `one_remove_max_return.java`
- `Gym_Energy.java`
- `Heroes_Villains.java`
- `Road_Construction.java`
- `Mountain_Array.java`
- `Sample Questions.pdf`

## Infosys Hack With Infy Sample Problems

This repository also includes sample problems from the Infosys Hack With Infy challenge.

### Current Implementations

- `Gym_Energy.java` — Sample 1: minimum exercises to reach zero energy, with each exercise usable at most twice.
- `Heroes_Villains.java` — Sample 2: minimum prefix of villains to remove so heroes with fixed health can win.
- `Road_Construction.java` — Sample 3: minimum days to make terrain strictly downward-sloping with day-based digging power.
- `Mountain_Array.java` — Sample 4: minimum number of element changes to make the array a mountain shape.

### Sample 4: Mountain Array Transformation

- Input: integer `N` followed by an array `A` of length `N`.
- Goal: change the fewest elements so the array becomes a mountain.
- Mountain requirements:
  - Both ends of the array are equal.
  - Values increase by exactly 1 toward the center from both ends.
  - The shape may have a single peak (odd length) or a central plateau of two equal peak values (even length).
- Output: minimum number of elements that need to be changed.
- Topic: brute-force peak candidate evaluation, symmetric pattern matching.

### Other Infosys Sample Problems in `Sample Questions.pdf`

1. **Gym Energy**
   - Input: energy `E`, number of exercises `N`, and exercise drain values `A[i]`.
   - Task: perform the minimum number of exercises so that energy `E` becomes `<= 0`.
   - Constraint: each exercise can be used at most twice.
   - Output: minimum exercise count or `-1` if impossible.

2. **Heroes vs Villains**
   - Input: number of villains `N`, number of heroes `M`, hero health `H`, and villain health values `V[i]`.
   - Task: remove the smallest number of villains from the front so the remaining villains can be defeated by `M` heroes.

3. **Road Construction**
   - Input: terrain heights `L[i]` for `N` segments.
   - Task: lower selected segments across days so the resulting heights are strictly decreasing.
   - Digging power on day `D` is `2^(D-1)` meters per scheduled segment.

4. **Mountain Array Transformation** — described above.

5. **Interesting String Pieces**
   - Input: string `S`.
   - Task: rearrange characters globally and cut `S` into the maximum number of equal contiguous pieces.

6. **One Swap Lexicographically Smallest**
   - Input: array `A` and distance limit `K`.
   - Task: perform at most one swap of elements within distance `K`.
   - Goal: minimize the resulting array lexicographically.

7. **Restaurant Dish Sequence**
   - Input: `N` dishes with types described by `Arr[i]`.
   - Task: select a sequence of orders using distinct dish types, where each order contains twice as many dishes as the previous order.

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
javac Mountain_Array.java
java Mountain_Array
```
