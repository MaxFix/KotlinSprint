package lesson_13

import java.util.*

fun main() {
    val contactsList: MutableList<PhoneBook3> = mutableListOf()

    fun createContact(): PhoneBook3? {
        println("Введите имя:")
        val name = readln().takeIf { it.isNotEmpty() }
        println("Введите номер телефона:")
        val phoneNumber = readln().toIntOrNull() ?: return null
        println("Введите название компании:")
        val company = readln().takeIf { it.isNotEmpty() }
        return PhoneBook3(name, phoneNumber, company)
    }

    do {
        val contact = createContact()
        if (contact != null) {
            contactsList.add(contact)
        }
        println("Если хотите добавить новую запись, введите \"да\"")
        val answer = readln()
    } while (answer.lowercase(Locale.getDefault()) == "да")

    contactsList.forEach {
        println(it.printContactInfo())
    }
}

class PhoneBook3(
    private val name: String?,
    private val phoneNumber: Int,
    private val company: String?,
) {
    fun printContactInfo(): String {
        return "Имя: $name\nНомер: $phoneNumber\nКомпания: $company\n"
    }
}