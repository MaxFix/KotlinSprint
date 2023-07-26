package lesson_18

fun main() {
    val throws4: NumberOfFaces = FourFaces(4)
    val throws6: NumberOfFaces = SixFaces(6)
    val throws8: NumberOfFaces = EightFaces(8)

    val throwFaces = arrayOf<NumberOfFaces>(throws4, throws6, throws8)

    fun throwAllCubs(throws: Array<NumberOfFaces>) {
        throws.forEach { println(it.throwDice()) }
    }

    throwAllCubs(throwFaces)
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