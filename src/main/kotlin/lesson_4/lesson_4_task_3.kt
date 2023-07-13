package lesson_4
    const val WEATHER_IS_SUNNY:Boolean = true
    const val TENT_IS_OPENED:Boolean = true
    const val HUMIDITY_IS_OK:Int = 20
    const val FORECAST_SEASON:String = "зима"
fun main() {
    val isSunnyWeather:Boolean = true
    val tentIsOpenedNow:Boolean = true
    val isCurrentHumidityPercent:Int = 20
    val currentSeason:String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${
        (WEATHER_IS_SUNNY == isSunnyWeather) && (TENT_IS_OPENED == tentIsOpenedNow) && 
                (HUMIDITY_IS_OK == isCurrentHumidityPercent) && (FORECAST_SEASON != currentSeason)
    }")
}