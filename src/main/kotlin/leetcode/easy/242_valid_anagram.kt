package org.example.leetcode.easy

class ValidAnagramSolution {
//    fun isAnagram(s: String, t: String): Boolean {
//        val mapCharacterS = hashMapOf<Char, Int>()
//        val mapCharacterT = hashMapOf<Char, Int>()
//        for (i in s.indices) {
//            mapCharacterS[s[i]] = mapCharacterS.getOrDefault(s[i], 0) + 1
//        }
//        for (i in t.indices) {
//            mapCharacterT[t[i]] = mapCharacterT.getOrDefault(t[i], 0) + 1
//        }
//
//        if (mapCharacterS.size != mapCharacterT.size) return false
//
//        for (element in mapCharacterS.keys) {
//            if (mapCharacterS.getOrDefault(element, 0) != mapCharacterT.getOrDefault(element, 0)) return false
//        }
//        return true
//    }

    fun isAnagram(s: String, t: String): Boolean {
        val mapCharacterS = hashMapOf<Char, Int>()

        for (i in s.indices) {
            mapCharacterS[s[i]] = mapCharacterS.getOrDefault(s[i], 0) + 1
        }
        for (i in t.indices) {
            mapCharacterS[t[i]] = mapCharacterS.getOrDefault(t[i], 0) - 1
        }

        return mapCharacterS.values.all { it == 0 }
    }

    fun isAnagram1(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val alphabet = HashMap<Char, Int>(26)

        for (i in s.indices) {
            alphabet[s[i]] = alphabet.getOrDefault(s[i], 0) + 1
            alphabet[t[i]] = alphabet.getOrDefault(t[i], 0) - 1
        }

        return !alphabet.values.any { it != 0 }
    }

    fun isAnagram2(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val alphabet = IntArray(26)

        for (i in s.indices) {
            alphabet[s[i] - 'a']++
            alphabet[t[i] - 'a']--
        }

        return !alphabet.any { it != 0 }
    }
}