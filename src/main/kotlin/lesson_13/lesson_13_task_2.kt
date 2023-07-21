package lesson_13

fun main() {
    val book = PhoneBook("VK", 123,null)
    val book1 = PhoneBook("OK", 321)
    println("${book.printContactInfo()}\n\n${book1.printContactInfo()}")
}

class PhoneBook(
    private val name: String,
    private val phoneNumber: Int,
    private val company: String? = "[не указано]",
) {
    fun printContactInfo(): String {
        return "Имя: $name\nНомер: $phoneNumber\nКомпания: $company"
    }
}