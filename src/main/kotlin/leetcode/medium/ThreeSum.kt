package org.example.leetcode.medium

object ThreeSum {
    fun threeSum1(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                for (k in j + 1 until nums.size) {
                    if (nums[i] + nums[j] + nums[k] == target) return intArrayOf(i, j, k)
                }
            }
        }
        throw IllegalStateException("Invalid number")
    }

    fun threeSumImprove(nums: IntArray, target: Int): IntArray {
        val hashMap = hashMapOf<Int, Int>()
        for (i in 0 until nums.size - 1) {
            val temp = target - nums[i]

            for (j in i + 1 until nums.size) {
                val temp2 = temp - nums[j]

                if (hashMap.contains(temp2)) {
                    return intArrayOf(hashMap.getValue(temp2), j , i)
                }

                hashMap[nums[j]] = j
            }
        }
        throw IllegalStateException("Invalid number")
    }
}