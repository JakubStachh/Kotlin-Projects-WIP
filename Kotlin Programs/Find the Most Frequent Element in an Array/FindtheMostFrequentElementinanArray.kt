fun mostFrequent(arr: List<Int>): Int? {
    return arr.groupingBy { it }.eachCount().maxBy { it.value }?.key
}

fun main() {
    val list = listOf(1, 2, 2, 3, 3, 3, 4)
    println(mostFrequent(list))  // Output: 3
}
