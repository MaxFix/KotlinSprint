package lesson_3

fun main() {
    var userString: String = "D2-D4;0"

    var splittedString = userString.split("-",";")
    var from: String = splittedString[0]
    var to: String = splittedString[1]
    var counter: String = splittedString[2]

    println("Откуда ходим:$from \nКуда ходим:$to \nНомер хода:$counter")
}