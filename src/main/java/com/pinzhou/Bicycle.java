package com.pinzhou;

public class Bicycle extends Bike{
    public int pedalNum;
    public Bicycle() {
        super();
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

    public void setPedalNum(int pedalNum){this.pedalNum=pedalNum; }

    public int getPedalNum(){return this.pedalNum;}

    public void setWheelNum(int wheelNum){this.wheelNum=wheelNum;}

    public int getWheelNum(){return  this.wheelNum;}

    @Override
    public int hashCode() {
        int result=17;
        result = result + pedalNum * 31;
        result = result + wheelNum * 31;
//        result = result + move.hashCode;
        return result;
    }

    @Override
    public boolean equals(Object x) {
        if (x == this) return true;
        if(!(x instanceof Bicycle)) return false;
        Bicycle bicycle = (Bicycle) x;
        return bicycle.pedalNum == this.pedalNum &&
                bicycle.wheelNum == this.wheelNum;

    }
}
