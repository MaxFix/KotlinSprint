package lesson_21

fun main() {
    val word = "огонь"
    println(word.vowelCount())
}

fun String.vowelCount(): Int {
    var lettersCount = 0
    val vowelsList = arrayOf("а", "е", "ё", "и", "о", "у", "ы", "э", "ю", "я")

    for (i in this) {
        if (vowelsList.contains(i.lowercase())) {
            lettersCount++
        }
    }
    return lettersCount
}