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

abstract class Animals(
    val name: String,
) {
    open fun play() = "$name - играет"

    open fun sleep() = "$name - спит"

    abstract fun eat(): String
}

class Fox(name: String) : Animals(name) {
    override fun eat(): String = "$name - ест ягоды"
}

class Dog(name: String) : Animals(name) {
    override fun eat(): String = "$name - ест кости"
}

class Cat(name: String) : Animals(name) {
    override fun eat() :String = "$name - ест рыбу"
}