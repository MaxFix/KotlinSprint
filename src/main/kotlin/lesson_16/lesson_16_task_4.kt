package lesson_16

fun main() {
    val order = Order(123, "Ready")
    println("Номер заказа: ${order.getOrderNumber()} статус заказа: ${order.orderStatus}")
    order.applicationToManager("Completed")
    println("Номер заказа: ${order.getOrderNumber()} статус заказа: ${order.orderStatus}")
}

class Order(
    private val orderNumber: Int,
    var orderStatus: String,
) {
    fun getOrderNumber(): Int {
        return orderNumber
    }
    private fun changeOrderStatus(status: String) {
        orderStatus = status
    }

    fun applicationToManager(newStatus: String) {
        changeOrderStatus(newStatus)
    }
}