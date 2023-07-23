package lesson_14

fun main() {
    val moon = Satellite("Луна", false, false, false, true)
    val mars = Satellite("Марс", false, true, true, true)
    val earth = Planet("Земля", true, true, true, true,
        listOf(moon, mars))

    println("Инфо планеты")
    earth.description()
}

open class CelestialBodies(
    val name: String,
    val inhabited: Boolean,     //обитаем
    val hasAtmosphere: Boolean, //имеет атмосферу
    val hasWater: Boolean,      //имеет воду
    val suitableForDisembarkation: Boolean, //пригоден для высадки
) {
    open fun description() {
        println("Обитаема: $inhabited\nИмеет атмосферу: $hasAtmosphere\n" +
                "Имеет воду: $hasWater\nПригодна для высадки: $suitableForDisembarkation\n")
    }
}

class Planet(
    name: String,
    inhabited: Boolean,
    hasAtmosphere: Boolean,
    hasWater: Boolean,
    suitableForDisembarkation: Boolean,
    private var satellites: List<Satellite>,
) : CelestialBodies(name, inhabited, hasAtmosphere, hasWater, suitableForDisembarkation)
{
    override fun description() {
        println("Планета : $name\nОбитаема: $inhabited\nИмеет атмосферу: $hasAtmosphere\n" +
                "Имеет воду: $hasWater\nПригодна для высадки: $suitableForDisembarkation\n" +
                "Спутники планеты:")
        for(satellite in satellites){ println(satellite.name)}
    }
}

class Satellite(
    name: String,
    inhabited: Boolean,
    hasAtmosphere: Boolean,
    hasWater: Boolean,
    suitableForDisembarkation: Boolean,
) : CelestialBodies(name, inhabited, hasAtmosphere, hasWater, suitableForDisembarkation)
{
    override fun description() {
        println("Имя спутника: $name")
    }
}