package com.erpang.traverse;

public class Tree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    /**
     * 二叉树遍历需要考虑的两个问题：
     * 1. 需要对当前节点做什么操作
     * 2. 需要在哪个位置操作
     *
     * @param root
     */
    public void traverse(TreeNode root) {
        if (null == root) {
            return;
        }
        // 前序遍历位置
        traverse(root.left);
        // 中序遍历位置
        traverse(root.right);
        // 后序遍历位置
    }
}
