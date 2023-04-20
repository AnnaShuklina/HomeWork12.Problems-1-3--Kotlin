
fun MutableList<Int>.squareAll() {
    val iterator = this.listIterator()
    while (iterator.hasNext()) {
        val next = iterator.next()
        iterator.set(next * next)
    }
}

fun main(args: Array<String>) {
    println("Возведение элементов колллекции в квадрат")
    val list = mutableListOf(1, 4, 9, 16, 25)
    list.squareAll() // возводим все элементы в квадрат
    println(list) // [1, 4, 9, 16, 25]

    val list2 = mutableListOf(1, 4, 9)
    list2.squareAll() // возводим все элементы в квадрат
    println(list2) // [1, 16, 81]
}