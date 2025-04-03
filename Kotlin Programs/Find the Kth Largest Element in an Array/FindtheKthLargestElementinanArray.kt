import java.util.*

fun kthLargest(arr: IntArray, k: Int): Int {
    val pq = PriorityQueue<Int>(compareByDescending { it })
    arr.forEach { pq.add(it) }
    for (i in 1 until k) pq.poll()
    return pq.peek()
}

fun main() {
    val arr = intArrayOf(7, 10, 4, 3, 20, 15)
    val k = 4
    println(kthLargest(arr, k))  // Output: 7
}
