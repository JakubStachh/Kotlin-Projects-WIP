# 📌 Stack Implementation in Kotlin

## 🚀 Description
This Kotlin program demonstrates a **stack**, a fundamental data structure that follows the **Last In, First Out (LIFO)** principle. The stack supports basic operations such as **pushing**, **popping**, **peeking**, and checking if the stack is **empty**.

---

## 🔍 How It Works

### **Structure of the Stack**
#### 🟢 **Stack Class**
The `Stack` class uses a **mutable list** to store elements and provides methods to:
- **`push(item: T)`**: Adds an element to the **top** of the stack.
- **`pop()`**: Removes and returns the **top** element (returns `null` if empty).
- **`peek()`**: Returns the **top** element without removing it.
- **`isEmpty()`**: Checks if the stack is empty.
- **`size()`**: Returns the number of elements in the stack.

---

## 📂 Code Breakdown

### ✅ **Stack Class**
The `Stack` class provides stack operations using a **mutable list**.

```kotlin
class Stack<T> {
    private val stackList = mutableListOf<T>()

    fun push(item: T) {
        stackList.add(item)
    }

    fun pop(): T? {
        if (stackList.isEmpty()) return null
        return stackList.removeAt(stackList.size - 1)
    }

    fun peek(): T? {
        return stackList.lastOrNull()
    }

    fun isEmpty(): Boolean {
        return stackList.isEmpty()
    }

    fun size(): Int {
        return stackList.size
    }
}
