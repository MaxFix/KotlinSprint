package lesson_4
    const val weatherIsSunny:Boolean = true
    const val tentIsOpened:Boolean = true
    const val humidityIsOk:Int = 20
    const val forecastSeason:String = "зима"
fun main() {
    val currentWeather:Boolean = true
    val tentIsOpenedNow:Boolean = true
    val humidityNowIsOk:Int = 20
    val currentSeason:String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${
        (weatherIsSunny == currentWeather) && (tentIsOpened == tentIsOpenedNow) && 
                (humidityIsOk == humidityNowIsOk) && (forecastSeason != currentSeason)
    }")
}