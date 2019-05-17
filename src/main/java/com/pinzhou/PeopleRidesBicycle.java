package com.pinzhou;

import java.util.HashMap;

public class PeopleRidesBicycle {
    public static void main(String args[]){
        HashMap<Bicycle,String> hashMap = new HashMap<Bicycle,String>();
        Bicycle b = new Bicycle();
        b.setWheelNum(4);
        Bicycle b1 = new Bicycle();
        b1.setWheelNum(2);
        hashMap.put(b,"Pinzhou");
        hashMap.put(b1,"Ryo");
        System.out.println(hashMap.size());
        
    }

}
