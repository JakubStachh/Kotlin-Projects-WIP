# 📌 Merge Two Sorted Arrays in Kotlin

## 🚀 Description
This Kotlin program **merges two sorted arrays** into a **single sorted array**. It uses the **two-pointer technique** for an efficient merge process.

---

## 🔍 How It Works

### **Concept**
1. **Two pointers (`i` and `j`)** are used to track the position in each array.
2. **Compare elements** at `i` (from `arr1`) and `j` (from `arr2`).
3. **Insert the smaller element** into the result array.
4. **Move the pointer** of the selected element forward.
5. **Copy remaining elements** if any array has elements left.

---

## 📂 Code Breakdown

### ✅ **`mergeArrays` Function**
- **Takes two sorted arrays** as input.
- **Merges them efficiently** using the **two-pointer approach**.
- **Returns a sorted array**.

```kotlin
fun mergeArrays(arr1: IntArray, arr2: IntArray): IntArray {
    val result = IntArray(arr1.size + arr2.size)
    var i = 0
    var j = 0
    var k = 0

    while (i < arr1.size && j < arr2.size) {
        result[k++] = if (arr1[i] < arr2[j]) arr1[i++] else arr2[j++]
    }
    
    while (i < arr1.size) result[k++] = arr1[i++]
    while (j < arr2.size) result[k++] = arr2[j++]
    
    return result
}
```

### ✅ **`Main` Function (Testing the Implementation)**
🔹**Defines** two sorted arrays (`arr1` and `arr2`).

🔹**Calls** `mergeArrays` to merge them.

🔹**Prints** the merged sorted array.
```kotlin
fun main() {
    val arr1 = intArrayOf(1, 3, 5, 7)
    val arr2 = intArrayOf(2, 4, 6, 8)
    println(mergeArrays(arr1, arr2).joinToString())  // Output: 1, 2, 3, 4, 5, 6, 7, 8
}
```
## 🎯 Example Output
```
1, 2, 3, 4, 5, 6, 7, 8
```
