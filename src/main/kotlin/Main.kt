fun main() {
    val crystal: Byte = 7
    val metal: Byte = 11
    val crystalWithBuff: Double = crystal * 0.2
    val metalWithBuff: Double = metal * 0.2
    println("Количество бонусов по кристаллической руде: ${crystalWithBuff.toInt()} " +
            "\nКоличество бонусов по железной руде: ${metalWithBuff.toInt()}")
}