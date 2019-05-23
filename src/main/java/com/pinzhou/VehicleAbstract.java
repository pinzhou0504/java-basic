package com.pinzhou;

public abstract class VehicleAbstract {
    private int x = 5;
    public void sound(){
        System.out.println("Wooooo!");
    }
    public abstract void move();
}
