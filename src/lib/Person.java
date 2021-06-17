/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

/**
 *
 * @author miles
 */
public abstract class Person {

    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract public double applyTravelTax(String a);

    abstract public double applyBaggageFee(String a);

    abstract public double computeFare(String a, String i);

    abstract public double applyDiscount(int age, double fare);
    
}
