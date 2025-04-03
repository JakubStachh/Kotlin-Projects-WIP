# 📌 Find the Longest Substring Without Repeating Characters

## 🚀 Description
This Kotlin program finds the **length of the longest substring without repeating characters**. 
It uses a sliding window approach to efficiently traverse through the string while keeping track of characters in the current window. 
If a character repeats, the window shrinks from the left until the repeated character is removed.

## 🔍 How It Works
1. **Sliding Window Technique**:

     - The program keeps track of the current substring and expands it by adding characters one by one.

     - If a character is found that already exists in the current substring, the window is shrunk by removing characters from the left until the repeating character is excluded.

     - The maximum length of the substring during this process is tracked and returned as the result.

2. **Step-by-Step Process**:

     - Traverse the string from left to right using a for loop.

     - For each character, check if it exists in the current substring.

     - If it does, shorten the substring by excluding characters from the start until there are no repeating characters.

     - Keep track of the length of the longest substring encountered so far.

### Example
For the input string `"abcabcbb"`, the longest substring without repeating characters is `"abc"`, which has a length of `3`.

## 🎯 Example Output
For the input string:
```sh
"abcabcbb"
```
The program outputs:
```sh
3
```
## 📂 Code Breakdown
### `longestUniqueSubstring` Function:
- **Input**:

   - `str: String` (The input string to find the longest unique substring from).

- **Output**:

   - The length of the longest substring that does not contain repeating characters.

- **How It Works**:

   - The function initializes two variables: `maxLength` to keep track of the maximum length of unique substrings and `currentSubstring` to store the current unique substring.

   - For each character in the input string, it checks if the character is already present in `currentSubstring`.

   - If it is present, the substring is adjusted by removing characters from the start until the repeating character is removed.

   - After every character addition, the length of the current substring is compared with `maxLength` and the greater value is stored in `maxLength`.
```sh
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
```
### `main` Function:
- The `main` function tests the `longestUniqueSubstring` function with the string `"abcabcbb"` and prints the result.
```sh
fun main() {
    println(longestUniqueSubstring("abcabcbb"))  // Output: 3 ("abc")
}
```
