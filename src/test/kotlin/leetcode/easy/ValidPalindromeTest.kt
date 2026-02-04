package leetcode.easy

import org.example.leetcode.easy.ValidPalindrome
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidPalindromeTest {
    @Test
    fun `test valid palindrome`() {
        assertTrue(ValidPalindrome.isPalindrome(""))
        assertTrue(ValidPalindrome.isPalindrome(" "))
        assertTrue(ValidPalindrome.isPalindrome("aa"))
        assertTrue(ValidPalindrome.isPalindrome("a22a"))
        assertTrue(ValidPalindrome.isPalindrome("a2A"))
    }

    @Test
    fun `test invalid palindrome`() {
        assertFalse(ValidPalindrome.isPalindrome("a2"))
        assertFalse(ValidPalindrome.isPalindrome("A2"))
        assertFalse(ValidPalindrome.isPalindrome("A3 "))
    }
}