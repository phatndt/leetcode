package org.example.leetcode.easy

import java.util.Stack

/**
 * [valid-parentheses-leetcode](https://leetcode.com/problems/valid-parentheses/description/)
 */
class ValidParentheses {
    //    fun isValid(s: String): Boolean {
//        if (s.length <= 1) return false
//
//        val openingBracketStack = Stack<Char>()
//        val pairBrackets = mapOf(
//            '{' to '}',
//            '[' to ']',
//            '(' to ')',
//        )
//        for (index in s.indices) {
//            if (s[index] in pairBrackets.keys) {
//                openingBracketStack.push(s[index])
//                continue
//            }
//
//            if (openingBracketStack.isEmpty() || pairBrackets[openingBracketStack.pop()] != s[index]) return false
//        }
//        return openingBracketStack.isEmpty()
//    }
    fun isValid(s: String): Boolean {
        val openingBracketStack = Stack<Char>()
        for (element in s) {
            when {
                element.isOpenedBracket() -> openingBracketStack.push(element)
                openingBracketStack.isEmpty() || openingBracketStack.pop().isOpenedToClosed() != element -> return false
            }

        }
        return openingBracketStack.isEmpty()
    }

    private fun Char.isOpenedBracket() = this == '{' || this == '[' || this == '('
    private fun Char.isClosedBracket() = this == '}' || this == ']' || this == ')'
    private fun Char.isOpenedToClosed() = when (this) {
        '{' -> '}'
        '[' -> ']'
        '(' -> ')'
        else -> throw IllegalArgumentException("")
    }
}