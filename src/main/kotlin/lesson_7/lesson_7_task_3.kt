package lesson_7

fun main() {
    println("Введите целое число ДО которого нужно вывести последовательность: ")
    val number = readln().toInt()
    for (i in 0..number step 2) {
        print(i)
    }
}