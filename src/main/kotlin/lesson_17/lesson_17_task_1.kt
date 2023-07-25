package lesson_17

fun main() {
    val quiz = QuizElement("What?", "All is OK")
    quiz.questionSetter("Why?")
    quiz.answerSetter("Because ..")
    println(quiz.answerGetter())
}

class QuizElement(
    private var question: String,
    private var answer: String,
) {
    fun questionSetter(question: String) {
        this.question = question
        println(question)
    }

    fun answerSetter(answer: String) {
        this.answer = answer
        println(answer)
    }

    fun answerGetter(): String {
        return answer
    }
}