package org.example.leetcode.easy

object NumberToRoman {
    fun romanToInt(s: String): Int {
        if (s.isEmpty() || s.length > 15) throw IllegalArgumentException()

        var number = 0

        var i = 0
        while (i < s.length) {
            if (i + 1 < s.length && mapOfExceptionRoman.containsKey("${s[i]}${s[i + 1]}")) {
                number += covertRomanCharacterToNumber("${s[i]}${s[i + 1]}")
                i++
            } else {
                number += mapOfRoman[s[i].uppercase()] ?: 0
            }
            i++
        }
        return number
    }

    private fun covertRomanCharacterToNumber(char: String): Int {
        return mapOfExceptionRoman[char] ?: mapOfRoman[char] ?: 0
    }

    private val mapOfExceptionRoman = mapOf(
        "IV" to 4,
        "IX" to 9,
        "XL" to 40,
        "XC" to 90,
        "CD" to 400,
        "CM" to 900,
    )

    private val mapOfRoman = mapOf(
        "I" to 1,
        "V" to 5,
        "X" to 10,
        "L" to 50,
        "C" to 100,
        "D" to 500,
        "M" to 1000,
    )
}
