package lesson_21

fun main() {
    val word = "огонь"
    println(word.vowelCount())
}

fun String.vowelCount(): Int {
    val vowelsList = arrayOf("а", "е", "ё", "и", "о", "у", "ы", "э", "ю", "я")

    return this.count { it.lowercase() in vowelsList }
}