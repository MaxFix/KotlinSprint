package lesson_4

const val HAS_DAMAGES:Boolean = false
const val MIN_CREW_COUNT:Int = 55
const val MAX_CREW_COUNT:Int = 70
const val MIN_PROVISION_BOXES:Int = 50
const val WEATHER_IS_OK: Boolean = true

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
    val weatherNow = readln().toBoolean()

    val tripConditions: Boolean = isDamages == HAS_DAMAGES && (crewCount > MIN_CREW_COUNT && crewCount < MAX_CREW_COUNT)
            && provisionBoxCount > MIN_PROVISION_BOXES
    val alternativeTripConditions: Boolean = crewCount == 70
            && weatherNow == WEATHER_IS_OK && provisionBoxCount > MIN_PROVISION_BOXES

    println("$shipToTrip $tripConditions")
    println("$shipToAlternativeTrip $alternativeTripConditions")
}