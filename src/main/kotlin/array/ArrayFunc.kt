package org.example.array

object ArrayFunc {
    fun reversedArray(arr: IntArray): IntArray {
        var temp: Int
        for (i in 0..arr.size / 2) {
            temp = arr[i]
            arr[i] = arr[arr.size - 1 - i]
            arr[arr.size - 1 - i] = temp
        }
        return arr
    }
}