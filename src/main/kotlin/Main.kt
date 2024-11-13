package org.example

import org.example.leetcode.easy.NumberToRoman
import org.example.leetcode.easy.Palindrome

fun main() {
    println("Hello world")
    println(Palindrome.isPalindrome2(123))
    println(Palindrome.isPalindrome2(121))
    println(Palindrome.isPalindrome2(1202))
    println(Palindrome.isPalindrome2(12021))
    println(NumberToRoman.romanToInt("MCMXCIV"))
}

fun findTheSecondLargest(arr: IntArray): Int? {
    if (arr.size < 2) return null // If there are fewer than two elements, return null

    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE

    for (num in arr) {
        if (num > largest) {
            largest = num
            secondLargest = largest
        } else {
            secondLargest = num
        }
    }

    return secondLargest
}

// Usage example