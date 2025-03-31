fun isPalindrome(str: String): Boolean {
    return str == str.reversed()
}

fun main() {
    println(isPalindrome("madam"))  // Output: true
}
