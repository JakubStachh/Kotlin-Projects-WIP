fun longestUniqueSubstring(str: String): Int {
    var maxLength = 0
    var currentSubstring = ""

    for (char in str) {
        if (currentSubstring.contains(char)) {
            currentSubstring = currentSubstring.substring(currentSubstring.indexOf(char) + 1)
        }
        currentSubstring += char
        maxLength = maxOf(maxLength, currentSubstring.length)
    }

    return maxLength
}

fun main() {
    println(longestUniqueSubstring("abcabcbb"))  // Output: 3 ("abc")
}
