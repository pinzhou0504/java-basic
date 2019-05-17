package com.pinzhou;


import java.util.HashSet;

public class HashSet1 {
    public static void main (String args[]){
        HashSet<Bicycle> bikeSet = new HashSet<Bicycle>();
        Bicycle b = new Bicycle();
        b.setPedalNum(4);
        b.setWheelNum(2);
        bikeSet.add(b);
//        System.out.println(b.hashCode());

        Bicycle b1 = new Bicycle();
        b1.setPedalNum(4);
        b1.setWheelNum(2);
        bikeSet.add(b1);
        System.out.println(bikeSet.size());
        System.out.println(bikeSet);
//        System.out.println(b1.hashCode());

//        System.out.println(b.equals(b1));



    }

}
