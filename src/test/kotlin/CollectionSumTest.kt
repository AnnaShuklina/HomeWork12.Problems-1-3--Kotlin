import org.junit.Test
import kotlin.test.assertEquals

class CollectionSumTest {

    @Test
    fun `test calculateSum with empty input`() {
        val list = emptyList<Double>()
        val expectedSum = 0.0

        val actualSum = calculateSum(list)

        assertEquals(expectedSum, actualSum, 0.01)
    }

    @Test
    fun `test calculateSum with all values greater than 25`() {
        val list = listOf(30.0, 26.0, 27.0, 28.0, 29.0)
        val expectedSum = 28.0

        val actualSum = calculateSum(list)

        assertEquals(expectedSum, actualSum, 0.01)
    }

    @Test
    fun `test calculateSum with null values in input`() {
        val list = listOf(13.31, null, 3.98, null, 12.0, 2.99, 9.0)
        val expectedSum = 22.09

        val actualSum = calculateSum(list)

        assertEquals(expectedSum, actualSum, 0.01)
    }

    @Test
    fun `test calculateSum with valid input`() {
        val list = listOf(26.31, 13.98, 12.23, 12.99, 29.0)
        val expectedSum = 21.49

        val actualSum = calculateSum(list)

        assertEquals(expectedSum, actualSum, 0.01)
    }

}

