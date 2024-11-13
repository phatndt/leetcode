package array

import org.example.array.ArrayFunc
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ArrayFunc {
    @Test
    fun `reversed array should return correct array in case of odd size`() {
        val expected = intArrayOf(1, 2, 3, 2, 1)

        assertEquals(expected, ArrayFunc.reversedArray(expected))
    }

    @Test
    fun `reversed array should return correct array in case of even size`() {
        val expected = intArrayOf(1, 2, 3, 3, 2, 1)

        assertEquals(expected, ArrayFunc.reversedArray(expected))
    }
}