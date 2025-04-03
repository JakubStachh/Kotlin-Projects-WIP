# 📌 Queue Implementation in Kotlin

## 🚀 Description
This Kotlin program defines a generic `Queue` class that implements a simple queue data structure. 
The queue follows the First-In-First-Out (FIFO) principle, where elements are added at the end (enqueue) and removed from the front (dequeue).

The class provides common queue operations such as:

- Enqueue (add an element)

- Dequeue (remove an element)

- Peek (view the front element without removing it)

- Check if the queue is empty

- Check the size of the queue

## 🔍 How It Works
### Key Operations:
1. **Enqueue**: Adds an element to the end of the queue.

2. **Dequeue**: Removes and returns the element from the front of the queue. If the queue is empty, it returns `null`.

3. **Peek**: Returns the element at the front of the queue without removing it. If the queue is empty, it returns `null`.

4. **Is Empty**: Returns `true` if the queue is empty, otherwise returns `false`.

5. **Size**: Returns the number of elements in the queue.

### Example
For the following code:
```sh
val queue = Queue<Int>()
queue.enqueue(10)
queue.enqueue(20)
queue.enqueue(30)

println(queue.dequeue()) // Output: 10
println(queue.peek())    // Output: 20
```
The queue behaves as follows:

   - Initially, the queue is empty.

   - After enqueuing `10`, `20`, and `30`, the queue contains: `[10, 20, 30]`.

   - Calling `dequeue()` removes the element at the front of the queue (which is `10`).

   - Calling `peek()` returns the new front element, which is `20`, without removing it.

## 🎯 Example Output:
For the following input:
```sh
val queue = Queue<Int>()
queue.enqueue(10)
queue.enqueue(20)
queue.enqueue(30)

println(queue.dequeue()) // Output: 10
println(queue.peek())    // Output: 20
```
The output will be:
```sh
10
20
```
## 📂 Code Breakdown
### `Queue` Class:
- **Input**:
     - A generic type `T` representing the elements that can be stored in the queue.

- **Methods**:
     - `enqueue(item: T)`: Adds an element to the end of the queue.

     - `dequeue(): T?`: Removes and returns the front element of the queue, or `null` if the queue is empty.

     - `peek(): T?`: Returns the front element of the queue without removing it, or `null` if the queue is empty.

     - `isEmpty(): Boolean`: Checks if the queue is empty.

     - `size(): Int`: Returns the number of elements in the queue.
```sh
class Queue<T> {
    private val queueList = mutableListOf<T>()

    fun enqueue(item: T) {
        queueList.add(item)
    }

    fun dequeue(): T? {
        if (queueList.isEmpty()) return null
        return queueList.removeAt(0)
    }

    fun peek(): T? {
        return queueList.firstOrNull()
    }

    fun isEmpty(): Boolean {
        return queueList.isEmpty()
    }

    fun size(): Int {
        return queueList.size
    }
}
```
### `main` Function:
The `main` function demonstrates the usage of the `Queue` class. It creates a queue, enqueues three elements, and prints the results of `dequeue()` and `peek()` operations.
```sh
fun main() {
    val queue = Queue<Int>()
    queue.enqueue(10)
    queue.enqueue(20)
    queue.enqueue(30)

    println(queue.dequeue()) // Output: 10
    println(queue.peek())    // Output: 20
}
```
## 🎯 Example Output:
```sh
10
20
```
