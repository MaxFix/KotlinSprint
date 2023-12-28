package lesson_21

import java.io.File

fun main() {
    val file = File("testFile.txt")
    val word = "typo"
    val word2 = "aws"
    file.writeWordToFile(word)
    file.writeWordToFile(word2)
}

fun File.writeWordToFile(word: String) {
    val text = readText()
    val resultText = "$word\n$text"
    this.writeText(resultText)
}