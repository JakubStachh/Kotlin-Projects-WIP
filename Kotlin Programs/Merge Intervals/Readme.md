# 📌 Merge Overlapping Intervals in Kotlin

## 🚀 Description
This Kotlin program merges **overlapping intervals** in a given list. If two intervals overlap, they are combined into one larger interval.

---

## 🔍 How It Works

### **Concept**
1. **Sort the intervals** based on their start times.
2. **Iterate through the intervals**, merging overlapping ones.
3. **If an interval overlaps with the last merged one**, update the last merged interval.
4. **If no overlap**, add the interval to the result.

---

## 📂 Code Breakdown

### ✅ **Interval Data Class**
Represents an interval with a `start` and `end`.

```kotlin
data class Interval(val start: Int, val end: Int)
```
### ✅ **`mergeIntervals` Function**
- **Sorts** the intervals based on the start time.

- **Iterates** through the list and merges overlapping intervals.

- **Returns** a list of non-overlapping merged intervals.
