package lesson_4

fun main() {
    val weatherIsSunny:Boolean = true
    val tentIsOpened:Boolean = true
    val humidityIsOk:Int = 20
    val currentSeason:String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${
        (weatherIsSunny == true) && (tentIsOpened == true) && (humidityIsOk == 20) && (currentSeason != "зима")
    }")
}