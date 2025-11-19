package leetcode.easy

import org.example.leetcode.easy.ValidParentheses
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.test.Test

class ValidParenthesesTest {
    private val solver = ValidParentheses()

    @Test
    fun testValidCases() {
        assertTrue(solver.isValid("()"))
        assertTrue(solver.isValid("()[]{}"))
        assertTrue(solver.isValid("([])"))
        assertTrue(solver.isValid("{[]}"))
        assertTrue(solver.isValid("((()))"))
        assertTrue(solver.isValid("{[()()]}"))
        assertTrue(solver.isValid("()()"))
    }

    @Test
    fun testInvalidCases() {
        assertFalse(solver.isValid("("))
        assertFalse(solver.isValid(")"))
        assertFalse(solver.isValid("([)]"))
        assertFalse(solver.isValid("{[}]"))
        assertFalse(solver.isValid("(]"))
        assertFalse(solver.isValid("(()"))
        assertFalse(solver.isValid("((())"))
        assertFalse(solver.isValid("()))"))
        assertFalse(solver.isValid("}{"))
    }

    @Test
    fun testMixedCharacters() {
        assertTrue(solver.isValid("a(b)c{d}[e]f".filter { it in "[]{}()" }))
        assertFalse(solver.isValid("(a[)]".filter { it in "[]{}()" }))
    }

    @Test
    fun testLongValidString() {
        assertTrue(solver.isValid("({[]})({[]})({[]})"))
    }

    @Test
    fun testLongInvalidString() {
        assertFalse(solver.isValid("({[]})({[})({[]})"))
    }
}