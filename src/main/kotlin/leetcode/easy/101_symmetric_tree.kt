package org.example.leetcode.easy

import org.example.leetcode.easy.tree.TreeNode

class Solution {
    /**
     *
     */
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) return true

        if (p?.`val` != q?.`val`) {
            return false
        } else {
            return isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)
        }
    }

    /**
     * 51
     * https://leetcode.com/problems/symmetric-tree/
     */
    fun isSymmetric(root: TreeNode?): Boolean {
        return isSymmetric(root?.left, root?.right)
    }

    private fun isSymmetric(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) return true

        if (p?.`val` != q?.`val`) return false

        return isSymmetric(p?.left, q?.right) && isSymmetric(p?.right, q?.left)
    }
}