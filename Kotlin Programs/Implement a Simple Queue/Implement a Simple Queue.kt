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

fun main() {
    val queue = Queue<Int>()
    queue.enqueue(10)
    queue.enqueue(20)
    queue.enqueue(30)

    println(queue.dequeue()) // Output: 10
    println(queue.peek())    // Output: 20
}
