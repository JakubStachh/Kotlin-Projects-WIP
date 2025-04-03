# 📌 Reverse a String in Kotlin

## 🚀 Description
This Kotlin program demonstrates how to reverse a string using Kotlin's built-in `reversed()` function. The program takes an input string and returns the reversed version of it.

---

## 🔍 How It Works

### **Concept**
1. The program takes an input string.
2. It uses Kotlin's `reversed()` function to reverse the string.
3. The function returns the reversed string.

---

## 📂 Code Breakdown

### ✅ **reverseString Function**
- **Input:** A string (`str`).
- **Output:** A new string which is the reverse of the input.

```kotlin
fun reverseString(str: String): String {
    return str.reversed()
}
```
### ✅ **`Main` Function (Testing the Implementation)**
🔹**Calls** `reverseString` on the string `"Hello"`.

🔹**Prints the result.**
```kotlin
fun main() {
    println(reverseString("Hello"))  // Output: "olleH"
}
```
## 🎯 Example Output
```
olleH
```
