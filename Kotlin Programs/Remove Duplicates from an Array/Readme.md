# 📌 Remove Duplicates from a List in Kotlin

## 🚀 Description
This Kotlin program demonstrates how to remove duplicate elements from a list using the built-in `distinct()` function. The program takes a list of integers and returns a new list containing only the unique elements.

---

## 🔍 How It Works

### **Concept**
1. The program takes an input list of integers.
2. It uses Kotlin's built-in `distinct()` function to eliminate any duplicates.
3. The function returns a new list with only the unique values from the input.

---

## 📂 Code Breakdown

### ✅ **removeDuplicates Function**
- **Input:** A list of integers (`arr`).
- **Output:** A list with duplicates removed.

```kotlin
fun removeDuplicates(arr: List<Int>): List<Int> {
    return arr.distinct()
}
