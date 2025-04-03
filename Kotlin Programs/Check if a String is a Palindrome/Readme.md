#  📌 Palindrome Checker in Kotlin
## 🚀 Description
This Kotlin program defines a function `isPalindrome(str: String): Boolean` that checks whether a given string is a palindrome. 
A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization).

## 🔍 How It Works
- **String Reversal**: The function checks if the given string `str` is equal to its reversed version. This is done using Kotlin's built-in function `reversed()`, which reverses the string.

- **Comparison**: The function compares the original string with the reversed string. If both are the same, the string is a palindrome, and the function returns `true`. Otherwise, it returns `false`.

## 🎯 Example Output
```sh
true
```
## 📂 Code Breakdown
### `isPalindrome` Function:
- **Input**: `str` (the string to check).

- **Output**: `true` if the string is a palindrome, `false` otherwise.

- **How It Works**:

     - The function uses Kotlin's `reversed()` method to reverse the string.

     - It then checks if the original string is the same as the reversed one.

### `main` Function:
- The `main` function tests the `isPalindrome` function by calling it with the string `"madam"`, which is a palindrome.
```sh
fun main() {
    println(isPalindrome("madam"))  // Output: true
}
```
