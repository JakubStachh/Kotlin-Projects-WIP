# 📌 Binary Search Implementation in Kotlin

## 🚀 Description
This Kotlin program implements the `Binary Search` algorithm, which is used to search for a target element in a `sorted array`. 
Binary Search works by repeatedly dividing the search interval in half. 
If the value of the search key is less than the item in the middle of the interval, the search continues in the lower half. 
Otherwise, it continues in the upper half. The algorithm is efficient and has a time complexity of **O(log n)**.

## 🔍 How It Works
### Steps of Binary Search:
  1. Start with two pointers: one pointing to the start of the array (`left`) and the other pointing to the end (`right`).

  2. Find the middle element by calculating `mid = (left + right) / 2`.

  3. If the middle element is equal to the target, return the index of that element.

  4. If the middle element is less than the target, narrow the search to the right half of the array (i.e., `left = mid + 1`).

  5. If the middle element is greater than the target, narrow the search to the left half of the array (i.e., `right = mid - 1`).

  6. If the search interval becomes invalid (i.e., `left > right`), the element is not in the array, and the function returns `-1`.

## Example
For the input array:
```sh
intArrayOf(1, 3, 5, 7, 9, 11)
```
And the target value `7`, the binary search will:

   - Start with `left = 0` and `right = 5`.

   - Calculate `mid = (0 + 5) / 2 = 2` (middle element is `5`).

   - Since `5` is less than `7`, adjust the search to the right half (`left = 3`).

   - Now, `mid = (3 + 5) / 2 = 4` (middle element is `9`).

   - Since `9` is greater than `7`, adjust the search to the left half (`right = 3`).

   - Now, `mid = (3 + 3) / 2 = 3` (middle element is `7`).

   - Since the middle element equals the target, return the index `3`.

## 🎯 Example Output:
For the following input:
```sh
val arr = intArrayOf(1, 3, 5, 7, 9, 11)
val target = 7
println(binarySearch(arr, target))
```
The output will be:
```sh
3
```
## 📂 Code Breakdown
### `binarySearch` Function:
- **Input**:
    - `arr: IntArray` — The sorted array in which to search for the target.

    - `target: Int` — The element to search for.

- **Output**:
    - Returns the index of the `target` in the array if found, or `-1` if not found.

- **How It Works**:
  
    1. **Initialize pointers**: `left` starts at index `0`, and `right` starts at the last index of the array.

    2. **Iterate**: While `left <= right`, calculate the middle index `mid`.

        - If `arr[mid] == target`, return `mid`.

        - If `arr[mid] < target`, move `left` to `mid + 1` to search the right half.

        - If `arr[mid] > target`, move `right` to `mid - 1` to search the left half.

   3. If the target is not found, return `-1`.
```sh
fun binarySearch(arr: IntArray, target: Int): Int {
    var left = 0
    var right = arr.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2

        if (arr[mid] == target) {
            return mid
        }

        if (arr[mid] < target) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    return -1  // Element not found
}
```

### `main` Function:
The `main` function demonstrates how to use the `binarySearch` function. It initializes a sorted array and a target value, then calls the function and prints the result.
```sh
fun main() {
    val arr = intArrayOf(1, 3, 5, 7, 9, 11)
    val target = 7
    println(binarySearch(arr, target))  // Output: 3
}
```
## 🎯 Example Output:
```sh
3
```
