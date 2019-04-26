package com.pinzhou;

public class Motocycle extends Bike{
    public String gasTank;
    public String motor;
    public int pedalNum ;


    public Motocycle() {
        pedalNum = 6;
        wheelNum = 8;
    }
    public Motocycle (int wn) {
        wheelNum = wn;
    }

    public String toString(){
        return String.valueOf(this.pedalNum)+" "+String.valueOf(this.wheelNum);
    }
    public static void main(String []args){
        String st1 = new String("1111");
        String st2 = new String("1111");
//        Motocycle m = new Motocycle();
//        Motocycle m1 = new Motocycle(5);
        if (st1.equals(st2))
           System.out.println("True");
        else
            System.out.println("False");
        System.out.println(st1);
        System.out.println(st2);
    }
}

