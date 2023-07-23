package lesson_14

fun main() {
    val post = Post("Сообщение поста", "Генрих Том")
    val comment = Comments("Сообщение комментария","Ковал Пот", post)

    post.publishPost()
    println()
    comment.publishPost()
}

open class Post(
    var messageText: String,
    val author: String,
) {
    open fun publishPost() {
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
    override fun publishPost() {
        println("Текст коммнетария: $messageText; Автор комментария : $author\n" +
                "Пост: ${post.messageText}; Автор поста: ${post.author}")
    }
}