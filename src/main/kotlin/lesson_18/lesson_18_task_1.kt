package lesson_18

import lesson_15.Product

fun main() {
    val order = Order()
    order.infoAboutOrder(123, "Чайник")
    order.infoAboutOrder(123, listOf("Кофеварка","Сотейник", "Чайник"))
}

class Order {

    fun infoAboutOrder(
        orderNumber: Int,
        product: String,
    ) {
        println("Заказан товар: $product")
    }

    fun infoAboutOrder(
        orderNumber: Int,
        product: List<String>,
    ) {
        println("Заказаны следующие товары:: $product")
    }
}