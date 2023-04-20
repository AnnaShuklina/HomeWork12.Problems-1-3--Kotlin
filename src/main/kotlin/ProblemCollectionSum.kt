
fun calculateSum(list: List<Double?>): Double {
    return list
        .mapNotNull { it?.let { if (it.toInt() % 2 == 0) it * it else it / 2 } }
        .filter { it <= 25 }
        .sortedDescending()
        .take(10)
        .sum()
        .round(2) // округляем результат до двух знаков после запятой
}

fun Double.round(decimals: Int): Double {
    var multiplier = 1.0
    repeat(decimals) { multiplier *= 10 }
    return kotlin.math.round(this * multiplier) / multiplier
}

fun main() {
    val list = listOf(13.31, 3.98, 12.0, 2.99, 9.0)
    val sum = calculateSum(list)
    println("Искомая сумма элементов в оставшейся коллекции = $sum")

//    val list1 = listOf(30.0, 26.0, 27.0, 28.0, 29.0)
//    val sum1 = calculateSum(list1)
//    println("Искомая сумма элементов в оставшейся коллекции = $sum1")
//
//    val list2 = listOf(26.31, 13.98, 12.23, 12.99, 29.0)
//    val sum2 = calculateSum(list2)
//    println("Искомая сумма элементов в оставшейся коллекции = $sum2")


}
