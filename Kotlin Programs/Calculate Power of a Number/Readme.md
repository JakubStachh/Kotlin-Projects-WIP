# 🚀 Description
This Kotlin program defines a recursive function `power(base: Int, exp: Int): Int` to calculate the result of raising a number (`base`) to a given power (`exp`). The program uses recursion to compute the result of the exponentiation.

## 🔍 How It Works
1. **Base Case (Recursion Ending Condition)**:
   If the exponent (`exp`) is zero, the function returns `1` because any number raised to the power of `0` is `1` by definition.

2. **Recursive Case**:
   If `exp` is greater than zero, the function multiplies the `base` by the result of calling `power(base, exp - 1)`, effectively reducing the exponent by `1` on each recursive call until `exp` reaches `0`.

3. **Example Function Call**:
   When `power(2, 3)` is called, the function computes `2 * 2 * 2`, which equals `8`.

## 🎯 Example Output
```sh
8
```

## 📂 Code Breakdown
### power Function:
- **Input**: `base` (the base number) and `exp` (the exponent).

- **Output**: The result of raising `base` to the power of `exp`.

- **Recursion**: Calls itself until `exp == 0`.

### **`main` Function**:
- This function tests the `power` function by calling it with `base = 2` and `exp = 3`.

- The output of `power(2, 3)` will be printed, which is `8`.

### Example:
```sh
fun main() {
    println(power(2, 3))  // Output: 8
}
```
