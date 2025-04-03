# 📌 Currency Converter in Kotlin

## 🚀 Description
This Kotlin program fetches **real-time currency exchange rates** and converts an amount from one currency to another using an **API request**.

---

## 🔍 How It Works

### **Concept**
1. The program sends an **HTTP request** to `exchangerate-api.com`.
2. It **retrieves exchange rates** for the specified currency.
3. The program **extracts the conversion rate** from the JSON response.
4. It **calculates and prints the converted amount**.

---

## 📂 Code Breakdown

### ✅ **convertCurrency Function**
- **Fetches exchange rates** from the API.
- **Extracts the conversion rate** from JSON.
- **Calculates and prints the converted amount**.

```kotlin
import java.net.HttpURLConnection
import java.net.URL
import org.json.JSONObject

fun convertCurrency(amount: Double, from: String, to: String) {
    val url = "https://api.exchangerate-api.com/v4/latest/$from"
    val connection = URL(url).openConnection() as HttpURLConnection
    connection.requestMethod = "GET"
    
    val response = connection.inputStream.bufferedReader().readText()
    val jsonResponse = JSONObject(response)
    
    val rate = jsonResponse.getJSONObject("rates").getDouble(to)
    val convertedAmount = amount * rate
    println("$amount $from = $convertedAmount $to")
}
```
### ✅ **`Main` Function (Testing the Implementation)**
🔹**Calls** `convertCurrency` to convert `100 USD` to `INR`.

🔹**Prints the result.**

```kotlin
fun main() {
    convertCurrency(100.0, "USD", "INR")
}
```
## 🎯 Example Output
```
100.0 USD = 8300.5 INR
```
#### *(Exchange rate varies based on real-time data.)*
