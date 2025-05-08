package org.example

import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Calendar

fun threeSum1(nums: Array<Int>, target: Int): IntArray {
    for (i in 0 until nums.size - 2) {
        for (j in i + 1 until nums.size - 1) {
            for (k in j + 1 until nums.size) {
                if ((nums[i] + nums[j] + nums[k]) / target == 0) return intArrayOf(i, j, k)
            }
        }
    }
    throw IllegalStateException("Invalid number")
}

fun main() {
    val x = listOf<Pair<Int, Int>>(
        Pair(24, 5),
        Pair(24, 6),
        Pair(1, 5),
    )
    x.sortedBy { it.first }.filter { it.second == 0 }.sortedBy { it.second }.sortedBy { it.first }
        .filter { it.second == 0 }.sortedBy { it.second }
}

class A {
    companion object {
        fun asdas() {

        }
    }
}
