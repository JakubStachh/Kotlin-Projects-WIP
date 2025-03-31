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

fun main() {
    val stack = Stack<Int>()
    stack.push(10)
    stack.push(20)
    stack.push(30)

    println(stack.pop())  // Output: 30
    println(stack.peek()) // Output: 20
}
