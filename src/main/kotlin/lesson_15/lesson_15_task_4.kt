package lesson_15

fun main() {
    val instr1 = Instrument("дудка", 12)
    instr1.search()
}

abstract class Product(
    open val name: String,
    inStock: Int,
)

class Instrument(
    override val name: String,
    inStock: Int,
) : Product(name, inStock), Searchable {
    override fun search() {
        println("Выполняется поиск комплектующих для $name")
    }
}

class Accessory(
    name: String,
    inStock: Int,
) : Product(name, inStock)

interface Searchable {
    fun search()
}