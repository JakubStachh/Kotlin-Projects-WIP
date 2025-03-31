fun findMissingNumber(arr: IntArray, n: Int): Int {
    val expectedSum = (n * (n + 1)) / 2
    val actualSum = arr.sum()
    return expectedSum - actualSum
}

fun main() {
    val arr = intArrayOf(1, 2, 4, 6, 3, 7, 8)
    val n = 8
    println(findMissingNumber(arr, n))  // Output: 5
}
