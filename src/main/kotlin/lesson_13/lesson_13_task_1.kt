package lesson_13

fun main() {
    val book = Contact("f", 123,null)
    println("${book.company}")
}

class Contact(
    val name: String,
    val phoneNumber: Int,
    val company: String?,
) {

}