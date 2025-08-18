package org.example.leetcode.easy

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
class ContainsDuplicateSolution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val seen = HashSet<Int>()
        for (element in nums) {
            if (seen.contains(element)) {
                return true
            } else {
                seen.add(element)
            }
        }
        return false
    }

    fun containsDuplicate2(nums: IntArray): Boolean {
        return nums.size != nums.toSet().size
    }
}
