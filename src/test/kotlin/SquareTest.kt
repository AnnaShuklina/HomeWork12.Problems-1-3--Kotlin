import org.junit.Assert.*
import org.junit.Test

class SquareTest {

    @Test
    fun testSquareAll() {
        val list = mutableListOf(1, 2, 3);
        list.squareAll();
        assertEquals(listOf(1, 4, 9), list);
    }

    @Test
    fun testSquareAllWithNegativeNumbers() {
        val list = mutableListOf(-2, 0, 2);
        list.squareAll();
        assertEquals(listOf(4, 0, 4), list);
    }

    @Test
    fun testSquareAllWithEmptyList() {
        val list = mutableListOf<Int>();
        list.squareAll();
        assertTrue(list.isEmpty());
    }

    @Test
    fun testSquareAllWithOneElementList() {
        val list = mutableListOf(5);
        list.squareAll();
        assertEquals(listOf(25), list);
    }

    @Test
    fun testSquareAllWithLargeList() {
        val list = mutableListOf<Int>();
        for (i in 1..10000) {
            list.add(i);
        }
        list.squareAll()
        for (i in 1..10000) {
            assertEquals(i * i, list[i - 1]);
        }
    }

    @Test
    fun testSquareAllWithDuplicateElements() {
        val list = mutableListOf(2, 3, 2, 3, 2, 3);
        list.squareAll();
        assertEquals(listOf(4, 9, 4, 9, 4, 9), list);
    }
}
