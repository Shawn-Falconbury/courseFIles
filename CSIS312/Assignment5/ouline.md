## Generic Collections Assignment Outline
### Introduction
- Brief overview of generics in Java.
- Importance of type safety and compile-time checks.
### Objective
#### Explanation of the goals:
1. Use of Java's `LinkedList` with generics.
```bash
LinkedList<Integer> list = new LinkedList<>();
```
- Insertion of random integers.
```bash
Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            list.add(rand.nextInt(101)); // 101 because the upper bound is exclusive
        }
 ```
- Sorting, summing, and averaging the integers.
```bash
Collections.sort(list);
```
### Implementation Steps
#### LinkedList Creation
- Declare a `LinkedList` of type `Integer`.
#### Random Integer Insertion
- Use the `Random` class.
- Generate and insert 25 integers from 0 to 100.
#### Sorting the LinkedList
- Use of `Collections.sort` method.
#### Calculation of Sum
- Use of Java streams to sum up the integers.
#### Calculation of Average
- Derive the average from the previously calculated sum.
### Running the Program
-Compilation and execution steps.
#### Expected Output
- Description of the program's output.

- Sample output showcasing the program's results.
```bash
- Assignment5
Unsorted list: [46, 13, 52, 12, 79, 67, 41, 49, 46, 7, 62, 49, 43, 41, 8, 72, 64, 30, 83, 38, 87, 15, 71, 83, 4]
Sorted list: [4, 7, 8, 12, 13, 15, 30, 38, 41, 41, 43, 46, 46, 49, 49, 52, 62, 64, 67, 71, 72, 79, 83, 83, 87]
Sum of the elements: 1162
Average of the elements: 46.48
```
S