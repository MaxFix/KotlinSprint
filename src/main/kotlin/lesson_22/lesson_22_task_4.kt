package lesson_22

fun main() {
    val test1 = MainScreenState("test")
    val test2 = MainScreenState("")
    val test3 = MainScreenState("123")

    test1.loadData("abc")
    test2.loadData("1")
    test3.loadData("123")
}

data class MainScreenState(
    val data: String,
    var isLoading: Boolean = true,
) {
    fun loadData(userData: String) {
        if (data.isEmpty()) {
            println("Данные отсутствуют, загрузка остановлена")
            isLoading = !isLoading
            println("Состояние загрузки $isLoading")
        }
        if (data.contentEquals(userData)) {
            println("Данные уже скачаны")
            isLoading = !isLoading
            println("Состояние загрузки $isLoading")
        }
        if (data.isNotEmpty() && !(data.contentEquals(userData))) {
            println("Загрузка данных началась")
            println("Состояние загрузки $isLoading")
        }
    }
}