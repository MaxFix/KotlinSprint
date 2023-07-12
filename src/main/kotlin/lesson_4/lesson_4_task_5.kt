package lesson_4

const val damages:Boolean = false
const val minCrewCount:Int = 55
const val maxCrewCount:Int = 70
const val minProvosionsBoxesCount:Int = 50
const val weatherIsOk: Boolean = true

const val shipToTrip = "Научно-исследовательский корабль может приступить к долгосрочному плаванию:"
const val shipToAlternativeTrip = "Альтернативно, корабль может отплыть:"
fun main() {
    print("Имеет ли Ваш корабль повреждения? (только 'true' или 'false') ")
    val isDamages = readln().toBoolean()
    print("Введите число экипажа на борту: (только целые числа) ")
    val crewCount = readln().toInt()
    print("Введите количество ящиков провизии на борту (только целые числа) ")
    val provisionBoxCount = readln().toInt()
    print("Благоприятны ли погодные условия? (только 'true' или 'false') ")
    val currentWeather = readln().toBoolean()

    val tripConditions: Boolean = isDamages == damages && (crewCount > minCrewCount && crewCount < maxCrewCount)
            && provisionBoxCount > minProvosionsBoxesCount
    val alternativeTripConditions: Boolean = (crewCount == 70)
            && currentWeather == weatherIsOk

    println("$shipToTrip $tripConditions")
    println("$shipToAlternativeTrip $alternativeTripConditions")
}