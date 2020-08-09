package com.project.growing.demo.leetcode.atodo;

import com.project.growing.demo.leetcode.binarytree.treenode.TreeNode;
import com.project.growing.utils.TreeUtils;

/**
 * @author 87799
 * @date 2020/8/8
 * @description: 恢复二叉树搜索树
 * 二叉搜索树中的两个节点被错误地交换。
 * 请在不改变其结构的情况下，恢复这棵树。
 * 示例1:
 * 输入: [1,3,null,null,2]
 *   1
 *  /
 * 3
 *  \
 *   2
 *
 * 输出: [3,1,null,null,2]
 *   3
 *  /
 * 1
 *  \
 *   2
 * 示例2:
 * 输入: [3,1,4,null,null,2]
 *   3
 *  / \
 * 1   4
 *   /
 *  2
 * 输出: [2,1,4,null,null,3]
 *   2
 *  / \
 * 1   4
 *   /
 *  3
 * 进阶:
 * 使用 O(n) 空间复杂度的解法很容易实现。
 * 你能想出一个只使用常数空间的解决方案吗？
 **/

public class RestoreBinarySearchTree {

    public static void recoverTree(TreeNode root) {
        //TODO

    }

    public static void main(String[] args) {
        Integer[] nums = {1,3,null,null,2};
        TreeNode root = TreeUtils.createBinaryTreeByArray(nums, 0);
        recoverTree(root);
    }
}
