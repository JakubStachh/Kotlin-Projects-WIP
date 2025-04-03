# 📌 Linked List Implementation in Kotlin

## 🚀 Description
This Kotlin program demonstrates a **singly linked list**, a fundamental data structure where each **node** contains a data value and a pointer to the **next node** in the list. The linked list supports basic operations such as **appending new elements** and **printing the list**.

## 🔍 How It Works

### **Structure of the Linked List**
#### 🟢 **Node Class**
Each node consists of:
- **`data`**: An integer value.
- **`next`**: A reference to the next node (or `null` if it's the last node).

#### 🟢 **LinkedList Class**
- **`head`**: The starting node of the linked list.
- **`append(data: Int)`**: Adds a new node at the **end** of the list.
- **`printList()`**: Prints all elements in the linked list in a **readable format**.

---

## 📂 Code Breakdown

### ✅ **Node Class**
The `Node` class represents a **single node** in the linked list. Each node stores an integer (`data`) and a reference to the **next node** (`next`).

```kotlin
class Node(var data: Int) {
    var next: Node? = null
}
