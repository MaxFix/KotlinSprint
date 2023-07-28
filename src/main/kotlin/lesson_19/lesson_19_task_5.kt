package lesson_19

fun main() {

    println("Введите имя и пол, каждый с новой строки")
    val usersList: MutableList<Human> = mutableListOf()

    for (i in 1..5) {
        println("Введите имя")
        val name = readln()
        println("Введите пол, доступны варианты ${Gender.FEMALE.description}/${Gender.MALE.description}")
        val gender = readln()
        val user = Human(name, gender)
        usersList.add(user.makeUser())
    }

    usersList.forEach{
        println(it.name)
        println(it.gender)
    }
}

enum class Gender(val description: String) {
    MALE("Мужской"),
    FEMALE("Женский"),
}

class Human(val name: String, val gender: String) {

    fun makeUser(): Human {
        return Human(name, gender)
    }
}