package lesson_5

const val WELCOME_MESSAGE = """Добро пожаловать в лотерею! 
        |Вам необходимо угадать 2 загаданных числ
        а от 1 до 100 чтобы получить приз!
        |Либо угадать одно и получить утешительный приз :)
        |УДАЧИ! 
    """
const val ENTER_FIRST_NUMBER = "Введите первое число: "
const val ENTER_SECOND_NUMBER = "Введите второе число: "
const val CONGRATULATION_MESSAGE = "Поздравляем! Вы выиграли главный приз!"
const val CONSOLATION_PRIZE_MESSAGE = "Вы выиграли утешительный приз!"
const val INCORRECT_ANSWER_MESSAGE = "Неудача! Крутите барабан!"
fun main() {
    var firstSecretNumber = (0..100).random()
    var secondSecretNumber = (0..100).random()
    println(WELCOME_MESSAGE.trimMargin())
    println(ENTER_FIRST_NUMBER)
    val firstNumber: Int = readln().toInt()
    println(ENTER_SECOND_NUMBER)
    val secondNumber: Int = readln().toInt()

    val bothConditionsTrue: Boolean = ((firstNumber == firstSecretNumber) && (secondNumber == secondSecretNumber)) ||
            (firstNumber == secondSecretNumber) && (secondNumber == firstSecretNumber)
    val oneOfConditionsTrue: Boolean = ((firstNumber == firstSecretNumber) || (secondNumber == secondSecretNumber)) ||
            (firstNumber == secondSecretNumber) || (secondNumber == firstSecretNumber)


    if(bothConditionsTrue) {
        println(CONGRATULATION_MESSAGE)
    } else if (oneOfConditionsTrue) {
        println(CONSOLATION_PRIZE_MESSAGE)
        println("Правильный ответ $firstSecretNumber и $secondSecretNumber")
    } else {
        println(INCORRECT_ANSWER_MESSAGE)
        println("Правильный ответ $firstSecretNumber и $secondSecretNumber")
    }
}