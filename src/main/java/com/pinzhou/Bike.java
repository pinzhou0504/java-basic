//package com.pinzhou;

public class Bike {
    public String wheelShape = "square";
    public int wheelNum = 0;
    public String seatShape = null;

    public boolean refurbished = true;

    public Bike(){
        wheelNum = 1;
        wheelShape = "round";
    }

    public Double wheelRadius = 2.00;

    public Bike(int wn){
        wheelNum= wn;
    }

    public void move() {
    }
    public String toString(){
        return String.valueOf(this.wheelNum) + " and " + String.valueOf(this.wheelShape);
    }

    public static void main(String [] args){
        Bike b = new Bike();
        Bike b1 = new Bike( 2);
        System.out.println(b);
        System.out.println(b1);
        System.out.println("I am awesome!");
    }
}