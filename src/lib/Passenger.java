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
public class Passenger extends Person {

    private double travelTax;
    private double baggageFee;

    public Passenger(String n, int a) {
        super(n, a);
    }

    @Override
    public double applyTravelTax(String airplaneType) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (super.getAge() > 59) {
            travelTax = 0;
        } else {
            switch (airplaneType) {
                case "P" ->
                    this.travelTax = 4260;
                case "B" ->
                    this.travelTax = 5700;
                case "R" ->
                    this.travelTax = 2500;
            }
        }
        return travelTax;
    }

    @Override
    public double applyBaggageFee(String airplaneType) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (super.getAge() > 59) {
            baggageFee = 0;
        } else {
            switch (airplaneType) {
                case "P" ->
                    this.baggageFee = 1250;
                case "B" ->
                    this.baggageFee = 2850;
                case "R" ->
                    this.baggageFee = 950;
            }
        }
        return baggageFee;
    }

    @Override
    public double computeFare(String airplaneType, String itinerary) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double fare = 0;
        switch (airplaneType) {
            case "P" -> {
                switch (itinerary) {
                    case "MNL-BSO" ->
                        fare = 8000;
                    case "BSO-MNL" ->
                        fare = 9800;
                    case "MNL-PPS" ->
                        fare = 9100;
                    case "PPS-MNL" ->
                        fare = 9850;
                    case "MNL-KOR" ->
                        fare = 27450;
                    case "KOR-MNL" ->
                        fare = 30890;
                    case "MNL-JPN" ->
                        fare = 40450;
                    case "JPN-MNL" ->
                        fare = 43855;
                    case "MNL-VNM" ->
                        fare = 8505;
                    case "VNM-MNL" ->
                        fare = 14300;
                }
            }
            case "B" -> {
                switch (itinerary) {
                    case "MNL-BSO" ->
                        fare = 12500;
                    case "BSO-MNL" ->
                        fare = 12950;
                    case "MNL-PPS" ->
                        fare = 10500;
                    case "PPS-MNL" ->
                        fare = 10975;
                    case "MNL-KOR" ->
                        fare = 37390;
                    case "KOR-MNL" ->
                        fare = 39650;
                    case "MNL-JPN" ->
                        fare = 45355;
                    case "JPN-MNL" ->
                        fare = 49780;
                    case "MNL-VNM" ->
                        fare = 12345;
                    case "VNM-MNL" ->
                        fare = 16320;
                }
            }
            case "R" -> {
                switch (itinerary) {
                    case "MNL-BSO" ->
                        fare = 3500;
                    case "BSO-MNL" ->
                        fare = 3900;
                    case "MNL-PPS" ->
                        fare = 3200;
                    case "PPS-MNL" ->
                        fare = 3575;
                    case "MNL-KOR" ->
                        fare = 12055;
                    case "KOR-MNL" ->
                        fare = 13100;
                    case "MNL-JPN" ->
                        fare = 27800;
                    case "JPN-MNL" ->
                        fare = 29400;
                    case "MNL-VNM" ->
                        fare = 3200;
                    case "VNM-MNL" ->
                        fare = 4600;
                }
            }
        }
        return fare;
    }

    @Override
    public double applyDiscount(int age, double fare) {
        double discount = 0;
        if (age > 59) {
            discount = fare * .20;
        }
        return discount;
    }

}
