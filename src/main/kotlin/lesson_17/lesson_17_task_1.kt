package lesson_17

fun main() {
    val quiz = QuizElement()
    println(quiz.question)
    println(quiz.answer)
}

class QuizElement {
    var question: String = "Why?"
        set(value) {
            field = value
        }

    var answer: String = "Bacause.."
        get() = field
        set(value) {
            field = value
        }
}