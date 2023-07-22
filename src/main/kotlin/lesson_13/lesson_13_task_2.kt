package lesson_13

fun main() {
    val book = Contact2("VK", 123,null)
    val book1 = Contact2("OK", 321)
    println("${book.printContactInfo()}\n\n${book1.printContactInfo()}")
}

class Contact2(
    private val name: String,
    private val phoneNumber: Int,
    private val company: String? = null,
) {
    fun printContactInfo(): String {
        return "Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "[не указано]"}"
    }
}