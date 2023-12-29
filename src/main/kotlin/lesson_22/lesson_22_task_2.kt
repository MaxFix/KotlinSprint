package lesson_22

fun main() {
    val heavyBook = HeavyBook("Bible", "Jesus")
    val lightBook = LightBook("Road rule", "People")

    println(heavyBook)
    println(lightBook)
    /*
    Компилятор автоматически формирует функцию toString() с членами из свойств data class'a, объявленными в основном
    конструкторе, поэтому он отображается в человекочитаемом формате
    Тоесть ВСЕ свойства из основного конструктора будут учитываться в реализации toString()
    В обычном классе такого не происходит
    Тоесть на момент вывода данных объекта из обычного класса мы видим только его адрес в памяти
     */
}

class HeavyBook(
    name: String,
    author: String,
)

data class LightBook(
    val name: String,
    val author: String,
)