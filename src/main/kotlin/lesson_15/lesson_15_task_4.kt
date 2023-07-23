package lesson_15

fun main() {
    val instr1 = Instrument("дудка", 12)
    instr1.search()
}

open class Instrument(
    val name: String,
    val inStock: Int,
) : Searchable {
    override fun search() {
        println("Выполняется поиск комплектующих для $name")
    }
}

class Accessory (
    name: String,
    inStock: Int,
) : Instrument(name, inStock)

interface Searchable {
    fun search()
}