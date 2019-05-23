package com.pinzhou;

public class Sum {
    public int sum(int a, int b){
        int result = a + b;
        return result;
    }
//    public static void main(String []args){
//        int s = 0;
//        s = sum(2,5);
//        System.out.println(s);
//    }
//
    public static void main(String []args){
        Sum s = new Sum();
        int x = s.sum(5,7);
//        int x = s.sum(2,4);
        System.out.println(x);
    }
}
