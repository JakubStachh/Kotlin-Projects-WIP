# 📌 Cycle Detection in a Linked List (Kotlin)
## 🚀 Description
This Kotlin program defines a function `hasCycle(head: Node?): Boolean` that checks whether a linked list has a cycle. 
A cycle in a linked list occurs when a node's `next` points back to a previous node, causing the list to loop infinitely.

The solution uses the **Floyd's Tortoise and Hare Algorithm** (two-pointer approach), where:

- **Slow pointer** moves one step at a time.

- **Fast pointer** moves two steps at a time.

If there is a cycle, the slow and fast pointers will eventually meet. If no cycle exists, the fast pointer will reach the end of the list.

## 🔍 How It Works
1. **Two-pointer Technique**:

- We initialize two pointers: `slow` and `fast`. Both start at the head of the linked list.

- The `slow` pointer moves one step at a time, while the `fast` pointer moves two steps at a time.

- If there is a cycle in the list, the `slow` and `fast` pointers will eventually meet at the same node.

- If the `fast` pointer reaches `null`, there is no cycle.

2. **Cycle Detection**:

- If at any point `slow == fast`, a cycle is detected, and the function returns `true`.

- If the `fast` pointer reaches the end of the list (i.e., `fast == null` or `fast.next == null`), the function returns `false`, indicating there is no cycle.

## 🎯 Example Output
```sh
true
```
## 📂 Code Breakdown
### `Node` Class:
- Represents a single node in the linked list.

- Each node contains a value and a reference (`next`) to the next node in the list.
```sh
class Node(var value: Int) {
    var next: Node? = null
}
```

### `hasCycle` Function:
- **Input**: `head` (the head node of the linked list).

- **Output**: `true` if the linked list has a cycle, `false` otherwise.

- **How It Works**:

     - The function uses two pointers: `slow` and `fast`.

     - `slow` moves one step at a time, while `fast` moves two steps at a time.

     - If the two pointers meet, a cycle is detected; otherwise, the function returns `false`.
```sh
fun hasCycle(head: Node?): Boolean {
    var slow = head
    var fast = head

    while (fast != null && fast.next != null) {
        slow = slow?.next
        fast = fast.next?.next
        if (slow == fast) return true
    }
    return false
}
```
main Function:
In the main function, we create a linked list and introduce a cycle by setting node4.next = node2.

We then call hasCycle to check if the list contains a cycle.

kotlin
Copy
Edit
fun main() {
    val node1 = Node(1)
    val node2 = Node(2)
    val node3 = Node(3)
    val node4 = Node(4)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node2  // Creating a cycle

    println(hasCycle(node1))  // Output: true
}
