//package com.pinzhou;

public class Motocycle extends Bike{
    public String gasTank;
    public String motor;
    public int pedalNum = 1;


    public Motocycle() {
        pedalNum = 2;
        wheelNum = 4;
    }
    public Motocycle (int wn) {
        wheelNum = wn;
    }

    public String toString(){
        return String.valueOf(this.pedalNum)+" "+String.valueOf(this.wheelNum);
    }
    public static void main(String []args){
        Motocycle m = new Motocycle();
        Motocycle m1 = new Motocycle(5);
        System.out.println(m);
        System.out.println(m1);
    }
}

