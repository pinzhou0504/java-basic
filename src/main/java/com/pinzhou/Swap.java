package com.pinzhou;

public class Swap{
    public static void main(String[] args){
        int a = 3;
        int b = 5;

        int c = a; //把a的值先存到c
        a = b; //把b存给a
        b = c; //把存在c的值倒赋给b

        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
