fun removeDuplicates(arr: List<Int>): List<Int> {
    return arr.distinct()
}

fun main() {
    val list = listOf(1, 2, 2, 3, 4, 4, 5)
    println(removeDuplicates(list))  // Output: [1, 2, 3, 4, 5]
}
