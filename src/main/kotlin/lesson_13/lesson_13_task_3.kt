package lesson_13

fun main() {
    val book = PhoneBook3("VK", 123,null)
    val book1 = PhoneBook3("OK", 321)
    val book2 = PhoneBook3("Mail", 231, "Mail Group")

    val contactsList: MutableList<PhoneBook3> = mutableListOf()
    contactsList.add(book)
    contactsList.add(book1)
    contactsList.add(book2)

    contactsList.forEach{
        println(it.printContactInfo())
    }
}

class PhoneBook3(
    private val name: String,
    private val phoneNumber: Int,
    private val company: String? = "[не указано]",
) {
    fun printContactInfo(): String {
        return "Имя: $name\nНомер: $phoneNumber\nКомпания: $company\n"
    }
}