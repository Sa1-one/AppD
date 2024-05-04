package first.sai.appd

import first.sai.appd.fragment.API
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class ApiCall {
    private val client = OkHttpClient()

    fun execute() {
        val request = Request.Builder()
            .url("https://api.weatherapi.com/v1/current.json?key=${API.KEY}&q=London&aqi=no")
            .get()
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                println("ошибка")
                e.printStackTrace()
            }

            override fun onResponse(call: Call, response: Response) {
                try {
                    val responseBody = response.body()
                    val responseString = responseBody?.string() // сохраняем данные в переменную
                    println("!!! $responseString")
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }

        })
    }
}