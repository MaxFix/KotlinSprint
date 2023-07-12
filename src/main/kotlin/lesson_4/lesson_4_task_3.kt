package lesson_4

fun main() {
    val weatherIsSunny:Boolean = true
    val tentIsOpened:Boolean = true
    val humidityIsOk:Int = 20
    val forecastSeason:String = "зима"

    val currentWeather:Boolean = true
    val tentIsOpenedNow:Boolean = true
    val humidityNowIsOk:Int = 20
    val currentSeason:String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${
        (weatherIsSunny == currentWeather) && (tentIsOpened == tentIsOpenedNow) && 
                (humidityIsOk == humidityNowIsOk) && (forecastSeason != currentSeason)
    }")
}