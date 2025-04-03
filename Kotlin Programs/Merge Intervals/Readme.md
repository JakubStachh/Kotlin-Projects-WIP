# 📌 Merging Overlapping Intervals in Kotlin

## 🚀 Description
This Kotlin program merges overlapping intervals in a list. Given a set of intervals, it **merges** those that overlap and returns a list of **non-overlapping** intervals.

---

## 🔍 How It Works

### **Understanding the Problem**
Given a list of intervals, some of which may **overlap**, the goal is to merge them into the smallest possible set of **non-overlapping** intervals.

#### 🟢 **Example**
Input: [(1,3), (2,4), (5,7), (6,8)] Output: [(1,4), (5,8)]

- **(1,3) and (2,4) overlap** → Merge to **(1,4)**
- **(5,7) and (6,8) overlap** → Merge to **(5,8)**

---

## 📂 Code Breakdown

### ✅ **Interval Data Class**
The `Interval` data class represents an interval with `start` and `end` values.

```kotlin
data class Interval(val start: Int, val end: Int)
