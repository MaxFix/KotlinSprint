package lesson_19

fun main() {
    fun getGender(description: String): Gender {
        return when (description) {
            Gender.MALE.description -> Gender.MALE
            Gender.FEMALE.description -> Gender.FEMALE
            else -> Gender.OTHER
        }
    }

    println("Введите имя и пол, каждый с новой строки")
    val usersList: MutableList<Human> = mutableListOf()

    for (i in 1..5) {
        println("Введите имя")
        val name = readln()

        println("Введите пол, доступны варианты ${Gender.FEMALE.description}/${Gender.MALE.description}")
        val gender = readln()

        val test = getGender(gender)
        val user = Human(name, test)

        usersList.add(user)
    }

    usersList.forEach {
        println(it.name)
        println(it.gender)
    }
}

enum class Gender(val description: String) {
    MALE("Мужской"),
    FEMALE("Женский"),
    OTHER("Другой"),
}

class Human(val name: String, val gender: Gender)