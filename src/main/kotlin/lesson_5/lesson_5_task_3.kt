package lesson_5

const val FIRST_SECRET_NUMBER = 42
const val SECOND_SECRET_NUMBER = 43
const val WELCOME_MESSAGE_1 = """Добро пожаловать в лотерею! 
        |Вам необходимо угадать 2 загаданных числа от 1 до 100 чтобы получить приз!
        |Либо угадать одно и получить утешительный приз :)
        |УДАЧИ! 
    """
const val ENTER_FIRST_NUMBER = "Введите первое число: "
const val ENTER_SECOND_NUMBER = "Введите второе число: "
const val CONGRATULATION_MESSAGE = "Поздравляем! Вы выиграли главный приз!"
const val CONSOLATION_PRIZE_MESSAGE = "Вы выиграли утешительный приз!"
const val INCORRECT_ANSWER_MESSAGE = "Неудача! Крутите барабан!"
const val CORRECT_ANSWER_MESSAGE = "Правильный ответ $FIRST_SECRET_NUMBER и $SECOND_SECRET_NUMBER"

fun main() {
    println(WELCOME_MESSAGE_1.trimMargin())
    println(ENTER_FIRST_NUMBER)
    val firstNumber: Int = readln().toInt()
    println(ENTER_SECOND_NUMBER)
    val secondNumber: Int = readln().toInt()

    val bothConditionsTrue: Boolean = ((firstNumber == FIRST_SECRET_NUMBER) && (secondNumber == SECOND_SECRET_NUMBER)) ||
            (firstNumber == SECOND_SECRET_NUMBER) && (secondNumber == FIRST_SECRET_NUMBER)
    val oneOfConditionsTrue: Boolean = ((firstNumber == FIRST_SECRET_NUMBER) || (secondNumber == SECOND_SECRET_NUMBER)) ||
            (firstNumber == SECOND_SECRET_NUMBER) || (secondNumber == FIRST_SECRET_NUMBER)

    if(bothConditionsTrue) {
        println(CONGRATULATION_MESSAGE)
    } else if (oneOfConditionsTrue) {
        println(CONSOLATION_PRIZE_MESSAGE)
        println(CORRECT_ANSWER_MESSAGE)
    } else {
        println(INCORRECT_ANSWER_MESSAGE)
        println(CORRECT_ANSWER_MESSAGE)
    }
}