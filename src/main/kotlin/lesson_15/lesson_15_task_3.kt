package lesson_15

fun main() {
    val user1 = CommonUser("Василий", "Обычный пользователь")
    val user2 = AdminUser("Евгений", "Администратор")

    user1.readMessage()
    user1.writeMessage()
    println()
    user2.canRemoveUser()
    user2.canRemoveMessage()
}

abstract class GeneralRights(val name: String, val role: String) {

    open fun readMessage() {
        println("Пользователь $name с ролью $role читает сообщения")
    }
    open fun writeMessage() {
        println("Пользователь $name с ролью $role пишет сообщение")
    }
}

class CommonUser(name: String, role: String) : GeneralRights(name, role)

class AdminUser(name: String, role: String) : GeneralRights(name, role) {

    fun canRemoveMessage() {
        println("Пользователь $name с ролью $role может удалять сообщения")
    }

    fun canRemoveUser() {
        println("Пользователь $name с ролью $role может удалять пользователей")
    }
}