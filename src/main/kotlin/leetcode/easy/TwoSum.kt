package org.example.leetcode.easy

object TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size - 1) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        throw IllegalStateException("Invalid number")
    }

    /**
     * [5, 7, 2, 9], target = 9
     * 5 - 0,
     * 7 - 1,
     * 2 - 2,
     * 9 - 3,
     */
    fun twoSum2(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val temp = target - nums[i]
            if (map.containsKey(temp)) {
                return intArrayOf(map.getValue(temp), i)
            } else {
                map[nums[i]] = i
            }
        }
        throw IllegalStateException("Invalid number")
    }
}