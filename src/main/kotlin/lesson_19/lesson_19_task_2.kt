package lesson_19

fun main() {
    val product = Product("Ручка", 123, InternetShopCategory.CHANCELLERY)
    product.infoAboutProduct()
}

enum class InternetShopCategory {
    CLOTHES,
    CHANCELLERY,
    OTHER,
    ERROR,
}

class Product(
    val name: String,
    private val id: Int,
    private val category: InternetShopCategory,
) {
    fun infoAboutProduct() {
        val categoryName = textOfCategory(category)
        println(
            "Название продукта: $name\nНомер продукта: $id\n" +
                    "Категория продукта: $categoryName"
        )
    }
}

fun textOfCategory(category: InternetShopCategory): String {
    return when (category) {
        InternetShopCategory.CLOTHES -> "Одежда"
        InternetShopCategory.CHANCELLERY -> "Канцелярия"
        InternetShopCategory.OTHER -> "Другое"
        InternetShopCategory.ERROR -> "Ошибка"
    }
}