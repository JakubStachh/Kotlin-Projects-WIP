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

fun main() {
    convertCurrency(100.0, "USD", "INR")
}
