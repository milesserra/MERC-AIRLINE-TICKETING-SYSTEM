/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.util.ArrayList;

/**
 *
 * @author miles
 */
public abstract class Person {
    
    //<editor-fold defaultstate="collapsed" desc="LOCAL FLIGHTS">
    // LOCAL FLIGHTS
    ArrayList<String> PRIVATE_MNL_BSO = new ArrayList<>();
    ArrayList<String> PRIVATE_BSO_MNL = new ArrayList<>();
    ArrayList<String> PRIVATE_MNL_PPS = new ArrayList<>();
    ArrayList<String> PRIVATE_PPS_MNL = new ArrayList<>();

    ArrayList<String> BUSINESS_MNL_BSO = new ArrayList<>();
    ArrayList<String> BUSINESS_BSO_MNL = new ArrayList<>();
    ArrayList<String> BUSINESS_MNL_PPS = new ArrayList<>();
    ArrayList<String> BUSINESS_PPS_MNL = new ArrayList<>();

    ArrayList<String> REGULAR_MNL_BSO = new ArrayList<>();
    ArrayList<String> REGULAR_BSO_MNL = new ArrayList<>();
    ArrayList<String> REGULAR_MNL_PPS = new ArrayList<>();
    ArrayList<String> REGULAR_PPS_MNL = new ArrayList<>();
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="INTERNATIONAL FLIGHTS">
    // INTERNATIONAL FLIGHTS
    ArrayList<String> PRIVATE_MNL_KOR = new ArrayList<>();
    ArrayList<String> PRIVATE_KOR_MNL = new ArrayList<>();
    ArrayList<String> PRIVATE_MNL_JPN = new ArrayList<>();
    ArrayList<String> PRIVATE_JPN_MNL = new ArrayList<>();
    ArrayList<String> PRIVATE_MNL_VNM = new ArrayList<>();
    ArrayList<String> PRIVATE_VNM_MNL = new ArrayList<>();

    ArrayList<String> BUSINESS_MNL_KOR = new ArrayList<>();
    ArrayList<String> BUSINESS_KOR_MNL = new ArrayList<>();
    ArrayList<String> BUSINESS_MNL_JPN = new ArrayList<>();
    ArrayList<String> BUSINESS_JPN_MNL = new ArrayList<>();
    ArrayList<String> BUSINESS_MNL_VNM = new ArrayList<>();
    ArrayList<String> BUSINESS_VNM_MNL = new ArrayList<>();

    ArrayList<String> REGULAR_MNL_KOR = new ArrayList<>();
    ArrayList<String> REGULAR_KOR_MNL = new ArrayList<>();
    ArrayList<String> REGULAR_MNL_JPN = new ArrayList<>();
    ArrayList<String> REGULAR_JPN_MNL = new ArrayList<>();
    ArrayList<String> REGULAR_MNL_VNM = new ArrayList<>();
    ArrayList<String> REGULAR_VNM_MNL = new ArrayList<>();
    //</editor-fold>
    
    private String name;
    private int age;
    
    public Person (String n, int a){
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
    abstract public double applyBaggageFee (String a);
    abstract public double computeFare (String a, String i);
    
}
