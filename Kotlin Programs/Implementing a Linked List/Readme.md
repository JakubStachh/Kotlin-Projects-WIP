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
```
## ✅ LinkedList Class
This class manages the head of the linked list and provides utility functions.

🔹 append(data: Int): Adds a node at the end of the linked list.

🔹 If the list is empty (head == null), set head to the new node.

🔹Otherwise, iterate to the last node and set its next reference to the new node.

```kotlin
class LinkedList {
    var head: Node? = null

    fun append(data: Int) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
        } else {
            var temp = head
            while (temp?.next != null) {
                temp = temp.next
            }
            temp?.next = newNode
        }
    }
}
```
🔹 `printList()`: **Prints the linked list in a readable format**.

🔹 Iterates through the list and prints each node’s `data` followed by `"->"`.

🔹 Ends with `"null"` to indicate the end of the list.
