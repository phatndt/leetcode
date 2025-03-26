package org.example.sorting

object SelectionSort {
    fun makeSelectionSort(arrays: IntArray): IntArray {
        var min: Int
        for (i in 0 until arrays.size - 1) {
            min = i
            for (j in i + 1 until arrays.size) {
                if (arrays[j] < arrays[min]) {
                    min = j
                }
            }
            val temp = arrays[min]
            arrays[min] = arrays[i]
            arrays[i] = temp
        }
        return arrays
    }

    fun makeInsertionSort(arrays: IntArray): IntArray {
        var pos: Int
        var min: Int
        for (i in 1 until arrays.size) {
            min = arrays[i]
            pos = i - 1

            while (pos >= 0 && arrays[pos] >= min) {
                arrays[pos + 1] = arrays[pos]
                pos--
            }
            arrays[pos + 1] = min
        }
        return arrays
    }

    fun makeBubbleSort(arrays: IntArray): IntArray {
        for (i in 0 until arrays.size - 1) {
            for (j in 0 until arrays.size - i - 1) {
                if (arrays[j] > arrays[j + 1]) {
                    val temp = arrays[j]
                    arrays[j] = arrays[j + 1]
                    arrays[j + 1] = temp
                }
            }
        }
        return arrays
    }
}