package leetcode.easy

import org.example.leetcode.easy.TwoSum
import org.example.leetcode.easy.TwoSum.twoSum2
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

    @Test
    fun `twoSum1 should return 6`() {
        val arr = intArrayOf(3,2,4)
        val target = 6

        val expected = intArrayOf(arr.lastIndex - 1, arr.lastIndex)

        assertContentEquals(expected, TwoSum.twoSum(arr, target))
    }

    @Test
    fun testTwoSum2() {
        assertContentEquals(intArrayOf(0, 1), twoSum2(intArrayOf(2, 7, 11, 15), 9))
        assertContentEquals(intArrayOf(1, 2), twoSum2(intArrayOf(3, 2, 4), 6))
        assertThrows<IllegalStateException> {
            twoSum2(intArrayOf(2, 7, 11, 15), 30)
        }
    }
}