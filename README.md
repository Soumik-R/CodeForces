# Competitive Programming Solutions

A collection of solutions to various competitive programming problems, organized to demonstrate practical applications of fundamental data structures and algorithms.

## Overview

This repository contains implementations that leverage core computer science concepts to solve algorithmic challenges. The focus is on understanding and applying data structures effectively in problem-solving scenarios.

---

## Data Structures & Concepts

### Arrays

Arrays form the foundation of most algorithmic problems. They provide constant-time access to elements and are cache-friendly, making them ideal for performance-critical applications.

**Key Concepts:**
- **Static vs Dynamic Arrays**: Fixed-size arrays offer predictable memory layout, while dynamic arrays (like ArrayList) provide flexibility at the cost of occasional reallocation.
- **Prefix Sum Arrays**: Precomputing cumulative sums enables O(1) range queries, transforming otherwise O(n) operations into constant time.
- **Two-Pointer Technique**: Using two indices to traverse an array efficiently, often reducing time complexity from O(n²) to O(n).
- **Sliding Window**: Maintaining a window of elements while traversing, useful for subarray problems with specific constraints.

**Applications:**
- Frequency counting and histogram generation
- Finding subarrays with specific properties
- Element rearrangement and partitioning
- Matrix operations and transformations

---

### Strings

Strings are sequences of characters that require specialized techniques for efficient manipulation and pattern matching.

**Key Concepts:**
- **String Hashing**: Converting strings to numerical values for fast comparison, useful in pattern matching and duplicate detection.
- **Character Frequency Analysis**: Using arrays or hash maps to count character occurrences, fundamental for anagram detection and character manipulation.
- **Palindrome Detection**: Checking if strings read the same forwards and backwards, often using two-pointer approach.
- **String Sorting**: Understanding lexicographic ordering and comparison operations.

**Common Operations:**
- Character case conversion and normalization
- Substring extraction and manipulation
- Pattern matching and text processing
- String comparison and ordering

---

### Hash Tables (Maps & Sets)

Hash tables provide average O(1) time complexity for insertion, deletion, and lookup operations, making them invaluable for frequency counting and membership testing.

**Key Concepts:**
- **Hash Functions**: Mapping keys to array indices, balancing distribution and collision minimization.
- **Collision Resolution**: Handling cases where different keys hash to the same index (chaining, open addressing).
- **HashMap vs HashSet**: Maps store key-value pairs while sets store unique elements only.

**Use Cases:**
- Counting element frequencies
- Detecting duplicates
- Creating lookup tables for fast access
- Implementing caches and memoization

---

### Greedy Algorithms

Greedy algorithms make locally optimal choices at each step, aiming to find a global optimum. They work when problems exhibit the greedy-choice property and optimal substructure.

**Key Principles:**
- **Local Optimization**: Making the best choice at each step without reconsidering previous choices.
- **Proof of Correctness**: Ensuring that local optima lead to global optima requires mathematical proof or problem-specific reasoning.
- **Activity Selection**: Classic greedy approach for scheduling and interval-based problems.

**Common Patterns:**
- Sorting followed by greedy selection
- Maintaining invariants throughout the algorithm
- Exchange arguments for correctness proofs

---

### Mathematical Algorithms

Many problems require number theory, combinatorics, or mathematical reasoning rather than complex data structures.

**Key Topics:**
- **GCD and LCM**: Greatest Common Divisor and Least Common Multiple using Euclidean algorithm.
- **Prime Numbers**: Sieve of Eratosthenes for efficient prime generation, primality testing.
- **Modular Arithmetic**: Operations under modulo, useful for handling large numbers and combinatorics.
- **Combinatorics**: Permutations, combinations, and counting principles.
- **Divisibility Rules**: Understanding factors, multiples, and divisibility properties.

**Applications:**
- Number theory problems
- Counting and probability
- Optimization through mathematical formulas
- Efficient computation of large values

---

### Bit Manipulation

Working directly with binary representations of numbers can provide elegant and efficient solutions.

**Key Operations:**
- **AND, OR, XOR**: Bitwise logical operations with specific properties (XOR self-cancellation, AND masking).
- **Bit Shifting**: Left shift (multiplication by 2) and right shift (division by 2).
- **Counting Bits**: Finding set bits, leading zeros, or trailing zeros.
- **Power of Two**: Checking if a number is a power of two using (n & (n-1)) == 0.

**Common Tricks:**
- XOR for finding unique elements (self-cancellation property)
- Bit masking for subset representation
- Fast multiplication and division by powers of 2
- Toggling and checking specific bits

---

### Sorting and Searching

Fundamental operations that appear in countless algorithmic problems.

**Sorting:**
- **Comparison-based Sorting**: O(n log n) lower bound for comparison sorts (QuickSort, MergeSort, HeapSort).
- **Non-comparison Sorting**: Linear time sorting for specific inputs (Counting Sort, Radix Sort).
- **Stability**: Maintaining relative order of equal elements.
- **Custom Comparators**: Defining custom sorting criteria.

**Searching:**
- **Linear Search**: O(n) traversal through unsorted data.
- **Binary Search**: O(log n) search in sorted data, requires maintaining sorted invariant.
- **Ternary Search**: Finding extrema in unimodal functions.

---

### Dynamic Programming (Basics)

While not heavily featured, some problems benefit from remembering computed results to avoid redundant calculations.

**Core Concepts:**
- **Memoization**: Top-down approach storing results of subproblems.
- **Tabulation**: Bottom-up approach building solutions iteratively.
- **State Definition**: Identifying what information defines a subproblem.
- **State Transition**: Relating solutions of larger problems to smaller subproblems.

---

### Implementation Techniques

**Input/Output Optimization:**
- Using buffered readers for fast input processing
- Efficient string building with StringBuilder
- Handling multiple test cases and edge cases

**Edge Case Handling:**
- Zero and negative numbers
- Empty inputs and single-element cases
- Maximum and minimum value constraints
- Overflow and underflow considerations

**Code Organization:**
- Modular function design
- Clear variable naming
- Consistent style and formatting

---

## Problem-Solving Approach

1. **Understand the Problem**: Read carefully, identify inputs, outputs, and constraints.
2. **Identify the Pattern**: Recognize which data structure or algorithm applies.
3. **Consider Complexity**: Analyze time and space requirements before coding.
4. **Start Simple**: Begin with brute force if needed, then optimize.
5. **Test Thoroughly**: Check edge cases, boundary conditions, and typical inputs.

---

## Complexity Analysis

Understanding time and space complexity is crucial for competitive programming:

- **O(1)**: Constant time - direct access, basic arithmetic
- **O(log n)**: Logarithmic - binary search, balanced trees
- **O(n)**: Linear - single pass through data
- **O(n log n)**: Linearithmic - efficient sorting
- **O(n²)**: Quadratic - nested loops, brute force
- **O(2ⁿ)**: Exponential - recursive enumeration, usually too slow

Choose algorithms based on input size constraints to avoid timeout errors.

---

## Best Practices

- Always analyze constraints before choosing an approach
- Use appropriate data types to avoid overflow
- Write clean, readable code even under time pressure
- Practice common patterns until they become second nature
- Learn from both successful and failed submissions

---

## Resources for Learning

- **CLRS (Introduction to Algorithms)**: Comprehensive algorithmic theory
- **Competitive Programmer's Handbook**: Practical problem-solving techniques
- **Codeforces Problemset**: Extensive problem collection with difficulty ratings
- **CP-Algorithms**: Detailed algorithm explanations and implementations

---

## Contributing

Solutions are continuously added and improved. Focus remains on clear implementation and efficient algorithms rather than overly clever code.

---

## Language

All implementations are in Java, leveraging its standard library for common data structures and algorithms.