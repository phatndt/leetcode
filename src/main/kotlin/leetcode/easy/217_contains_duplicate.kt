package org.example.leetcode.easy

import java.util.*

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
class ContainsDuplicateSolution {
    // Runtime
    fun containsDuplicate(nums: IntArray): Boolean {
        val seen = hashSetOf<Int>()
        for (element in nums) {
            if (!seen.add(element)) {
                return true
            }
        }
        return false
    }

    fun containsDuplicate1(nums: IntArray): Boolean {
        nums.sort()

        for (i in 1..<nums.size) {
            if (nums[i] == nums[i - 1]) return true
        }
        return false
    }

    fun containsDuplicate2(nums: IntArray): Boolean {
        return nums.size != nums.toSet().size
    }
}
