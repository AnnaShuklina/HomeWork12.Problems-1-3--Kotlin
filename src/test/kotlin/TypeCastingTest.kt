import org.junit.Assert.*
import org.junit.Test
import java.io.PrintStream
import java.io.ByteArrayOutputStream
import java.time.LocalDate

class TypeCastingTest {

    @Test
    fun testStringType() {
        val expectedOutput = "Я получил тип String = 'Hello', ее длина равна 5 символов"
        val capturedOutput = captureOutput { typeCasting("Hello") }
        assertEquals(expectedOutput, capturedOutput)
    }

    @Test
    fun testIntType() {
        val expectedOutput = "Я получил Int = 10, его квадрат равен 100"
        val capturedOutput = captureOutput { typeCasting(10) }
        assertEquals(expectedOutput, capturedOutput)
    }

    @Test
    fun testDoubleType() {
        val expectedOutput = "Я получил Double = 1.23, это число округляется до 1.23"
        val capturedOutput = captureOutput { typeCasting(1.23) }
        assertEquals(expectedOutput, capturedOutput)
    }

    @Test
    fun testLocalDateType() {
        val expectedOutput = "Я получил LocalDate 1990-01-01, она меньше чем дата основания Tinkoff"
        val capturedOutput = captureOutput { typeCasting(LocalDate.of(1990, 1, 1)) }
        assertEquals(expectedOutput, capturedOutput)
    }

    @Test
    fun testNullType() {
        val expectedOutput = "Объект равен null"
        val capturedOutput = captureOutput { typeCasting(null) }
        assertEquals(expectedOutput, capturedOutput)
    }

    private fun captureOutput(block: () -> Unit): String {
        val outputStream = System.out
        val capturedStream = ByteArrayOutputStream()
        System.setOut(PrintStream(capturedStream, true, "UTF-8"))
        block()
        System.setOut(outputStream)
        return capturedStream.toString("UTF-8").trim()
    }


}

