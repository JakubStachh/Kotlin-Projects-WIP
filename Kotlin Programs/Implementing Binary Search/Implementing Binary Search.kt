fun binarySearch(arr: IntArray, target: Int): Int {
    var left = 0
    var right = arr.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2

        if (arr[mid] == target) {
            return mid
        }

        if (arr[mid] < target) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    return -1  // Element not found
}

fun main() {
    val arr = intArrayOf(1, 3, 5, 7, 9, 11)
    val target = 7
    println(binarySearch(arr, target))  // Output: 3
}
