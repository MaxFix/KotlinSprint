package lesson_15

fun main() {
    val temperature = TemperatureMessage("Прогноз температуры")
    val rainfall = RainfallAmount("Количество осадков")
    println()
    temperature.sendMessage()
    rainfall.sendMessage()
}

abstract class BaseMessage(
    open val message: String,
) {
    open fun connectToServer() {
        println("Устанавливаем соединение с сервером")
    }

    open fun sendMessage() {
        connectToServer()
        println("Отправка данных $message")
    }
}

class TemperatureMessage(override val message: String) : BaseMessage(message) {
}
class RainfallAmount(override val message: String) : BaseMessage(message) {}