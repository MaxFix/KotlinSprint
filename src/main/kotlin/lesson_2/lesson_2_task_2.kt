package lesson_2

fun main() {
    val normalWorkersCount: Byte = 50
    val normalWorkersSalary: Double = 30000.0
    val newWorkersCount: Byte = 30
    val newWorkersSalary: Double = 20000.0

    val costForNormalWorkers : Double = normalWorkersSalary * normalWorkersCount
    val costForNewWorkers : Double = newWorkersSalary * newWorkersCount

    val generalExpensesForAllWorkers : Double = costForNormalWorkers + costForNewWorkers
    val averageSalaryForMiddleWorker : Double = generalExpensesForAllWorkers/(normalWorkersCount + newWorkersCount)

    println("Расходы на выплату зарплаты постоянных сотрудников: $costForNormalWorkers")
    println("Общие расходы по ЗП после прихода стажеров: $costForNewWorkers")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalaryForMiddleWorker")
}