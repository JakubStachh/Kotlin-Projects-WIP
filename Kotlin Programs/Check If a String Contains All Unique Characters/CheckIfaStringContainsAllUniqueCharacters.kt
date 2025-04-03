fun hasUniqueCharacters(str: String): Boolean {
    return str.length == str.toSet().size
}

fun main() {
    println(hasUniqueCharacters("abcde"))  // Output: true
    println(hasUniqueCharacters("aabbcc"))  // Output: false
}
