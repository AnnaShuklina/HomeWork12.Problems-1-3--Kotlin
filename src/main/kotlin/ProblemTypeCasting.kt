import java.time.LocalDate
import java.util.logging.Handler

fun typeCasting(obj: Any?) {
    when (obj) {
        is String -> {
            val length = obj.length
            println("Я получил тип String = '$obj', ее длина равна $length символов")
        }
        is Int -> {
            val square = obj * obj
            println("Я получил Int = $obj, его квадрат равен $square")
        }
        is Double -> {
            val rounded = "%.2f".format(obj).replace(",", ".").toDouble()
            println("Я получил Double = $obj, это число округляется до $rounded")
        }
        is LocalDate -> {
            val tinkoffFoundingYear = 2006
            val tinkoffFoundingMonth = 12
            val tinkoffFoundingDay = 24

            val year = obj.year
            val month = obj.monthValue
            val day = obj.dayOfMonth

            val comparisonResult = year < tinkoffFoundingYear
                    || (year == tinkoffFoundingYear && month < tinkoffFoundingMonth)
                    || (year == tinkoffFoundingYear && month == tinkoffFoundingMonth && day < tinkoffFoundingDay)

            val comparisonMessage = if (comparisonResult) "меньше" else "не меньше"

            println("Я получил LocalDate $obj, она $comparisonMessage чем дата основания Tinkoff")

        }

        null -> {
            println("Объект равен null")
        }
        else -> {
            println("Мне этот тип неизвестен")
        }
    }
}



fun main() {
    typeCasting("Привет, Андрей, ну где ты был, ну обними меня скорей!")
    typeCasting(145)
    typeCasting(145.0)
    typeCasting(145.2817812)
    typeCasting(LocalDate.of(1990, 1, 1))
    typeCasting(null)
    typeCasting(Handler::class)


}

