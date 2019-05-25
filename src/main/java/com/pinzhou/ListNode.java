package com.pinzhou;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val){this.val = val;}

    public String toString(){
        return String.valueOf(val);
    }
}
//ListNode temp = root;
//用while (temp.next!=null,)
//temp = temp.next;
//linkedList没有index, array size, 当前不知道后面还有几个，but 中间一个去掉，后面可以和前面连起来
//ArrayList不是定长，有index, array size, but 中间一个去掉，要把后面的reshift