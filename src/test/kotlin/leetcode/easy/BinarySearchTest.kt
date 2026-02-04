package leetcode.easy

import org.example.leetcode.easy.BinarySearch
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test


class BinarySearchTest {

    @Test
    fun `search target exists middle`() {
        val nums = intArrayOf(1, 3, 5, 7, 9)
        assertEquals(2, BinarySearch.search(nums, 5))
    }

    @Test
    fun `search target exists first`() {
        val nums = intArrayOf(1, 3, 5, 7, 9)
        assertEquals(0, BinarySearch.search(nums, 1))
    }

    @Test
    fun `search target exists last`() {
        val nums = intArrayOf(1, 3, 5, 7, 9)
        assertEquals(4, BinarySearch.search(nums, 9))
    }

    @Test
    fun `search target not exists`() {
        val nums = intArrayOf(1, 3, 5, 7, 9)
        assertEquals(-1, BinarySearch.search(nums, 4))
    }

    @Test
    fun `search target smaller than all elements`() {
        val nums = intArrayOf(10, 20, 30)
        assertEquals(-1, BinarySearch.search(nums, 1))
    }

    @Test
    fun `search target greater than all elements`() {
        val nums = intArrayOf(10, 20, 30)
        assertEquals(-1, BinarySearch.search(nums, 100))
    }

    @Test
    fun `search empty array`() {
        val nums = intArrayOf()
        assertEquals(-1, BinarySearch.search(nums, 1))
    }

    @Test
    fun `search single element found`() {
        val nums = intArrayOf(5)
        assertEquals(0, BinarySearch.search(nums, 5))
    }

    @Test
    fun `search single element not found`() {
        val nums = intArrayOf(5)
        assertEquals(-1, BinarySearch.search(nums, 1))
    }

    @Test
    fun `search two elements found second`() {
        val nums = intArrayOf(1, 2)
        assertEquals(1, BinarySearch.search(nums, 2))
    }

    @Test
    fun `search two elements not found`() {
        val nums = intArrayOf(1, 2)
        assertEquals(-1, BinarySearch.search(nums, 3))
    }

    @Test
    fun `search large array`() {
        val nums = IntArray(1_000_000) { it }
        assertEquals(999_999, BinarySearch.search(nums, 999_999))
    }
}
