package lesson_15

fun main() {
    val seagull = Seagull().seagullMove()
    val crusian = Crusian().crusianMove()
    val duck = Duck().duckMove()
}

interface CrusianInterface {
    fun crusianMove()
}

interface SeagullInterface {
    fun seagullMove()
}

interface DuckInterface {
    fun duckMove()
}

class Crusian : CrusianInterface {
    override fun crusianMove() {
        println("Карась плавает")
    }
}

class Seagull : SeagullInterface {
    override fun seagullMove() {
        println("Чайка летает")
    }
}

class Duck : DuckInterface {
    override fun duckMove() {
        println("Утка бегает")
    }
}