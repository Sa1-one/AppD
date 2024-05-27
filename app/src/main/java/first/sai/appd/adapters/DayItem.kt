package first.sai.appd.data.entity

data class DayItem(
    val cityName: String,
    val dayTime: String,
    val condition: String,
    val imgUrl: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val hours: String
)