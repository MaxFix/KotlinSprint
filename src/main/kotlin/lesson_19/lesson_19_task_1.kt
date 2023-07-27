package lesson_19

fun main() {
    println("Этих рыб Вы можете добавить себе в аквариум: ")
    for (i in Fish.values()) {
        println(i.fish)
    }
}

enum class Fish(val fish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Путушок"),
}
