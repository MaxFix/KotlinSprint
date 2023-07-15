package lesson_7

fun main() {
    for(i in 1..3) {
        val randNumber = (0..9).random()
        val randSymbol = ('a'..'z').random()
        print(randSymbol)
        print(randNumber)
    }
}