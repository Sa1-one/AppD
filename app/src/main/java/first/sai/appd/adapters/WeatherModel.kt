package first.sai.appd.adapters

import androidx.room.Entity
import androidx.room.PrimaryKey

data class WeatherModel(
    val cityName: String,
    val dayTime: String,
    val condition: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val imgUrl: String,
    val hours: String
)

