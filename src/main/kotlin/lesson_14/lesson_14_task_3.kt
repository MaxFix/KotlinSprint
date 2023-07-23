package lesson_14

fun main() {
    val post = Post("Сообщение поста", "Генрих Том")
    val comment = Comments("Сообщение комментария","Ковал Пот", post)

    post.send()
    println()
    comment.send()
}

open class Post(
    var messageText: String,
    val author: String,
) {
    open fun send() {
        println("Текст поста: $messageText; Автор: $author")
    }
}

class Comments(
    messageText: String,
    author: String,
    private val post: Post,
) : Post(
    messageText, author
) {
    override fun send() {
        println("Текст коммнетария: $messageText; Автор комментария : $author\n" +
                "Пост: ${post.messageText}; Автор поста: ${post.author}")
    }
}