package com.pinzhou;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    public void traverse(TreeNode1 root){
        Queue<TreeNode1> q = new LinkedList();
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i< size; i++){
                TreeNode1 current = q.poll();
                System.out.println(current);
                if(current.left!=null)q.offer(current.left);
                if(current.right!=null)q.offer(current.right);
            }

        }
//        return null;
    }

    public static void main(String [] args){
        Bfs queueSolution = new Bfs();
        TreeNode1 root = new TreeNode1(1);
        TreeNode1 left = new TreeNode1(3);
        TreeNode1 right = new TreeNode1(5);
        root.left = left;
        root.right = right;
        left.left = new TreeNode1(2);
        right.left = new TreeNode1(4);
        right.right = new TreeNode1(6);

        queueSolution.traverse(root);

    }
}
