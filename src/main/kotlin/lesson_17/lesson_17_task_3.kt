package lesson_17

fun main() {
    val folder = Folder("Test", 10, true)
    println(folder.folderName)
    println(folder.numberOfFiles)
}

class Folder(
    val name: String,
    val filesCount: Int,
    private val isSecret: Boolean,
) {
    val folderName: String
        get() = if (isSecret) "Секретная папка" else name

    val numberOfFiles: Int
        get() = if (isSecret) 0 else filesCount
}