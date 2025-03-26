package org.example.leetcode.easy

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strslength <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters if it is non-empty.
 */
object LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        val temp = strs.apply { sortBy { it } }
        var count = 0
        for (i in 0..<temp.first().length) {
            if (temp.first()[i] == temp.last()[i]) {
                count++
            }
        }
        if (count == 0) return ""
        return temp.first().substring(0, count)
    }
}

fun main() {
    val temp = listOf("abc", "ab")
    print(temp.sortedBy {
        it.toString()
    }.toString())
}