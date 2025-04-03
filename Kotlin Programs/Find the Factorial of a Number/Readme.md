# 📌 Factorial Function in Kotlin
## 🚀 Description
This Kotlin program defines a recursive function `factorial(n: Int): Int` that computes the factorial of a given number `n`. The factorial of a number `n`, denoted as `n!`, is the product of all positive integers less than or equal to `n`.

The factorial is defined as:

- `0! = 1`.

- `n! = n * (n-1)!` for `n > 0`.

## 🔍 How It Works
1. **Base Case**:

     - The function checks if `n` is 0. If true, it returns 1 because `0! = 1`.

2. **Recursive Case**:

     - If `n` is greater than 0, the function recursively calls itself with `n-1` and multiplies the result by `n`. This step continues until `n` reaches 0.

3. **Return the Result**:

     - The final result, once the recursion unwinds, will be the factorial of `n`.

## 🎯 Example Output
```sh
120
```
## 📂 Code Breakdown
### `factorial` Function:
- **Input**: `n` (The number for which the factorial is to be calculated).

- **Output**: The factorial of the input `n`.

- **How It Works**:

     - The function first checks if `n` is `0`. If true, it returns `1` because `0! = 1`.

     - For all values of `n > 0`, the function recursively calls itself, reducing `n` by `1` each time, and multiplies the result of the recursion by `n`.

```sh
fun factorial(n: Int): Int {
    return if (n == 0) 1 else n * factorial(n - 1)
}
```
### `main` Function:
- The `main` function calls the `factorial` function with the argument `5` to compute the factorial of 5.
```sh
fun main() {
    println(factorial(5))  // Output: 120
}
```
