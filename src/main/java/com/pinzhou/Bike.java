package com.pinzhou;

import java.awt.*;

public class Bike extends VehicleAbstract{
    public String wheelShape = "square";
    public int wheelNum ;
    Bike(int wheelNum){
        this.wheelNum = wheelNum;
    }
    public String seatShape = null;

    public boolean refurbished = true;

    public Bike(){


        wheelNum = 1;
        wheelShape = "round";
    }
//    public abstract class VehicleAbstract{
//
//    }
//public interface Ship{
//
//}
//    public Double wheelRadius = 2.00;
//
//    public Bike(int wn){
//        wheelNum= wn;
//    }
//
//    public void move() {
//    }
//    public String toString(){
//        return String.valueOf(this.wheelNum) + " and " + String.valueOf(this.wheelShape);
//    }
//
//    public static void main(String [] args){
//        Bike b = new Bike();
//        Bike b1 = new Bike( 2);
//        System.out.println(b);
//        System.out.println(b1);
//        System.out.println("I am awesome!");
//    }
    public int toInt(){
       return Integer.valueOf("12");
    }
    public static void main(String [] args){
        Bike b = new Bike();
        System.out.println(b.toInt());
    }


    @Override
    public void move() {

    }
}