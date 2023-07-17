package lesson_9

const val INGREDIENTS_COUNT = 5

fun main() {
    var array = Array(INGREDIENTS_COUNT) {
        readln() }
    var newString = ""
    array = array.toSet().sorted().toTypedArray()
    array.forEach { newString += "$it," }
    newString = newString.dropLast(1)
    newString += "."
    //newString = newString[0].uppercaseChar().toString()
    println(newString)
}

//лук
//перец
//лук
//морковь
//огурец
//.replace(",$",".")