package lesson_21

fun main() {
    val skills = mapOf(Pair("Power", 10),Pair("Magic", 13),Pair("Attack", 24),Pair("Survive", -1))
    println(skills.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {
    var maxValue = 0
    for ((key, value) in this) {
        if (value > maxValue) {
            maxValue = value
        }
    }
    return filterValues { it == maxValue }.keys.toList()[0]
}