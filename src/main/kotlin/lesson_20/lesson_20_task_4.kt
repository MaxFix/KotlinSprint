package lesson_20

fun main() {
    val list: List<String> = listOf("privet", "salut", "sydiey", "sedspyn", "poka")
    val lambdas = list.forEachIndexed { index, s ->
        if (index % 2 == 0) {
            println("Нажат элемент $s")
        } else {
        }
    }
}

