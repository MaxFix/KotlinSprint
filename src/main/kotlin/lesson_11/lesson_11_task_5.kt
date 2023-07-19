package lesson_11

fun main() {
    val forum = Forum()

    val user1 = forum.newUser(123, "Maksim", "123", "gang@mail.ri", "abcde")
    val user2 = forum.newUser(124, "Evgen", "321", "am@yandex.ri", "edcba")

    forum.newMessage(user1.id, "Hello world!")
    forum.newMessage(user2.id, "Привет ${user2.login}")

    forum.printThread()
}

class Forum(

) {
    private val users = mutableListOf<User>()
    private val messages = mutableListOf<Message>()

    fun newUser(id: Int, login: String, password: String, email: String, bio: String): User {
        val user = User(id, login, password, email, bio)
        users.add(user)
        return user
    }

    fun newMessage(authorId: Int, message: String) {
        val author = users.find { it.id == authorId}
        if(author != null) {
            val newMessage = Message(author, message)
            messages.add(newMessage)
        } else println("Пользователь не найден")
    }

    fun printThread() {
        messages.forEach{
            message -> message.printMessage()
        }
    }
}

class User(
    val id: Int,
    val login: String,
    private var password: String,
    val email: String,
    var bio: String,
) { }

class Message(
    private val author: User,
    private val message: String,
) {
    fun printMessage() {
        println("${author.login}: $message")
    }
}