fun mergeArrays(arr1: IntArray, arr2: IntArray): IntArray {
    val result = IntArray(arr1.size + arr2.size)
    var i = 0
    var j = 0
    var k = 0

    while (i < arr1.size && j < arr2.size) {
        result[k++] = if (arr1[i] < arr2[j]) arr1[i++] else arr2[j++]
    }
    
    while (i < arr1.size) result[k++] = arr1[i++]
    while (j < arr2.size) result[k++] = arr2[j++]
    
    return result
}

fun main() {
    val arr1 = intArrayOf(1, 3, 5, 7)
    val arr2 = intArrayOf(2, 4, 6, 8)
    println(mergeArrays(arr1, arr2).joinToString())  // Output: 1, 2, 3, 4, 5, 6, 7, 8
}
