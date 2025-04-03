# 📌 Find the Missing Number in an Array

## 🚀 Description
This Kotlin program is designed to find the missing number from a sequence of integers. 
The integers in the array are from `1` to `n`, with one number missing. 
The program uses a mathematical formula to efficiently compute the missing number based on the expected sum of integers from `1` to `n` and the actual sum of the elements in the array.

## 🔍 How It Works
1. **Formula for Sum of First `n` Natural Numbers**:

   - The sum of integers from `1` to `n` can be calculated using the formula:

##
$$
\large \text{Expected Sum} = \frac{n \times (n + 1)}{2}
$$
##
 
  - This gives the sum of all numbers from `1` to `n` if no numbers were missing.

2. **Steps to Find the Missing Number**:

  - Calculate the expected sum of numbers from `1` to `n`.

  - Calculate the sum of the numbers present in the array (`actualSum`).

  - Subtract the `actualSum` from the `expectedSum`. The result will be the missing number.

### Example
For the input array:
```sh
intArrayOf(1, 2, 4, 6, 3, 7, 8)
```
##
$$
\text{The expected sum for n = 8 is } \frac{8 \times (8 + 1)}{2} = 36. \text{ The sum of the array is 1 + 2 + 4 + 6 + 3 + 7 + 8 = 31. The missing number is 36−31=5.}  
$$
##

## 🎯 Example Output
### For the input array:

```sh
val arr = intArrayOf(1, 2, 4, 6, 3, 7, 8)
val n = 8
```
The program outputs:
```sh
5
```
## 📂 Code Breakdown
### `findMissingNumber` Function:
- **Input**:

arr: IntArray (The array of integers with one missing number).

n: Int (The number of elements that should be in the array).

Output:

The missing number from the array.

How It Works:

The function calculates the expected sum using the formula 
𝑛
×
(
𝑛
+
1
)
2
2
n×(n+1)
​
 .

It computes the actual sum by calling the sum() function on the input array.

The missing number is the difference between the expected sum and the actual sum, which is returned as the result.

kotlin
Copy
Edit
fun findMissingNumber(arr: IntArray, n: Int): Int {
    val expectedSum = (n * (n + 1)) / 2
    val actualSum = arr.sum()
    return expectedSum - actualSum
}
main Function:
The main function tests the findMissingNumber function with the array intArrayOf(1, 2, 4, 6, 3, 7, 8) and prints the result.

kotlin
Copy
Edit
fun main() {
    val arr = intArrayOf(1, 2, 4, 6, 3, 7, 8)
    val n = 8
    println(findMissingNumber(arr, n))  // Output: 5
}
