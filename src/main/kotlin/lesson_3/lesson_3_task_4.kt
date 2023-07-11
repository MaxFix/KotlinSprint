package lesson_3

fun main() {
    var from: String = "E2"
    var to: String = "E4"
    var counter: Int = 1
    var result: String = "$from-$to; $counter"
    println("$from-$to; $counter")

    from = "D2"
    to = "D3"
    counter = 2
    println("$from-$to; $counter")
}