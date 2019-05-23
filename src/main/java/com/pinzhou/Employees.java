package com.pinzhou;

public class Employees implements Comparable<Employees> {
    private int id;
    private int age;
    private String name;
    private int salary;

    public int getId(){
        return this.id;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }

    public Employees(int id, int age, String name, int salary){
        this.id = id;
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employees emp){
        return (this.id-emp.id);
    }

    @Override
    public String toString(){
        return "[id=" +this.id + ", age=" +this.age+ ", name=" +this.name+ ", salary="+this.salary+"]";
    }

}
