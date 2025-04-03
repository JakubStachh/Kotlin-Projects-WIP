fun power(base: Int, exp: Int): Int {
    return if (exp == 0) 1 else base * power(base, exp - 1)
}

fun main() {
    println(power(2, 3))  // Output: 8
}
