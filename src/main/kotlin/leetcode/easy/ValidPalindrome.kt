package org.example.leetcode.easy

/**
 * [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/description/)
 */
object ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        // Logic
        while (left < right) {
            when {
                !s[left].isLetterOrDigit() -> left++
                !s[right].isLetterOrDigit() -> right--
                s[left].lowercaseChar() != s[right].lowercaseChar() -> return false
                else -> {
                    left++
                    right--
                }
            }
        }
        return true
    }
}
