package lesson_18

fun main() {
    val throws4: FourFaces = FourFaces(4)
    val throws6: SixFaces = SixFaces(6)
    val throws8: EightFaces = EightFaces(8)

    println("Бросаем кубик с 4 гранями: ${throws4.throwDice()}")
    println("Бросаем кубик с 6 гранями: ${throws6.throwDice()}")
    println("Бросаем кубик с 8 гранями: ${throws8.throwDice()}")
}

open class NumberOfFaces {
    open fun throwDice() = 0
}
class FourFaces(
    private val fourFacesCount: Int,
) : NumberOfFaces() {
    override fun throwDice(): Int {
        return (1..fourFacesCount).random()
    }
}

class SixFaces(
    private val sixFacesCount: Int,
) : NumberOfFaces() {
    override fun throwDice(): Int {
        return (1..sixFacesCount).random()
    }
}

class EightFaces(
    private val eightFacesCount: Int,
) : NumberOfFaces() {
    override fun throwDice(): Int {
        return (1..eightFacesCount).random()
    }
}