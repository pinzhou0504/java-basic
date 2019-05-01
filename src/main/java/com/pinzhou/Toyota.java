package com.pinzhou;

public class Toyota extends VehicleAbstract {
    public int wheelNum = 4;
//    public void sound(){
//        System.out.println("Toyota is a " + (wheelNum) + " wheel car with a sound Woooo!");
//    }

    @Override
    public void move() {
        System.out.println("move straight.");
    }

    public static void main(String [] args){
       Toyota t = new Toyota();
        t.sound();
        t.move();
        System.out.println("Wheel Number: " + t.wheelNum);
    }

}
