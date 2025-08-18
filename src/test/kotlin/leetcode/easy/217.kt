package leetcode.easy

import org.example.leetcode.easy.ContainsDuplicateSolution
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ContainsDuplicateTest {
    @Test
    fun `test not contains`() {
        val input = intArrayOf(1,2,3,4)
        assertFalse( ContainsDuplicateSolution().containsDuplicate(input))
        assertFalse( ContainsDuplicateSolution().containsDuplicate2(input))
    }

    @Test
    fun `test contains`() {
        val input = intArrayOf(1,1,3,4)
        assertTrue( ContainsDuplicateSolution().containsDuplicate(input))
        assertTrue( ContainsDuplicateSolution().containsDuplicate2(input))
    }
}
