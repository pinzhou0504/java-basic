package com.pinzhou;

public class Ferry implements Ship {
//    public void test(){
//        System.out.println("I am a Ferry!");
//    }

    @Override
    public void floatRiver() {
        System.out.println("I am floating floating!");
    }
    public static void main(String []args){
        Ferry f = new Ferry();
        f.floatRiver();
    }
}
