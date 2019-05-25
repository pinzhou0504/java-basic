package com.pinzhou;

import javax.swing.tree.TreeNode;
import javax.xml.soap.Node;

public class TreeNode1 {
    public int val;
    public TreeNode1 left;
    public TreeNode1 right;


    public TreeNode1(int val){
        this.val = val;
    }


    public String toString(){
        return String.valueOf(val);
    }
}
