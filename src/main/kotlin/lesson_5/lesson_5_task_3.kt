package lesson_5

const val FIRST_SECRET_NUMBER = 42
const val SECOND_SECRET_NUMBER = 43
fun main() {
    println("""Добро пожаловать в лотерею! Вам необходимо угадать 2 загаданных числа от 1 до 100 чтобы получить приз!
        |Либо угадать одно и получить утешительный приз :)
        |УДАЧИ!
        |Введите первое число: 
    """.trimMargin())
    val firstNumber: Int = readln().toInt()
    println("Введите второе число:")
    val secondNumber: Int = readln().toInt()

    val bothConditionsTrue: Boolean = ((firstNumber == FIRST_SECRET_NUMBER) && (secondNumber == SECOND_SECRET_NUMBER)) ||
            (firstNumber == SECOND_SECRET_NUMBER) && (secondNumber == FIRST_SECRET_NUMBER)
    val oneOfConditionsTrue: Boolean = ((firstNumber == FIRST_SECRET_NUMBER) || (secondNumber == SECOND_SECRET_NUMBER)) ||
            (firstNumber == SECOND_SECRET_NUMBER) || (secondNumber == FIRST_SECRET_NUMBER)


    if(bothConditionsTrue) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (oneOfConditionsTrue) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача! Крутите барабан!")
    }
}