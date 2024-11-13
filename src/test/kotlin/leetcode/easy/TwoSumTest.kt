package leetcode.easy

import org.example.leetcode.easy.TwoSum
import org.junit.jupiter.api.assertThrows
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class TwoSumTest {
    @Test
    fun `twoSum1 should return 9`() {
        val arr = intArrayOf(1, 3, 5, 6, 7, 8, 9)
        val target = 17

        val expected = intArrayOf(arr.lastIndex - 1, arr.lastIndex)

        assertContentEquals(expected, TwoSum.twoSum(arr, target))
    }

    @Test
    fun `twoSum2 should throw exception`() {
        val arr = intArrayOf(1, 3, 5, 6, 7, 8, 9)
        val target = 100

        assertEquals(
            "Invalid number",
            assertThrows<IllegalStateException> {
                TwoSum.twoSum(arr, target)
            }.message,
        )
    }
}