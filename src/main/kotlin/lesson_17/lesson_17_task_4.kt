package lesson_17

fun main() {
    val package1 = Package(213, "Idaho")
    println(package1.processingPoint)
    println(package1.moveCounter)
    println()
    package1.processingPoint = "Sigaio"
    println(package1.processingPoint)
    println(package1.moveCounter)
}

class Package(
    private val number: Int,
    processingPoint: String
) {
        var processingPoint: String = processingPoint
            set(value) {
            field = value
            moveCounter++
        }

        var moveCounter = 0
}
