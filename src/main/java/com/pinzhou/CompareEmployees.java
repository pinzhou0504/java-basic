package com.pinzhou;

import java.util.Arrays;
import java.util.Comparator;

public class CompareEmployees {

    public static Comparator<Employees> ageComparator = new Comparator<Employees>() {
        @Override
        public int compare(Employees o1, Employees o2) {
            return (int) (o1.getAge()-o2.getAge());
        }
    };

    public static Comparator<Employees> salaryComparator = new Comparator<Employees>() {
        @Override
        public int compare(Employees o1, Employees o2) {
            return (o1.getSalary()-o2.getSalary());
        }
    };

   public static Comparator<Employees> nameComparator = new Comparator<Employees>() {
       @Override
       public int compare(Employees o1, Employees o2) {
           return o1.getName().compareTo(o2.getName());
       }
   };

    public static void main(String []args) {
        Employees[] empArry = new Employees[4];
        empArry[0] = new Employees(1, 25, "John", 5000);
        empArry[1] = new Employees(3, 30, "Paige", 5000);
        empArry[2] = new Employees(5, 30, "Mike", 2500);
        empArry[3] = new Employees(7, 55, "Michael", 7000);

        //comparable（可被调用） 方法 compare 内嵌在对象里的
        Arrays.sort(empArry);
         System.out.println("employee list" +Arrays.toString(empArry) );


         //comparator 方法 compare
        Arrays.sort(empArry, ageComparator);
        System.out.println("employee list" + Arrays.toString(empArry));

        Arrays.sort(empArry, salaryComparator);
        System.out.println("employee list" + Arrays.toString(empArry));

        Arrays.sort(empArry, nameComparator);
        System.out.println("employee list" + Arrays.toString(empArry));
    }


}
