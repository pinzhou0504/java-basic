package com.pinzhou;
import java.util.Scanner;


public class convert {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a number (string): ");
//        String num1 = input.next();
        int num1 = Integer.valueOf(input.next());
//        System.out.println("num1 is: "+num1);
        System.out.println("The integer value is: ");
//        int num2 = input.nextInt();
        System.out.println(Integer.valueOf(num1));
        input.close();
//        String number = "25";
//        int result = Integer.valueOf(number);


    }


}
