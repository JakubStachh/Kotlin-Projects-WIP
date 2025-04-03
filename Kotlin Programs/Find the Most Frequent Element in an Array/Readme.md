# 📌 Find the Most Frequent Element in a List

## 🚀 Description
This Kotlin program is designed to find the most frequent element in a given list of integers. It uses Kotlin's `groupingBy` and `eachCount` functions to group elements, count their occurrences, and find the element that appears the most.

## 🔍 How It Works
### Steps:
1. **Group the elements** of the list by their values using `groupingBy`.

2. **Count the occurrences** of each element using `eachCount()`.

3. **Find the element with the highest count** by calling `maxBy` on the result.

4. **Return the element** with the maximum frequency.

### Example
For the input list:
```sh
listOf(1, 2, 2, 3, 3, 3, 4)
```
The program counts the occurrences of each element:

- `1` appears 1 time

- `2` appears 2 times

- `3` appears 3 times

- `4` appears 1 time

The element with the maximum frequency is `3`.

## 🎯 Example Output
For the input list:

```sh
val list = listOf(1, 2, 2, 3, 3, 3, 4)
```
The program outputs:
```sh
3
```
## 📂 Code Breakdown
### `mostFrequent` Function:
- **Input**:
    - `arr: List<Int>` (The list of integers where we need to find the most frequent element).

- **Output**:
    - The most frequent element in the list, or `null` if the list is empty.

- **How It Works**:
    - The function uses `groupingBy` to group the elements by their value and then calls `eachCount()` to count the occurrences of each element.

    - It then finds the element with the maximum frequency by using `maxBy`, and returns the element with the highest count.
```sh
fun mostFrequent(arr: List<Int>): Int? {
    return arr.groupingBy { it }.eachCount().maxBy { it.value }?.key
}
```
### `main` Function:
The `main` function demonstrates the use of the `mostFrequent` function. It creates a list of integers, calls the function, and prints the result.
```sh
fun main() {
    val list = listOf(1, 2, 2, 3, 3, 3, 4)
    println(mostFrequent(list))  // Output: 3
}
```
## 🎯 Example Output:
For the input list:

```sh
listOf(1, 2, 2, 3, 3, 3, 4)
```
The output will be:
```sh
3
```
