package lesson_13

fun main() {
    val book = PhoneBook("f", 123,null)
    println("${book.company}")
}

class PhoneBook(
    val name: String,
    val phoneNumber: Int,
    val company: String?,
) {

}