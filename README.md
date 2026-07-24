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
```
