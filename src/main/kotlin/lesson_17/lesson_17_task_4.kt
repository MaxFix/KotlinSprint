package lesson_17

fun main() {
    val package1 = Package(213, "Idaho")
    println(package1.getterProcessingPoint())
    println(package1.moveCounter)
    println()
    package1.processingPoint = "Sigaio"
    println(package1.getterProcessingPoint())
    println(package1.moveCounter)
}

class Package(
    private val number: Int,
    processingPoint: String
) {
    private var _processingPoint: String = processingPoint
        var processingPoint: String
            set(value) {
            _processingPoint = value
            moveCounter++
        }
            get() = _processingPoint

        var moveCounter = 0

    fun getterProcessingPoint(): String {
        return processingPoint
    }
}