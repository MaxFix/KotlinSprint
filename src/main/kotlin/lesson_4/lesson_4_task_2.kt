package lesson_4

fun main() {
    val minWeight: Int = 35 //min кг
    val maxWeight: Int = 100 //max кг
    val maxVolume: Int = 100 //max литров

    var cargoWeight: Int = 20
    var cargoVolume: Int = 180
    var anotherCargoWeight: Int = 50
    var anotherCargoVolume: Int = 100

    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
            "${(minWeight < cargoWeight && cargoWeight <= maxWeight) && (cargoVolume < maxVolume)}\n" +
            "Груз с весом $anotherCargoWeight кг и объемом $anotherCargoVolume л соответствует категории 'Average': " +
            "${(minWeight < anotherCargoWeight && anotherCargoWeight <= maxWeight) && (anotherCargoVolume < maxVolume)}")
}