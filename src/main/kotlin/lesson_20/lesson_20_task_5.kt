package lesson_20

fun main() {

    val robot = Robot()
    robot.say()
    robot.setModifier { phrase -> phrase.split(" ").reversed().joinToString(" ") }
    robot.say()

}

class Robot {
    var phraseModifier: (String) -> String = { it }

    private val phrases = listOf(
        "Стремитесь не к успеху, а к ценностям, которые он дает",
        "Надо любить жизнь больше, чем смысл жизни",
        "Начинать всегда стоит с того, что сеет сомнения",
        "Настоящая ответственность бывает только личной",
        "Неосмысленная жизнь не стоит того, чтобы жить"
    )

    fun say() {
        val phrase = phrases.random()
        println(phraseModifier(phrase))
    }

    fun setModifier(modifier: (String) -> String) {
        this.phraseModifier = modifier
    }
}