package org.example.hackeareath

import java.util.Scanner

/**
 * 5
 * 1 0 5 5 3
 * Mex arr -> 0 2 2 2 2
 *
 */
class FindMex {
    fun findMex(arr: IntArray): IntArray {
        var mex = 0
        val mexArr = IntArray(n)
        val seen = BooleanArray(n)

        for (i in 0 until n) {
            val value = arr[i]

            if (value <= n) {
                seen[value] = true
            }

            while (seen[mex]) {
                mex++
            }

            result[i] = mex
        }


        return mexArr
    }
}