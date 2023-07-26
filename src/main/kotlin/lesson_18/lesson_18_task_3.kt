package lesson_18

fun main() {
    val fox: Animals = Fox("Alice")
    val cat: Animals = Cat("Murka")
    val dog: Animals = Dog("Sam")

    val animals = arrayOf(fox, cat, dog)

    fun animalsActives(animals: Array<Animals>) {
        animals.forEach {
            println(it.play())
            println(it.sleep())
            println(it.eat())
        }
    }

    animalsActives(animals)
}

open class Animals(
    val name: String,
) {
    open fun play() = "$name - играет"

    open fun sleep() = "$name - спит"

    open fun eat() = ""
}

class Fox(name: String) : Animals(name) {
    override fun eat(): String {
        return "$name - ест ягоды"
    }
}

class Dog(name: String) : Animals(name) {
    override fun eat(): String {
        return "$name - ест кости"
    }
}

class Cat(name: String) : Animals(name) {
    override fun eat(): String {
        return "$name - ест рыбу"
    }
}