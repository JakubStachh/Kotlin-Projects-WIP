# 📌Checking Unique Characters in a String in Kotlin
🚀 Description
This Kotlin program defines a function `hasUniqueCharacters(str: String): Boolean` to check if a given string contains only unique characters. 
It compares the length of the string with the size of the set created from the string's characters. If both values are equal, it means the string has unique characters.

## 🔍 How It Works
- **Convert the String to a Set**:
    The `toSet()` function is called on the string, which converts the string into a set. Since sets do not allow duplicate values, any repeated characters will be removed.

- **Compare the Lengths:**
    The function compares the length of the original string with the size of the set. If the lengths are equal, it means the string contains only unique characters, as no duplicates exist in the set.

- **Return True or False**:

    - If the string has only unique characters, the length of the string will be the same as the size of the set, and the function returns `true`.

    - Otherwise, the function returns `false`.

🎯 Example Output
sh
Copy
Edit
true
false
📂 Code Breakdown
hasUniqueCharacters Function:
Input: str (a string to check).

Output: true if the string has unique characters, false otherwise.

How It Works:

Convert the string to a set (str.toSet()).

Compare the length of the string (str.length) with the size of the set (str.toSet().size).

main Function:
The main function tests the hasUniqueCharacters function by calling it with two different strings:

"abcde" which contains only unique characters.

"aabbcc" which contains duplicate characters.

kotlin
Copy
Edit
fun main() {
    println(hasUniqueCharacters("abcde"))  // Output: true
    println(hasUniqueCharacters("aabbcc"))  // Output: false
}
