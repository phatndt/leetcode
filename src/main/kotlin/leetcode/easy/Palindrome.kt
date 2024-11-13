package org.example.leetcode.easy


object Palindrome {
    fun isPalindrome(x: Int): Boolean {
        var temp = x
        var reversed = 0

        while (temp > 0) {
            reversed = (reversed * 10) + (temp % 10)
            temp /= 10
        }

        return x == reversed
    }

    fun isPalindrome1(x: Int): Boolean {
        val temp = x.toString()
        for (i in 0 until temp.length / 2) {
            return temp[i] != temp[temp.length - 1 - i]
        }
        return true
    }

    fun isPalindrome2(x: Int): Boolean = x.toString().reversed() == x.toString()
}