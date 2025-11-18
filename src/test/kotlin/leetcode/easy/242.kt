package leetcode.easy

import org.example.leetcode.easy.ValidAnagramSolution
import kotlin.test.Test
import kotlin.test.assertFalse

class ValidAnagramTest {
    @Test
    fun `test case 1`() {
        assertFalse(ValidAnagramSolution().isAnagram("ab", "a"))
    }
}