# one_remove_max_return

## Description
This Java program reads a number string and a digit, removes exactly one occurrence of the given digit, and prints the lexicographically largest resulting string.

## Input
- A number as a string
- A single digit character to remove

## Output
- The largest possible string obtained by removing exactly one matching digit

## Example
Input:
```
9289
9
```
Output:
```
289
```

## How it works
- The program scans each character of the input number
- When it finds the target digit, it constructs a candidate string with that digit removed
- It keeps the maximum candidate string seen so far
- Finally, it prints the best result

## Run
```bash
javac one_remove_max_return.java
java one_remove_max_return
```

Enter the number first, then the digit to remove on the next line.
