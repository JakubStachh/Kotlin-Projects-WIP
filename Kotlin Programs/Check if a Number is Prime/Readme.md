# 📌 Prime Number Check in Kotlin
## 🚀 Description
This Kotlin program defines a function `isPrime(n: Int): Boolean` to check whether a given number is prime. A prime number is a number greater than 1 that is only divisible by 1 and itself.

## 🔍 How It Works
1. **Initial Check**:
         The function first checks if the number is less than or equal to 1. If it is, the function immediately returns `false` as prime numbers are greater than 1.

2. **Check Divisibility**:
         A loop is used to iterate from 2 up to `n - 1`. If any number in this range divides `n` evenly (i.e., `n % i == 0`), the function returns `false` because `n` is divisible by a number other than 1 and itself, meaning it is not prime.

3. **Return True**:
        If the loop completes without finding a divisor, the function returns `true`, indicating that the number is prime.

🎯 Example Output
sh
Copy
Edit
true
📂 Code Breakdown
isPrime Function:
Input: n (the integer to check).

Output: true if the number is prime, false otherwise.

How It Works:

If n is less than or equal to 1, return false.

Iterate from 2 to n - 1 and check if any number divides n evenly.

If no such number is found, return true.

main Function:
The main function tests the isPrime function by calling it with the number 17 (which is prime).

kotlin
Copy
Edit
fun main() {
    println(isPrime(17))  // Output: true
}
