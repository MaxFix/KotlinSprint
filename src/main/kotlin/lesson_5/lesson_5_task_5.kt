package lesson_5

const val WELCOME_MESSAGE = """Добро пожаловать в лотерею! 
        |Вам необходимо угадать 2 загаданных числ
        а от 1 до 100 чтобы получить приз!
        |Либо угадать одно и получить утешительный приз :)
        |УДАЧИ! 
    """
const val ENTER_FIRST_NUMBER_LESSON5 = "Введите первое число: "
const val ENTER_SECOND_NUMBER_LESSON5 = "Введите второе число: "
const val CONGRATULATION_MESSAGE_LESSON5 = "Поздравляем! Вы выиграли главный приз!"
const val CONSOLATION_PRIZE_MESSAGE_LESSON5 = "Вы выиграли утешительный приз!"
const val INCORRECT_ANSWER_MESSAGE_LESSON5 = "Неудача! Крутите барабан!"
fun main() {
    var firstSecretNumber = (0..100).random()
    var secondSecretNumber = (0..100).random()
    println(WELCOME_MESSAGE)
    println(ENTER_FIRST_NUMBER_LESSON5)
    val firstNumber: Int = readln().toInt()
    println(ENTER_SECOND_NUMBER_LESSON5)
    val secondNumber: Int = readln().toInt()

    val bothConditionsTrue: Boolean = ((firstNumber == firstSecretNumber) && (secondNumber == secondSecretNumber)) ||
            (firstNumber == secondSecretNumber) && (secondNumber == firstSecretNumber)
    val oneOfConditionsTrue: Boolean = ((firstNumber == firstSecretNumber) || (secondNumber == secondSecretNumber)) ||
            (firstNumber == secondSecretNumber) || (secondNumber == firstSecretNumber)


    if(bothConditionsTrue) {
        println(CONGRATULATION_MESSAGE_LESSON5)
    } else if (oneOfConditionsTrue) {
        println(CONSOLATION_PRIZE_MESSAGE_LESSON5)
        println("Правильный ответ $firstSecretNumber и $secondSecretNumber")
    } else {
        println(INCORRECT_ANSWER_MESSAGE_LESSON5)
        println("Правильный ответ $firstSecretNumber и $secondSecretNumber")
    }
}