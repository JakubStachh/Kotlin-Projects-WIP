fun fibonacci(n: Int): Int {
    var a = 0
    var b = 1
    for (i in 2..n) {
        val next = a + b
        a = b
        b = next
    }
    return b
}

fun main() {
    println(fibonacci(6))  // Output: 8
}
