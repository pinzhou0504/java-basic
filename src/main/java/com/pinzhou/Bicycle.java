//package com.pinzhou;

public class Bicycle extends Bike{
    public int pedalNum;
    public Bicycle() {
//        super();
        wheelNum = 2;
    }

    public Bicycle(int wn) {
        wheelNum = wn;
    }

    public void move() {
    }

    public String toString() {
        return String.valueOf(this.wheelNum);
    }

    public static void main(String []args) {
        Bicycle b = new Bicycle();
        Bicycle b1 = new Bicycle(5);
        System.out.println(b);
        System.out.println(b1);
    }
}
