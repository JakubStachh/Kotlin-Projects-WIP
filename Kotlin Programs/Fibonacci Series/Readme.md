# 📌 Fibonacci Sequence (Iterative Solution) in Kotlin

## 🚀 Description
This Kotlin program defines a function `fibonacci(n: Int): Int` that computes the n-th Fibonacci number using an iterative approach.

The Fibonacci sequence is defined as:

- `F(0) = 0`.

- `F(1) = 1`.

- `F(n) = F(n-1) + F(n-2)` for `n ≥ 2`.

The function uses a bottom-up approach, where two variables `a` and `b` store the previous two Fibonacci numbers and iteratively calculate the next one.

## 🔍 How It Works
1. **Initial Values**:

     - The first two Fibonacci numbers are initialized: `a = 0` (F(0)) and `b = 1` (F(1)).

2. **Iterative Calculation**:

     - From index 2 to `n`, the Fibonacci number is calculated by adding the previous two numbers (`a` and `b`).

     - `a` and `b` are then updated after each iteration to store the two most recent Fibonacci numbers.

3. **Return the Result**:

     - After completing the loop, the function returns `b`, which will hold the Fibonacci number for the input `n`.

## 🎯 Example Output
```sh
8
```
## 📂 Code Breakdown
### `fibonacci` Function:
   - **Input**: `n` (The index of the Fibonacci sequence to calculate).

   - **Output**: The `n`-th Fibonacci number.

   - **How It Works**:

        - The function starts with the first two Fibonacci numbers and iterates to calculate the subsequent ones.

        - It returns the `n`-th Fibonacci number when the loop finishes.
```sh
fun fibonacci(n: Int): Int {
    var a = 0
    var b = 1
    for (i in 2..n) {
        val next = a + b
        a = b
        b = next
    }
    return b
}
```
### `main` Function:
- The `main` function calls the `fibonacci` function with the argument `6` to compute the 6th Fibonacci number.
```sh
fun main() {
    println(fibonacci(6))  // Output: 8
}
```
