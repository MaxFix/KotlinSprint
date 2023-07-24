package lesson_15

fun main() {
    val cruсian = Crucian()
    cruсian.swim()
    println()

    val seagull = Seagull()
    seagull.fly()
    seagull.walk()
    println()

    val duck = Duck()
    duck.fly()
    duck.swim()
    duck.walk()
}

interface Swimming {
    fun swim()
}

interface Flying {
    fun fly()
}

interface Walking {
    fun walk()
}

class Crucian : Swimming {
    override fun swim() {
        println("Карась плавает")
    }
}

class Seagull : Flying, Walking {
    override fun fly() {
        println("Чайка летает")
    }

    override fun walk() {
        println("Чайка ходит")
    }
}

class Duck : Walking, Swimming, Flying {
    override fun walk() {
        println("Утка ходит")
    }

    override fun swim() {
        println("Утка плавает")
    }

    override fun fly() {
        println("Утка летает")
    }
}