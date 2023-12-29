package lesson_22

fun main() {
    val firstRB = RegularBook("Tom Soyer", "Tven")
    val secondRB = RegularBook("Tom Soyer", "Tven")

    val firstDB = DataBook("In Search of Lost Time", "Marcel Proust")
    val secondDB = DataBook("In Search of Lost Time", "Marcel Proust")

println("Сравнения для обычного класса:")
    println("Структурное равенство ${firstRB == secondRB}") // тут проверяется равенство структур объектов
    println("Структурное равенство, аналогичное предыдущему ${firstRB.equals(secondRB)}")
    println("Ссылочное равенство ${firstRB === secondRB}") // тут проверяется равенство ссылок на объекты для обычного класса
println("================================")
    println(firstDB == secondDB)
    println(firstDB.equals(secondDB))
    println(firstDB === secondDB)
    /*
    В обычных классах сравниваются ссылки на объекты в памяти, а не значения
    В data классах сравниваем проинициализированные данные
    Оператор === не зависит от типа класса и всегда сравнивает ссылки на объекты
     */
}

class RegularBook(
    name: String,
    author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)