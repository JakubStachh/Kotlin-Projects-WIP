# 📌 Kotlin Program to Find Kth Largest Element in an Array

## 🚀 Description
This Kotlin program finds the **Kth largest element** in an unsorted array. 
It uses a Priority Queue (or a max-heap) to efficiently find the desired element. 
The priority queue helps in extracting the largest element, and by removing elements one-by-one, we can find the Kth largest.

## 🔍 How It Works
1. **Priority Queue (Max-Heap)**:

- The program uses a `PriorityQueue` in Kotlin to keep track of the elements.
  By default, a `PriorityQueue` is a **min-heap**. However, in this case, we configure it to behave as a **max-heap** by using `compareByDescending { it }`.
  This allows us to easily retrieve the largest element at the top of the heap.

2. **Process**:

- The program adds all the elements of the array into the priority queue.

- Then, it removes elements one-by-one from the queue (the largest element first) until only the Kth largest element remains.

- The program returns this element.

## 🎯 Example Output
For the input array:

```sh
intArrayOf(7, 10, 4, 3, 20, 15)
```
And `k = 4`, the program outputs:
```sh
7
```
## 📂 Code Breakdown
### `kthLargest` Function:
- **Input**:

    - `arr: IntArray` (The input array of integers).

    - `k: Int` (The position of the element in the sorted order, where `k = 1` means the largest, `k = 2` the second largest, etc.).

- **Output**:

    - The `k`th largest element in the array.

- **How It Works**:

    - The function first initializes a `PriorityQueue` to store elements in descending order.

    - It adds all elements from the array into the priority queue.

    - Then, it iterates `k-1` times, each time removing the largest element (polling from the queue).

    - Finally, it returns the top element of the priority queue, which will be the `k`th largest element.

```sh
fun kthLargest(arr: IntArray, k: Int): Int {
    val pq = PriorityQueue<Int>(compareByDescending { it })
    arr.forEach { pq.add(it) }
    for (i in 1 until k) pq.poll()
    return pq.peek()
}
```
### `main` Function:
- The main function initializes an array and calls the `kthLargest` function to find the `k`th largest element in the array.
```sh
fun main() {
    val arr = intArrayOf(7, 10, 4, 3, 20, 15)
    val k = 4
    println(kthLargest(arr, k))  // Output: 7
}
```
