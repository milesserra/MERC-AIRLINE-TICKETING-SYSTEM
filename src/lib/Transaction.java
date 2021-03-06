/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author miles
 */
public class Transaction {

    // name, age, destination, airplane type
    Object[][] PRIVATE_PASSENGERS = new String[140][12];
    Object[][] BUSINESS_PASSENGERS = new String[230][12];
    Object[][] REGULAR_PASSENGERS = new String[480][12];
    Object[][] obj;

    private int getNumberOfPassengers(String airplaneType) {
        int numberOfPassengers = 0;
        boolean flag = false;
        switch (airplaneType) {
            case "PRIVATE" -> {
                obj = this.PRIVATE_PASSENGERS;
                flag = true;
            }
            case "BUSINESS" -> {
                obj = this.BUSINESS_PASSENGERS;
                flag = true;
            }
            case "REGULAR" -> {
                obj = this.REGULAR_PASSENGERS;
                flag = true;
            }
        }
        if (flag) {
            for (int a = 0; a < obj[0].length; a++) {
                if (obj[a][0] != null) {
                    numberOfPassengers++;
                } else {
                    break;
                }
            }
        }
        return numberOfPassengers;
    }

    //to save: name, age, itinerary, airplane type, fare, tax, baggage fee, discount, travel insurance, total fare, control number
    public void recordTransaction(String name, int age, String itinerary, String airplaneType,
            double fare, double tax, double baggageFee, double discount, double travelInsurance,
            double totalFare, String controlNumber) {
        int nop = getNumberOfPassengers(airplaneType);
        switch (airplaneType) {
            case "P" -> {
                this.PRIVATE_PASSENGERS[nop][0] = name;
                this.PRIVATE_PASSENGERS[nop][1] = Integer.toString(age);
                this.PRIVATE_PASSENGERS[nop][2] = itinerary;
                this.PRIVATE_PASSENGERS[nop][3] = airplaneType;
                this.PRIVATE_PASSENGERS[nop][4] = Double.toString(fare);
                this.PRIVATE_PASSENGERS[nop][5] = Double.toString(tax);
                this.PRIVATE_PASSENGERS[nop][6] = Double.toString(baggageFee);
                this.PRIVATE_PASSENGERS[nop][7] = Double.toString(discount);
                this.PRIVATE_PASSENGERS[nop][8] = Double.toString(travelInsurance);
                this.PRIVATE_PASSENGERS[nop][9] = Double.toString(totalFare);
                this.PRIVATE_PASSENGERS[nop][10] = "550.0";
                this.PRIVATE_PASSENGERS[nop][11] = controlNumber;
            }
            case "B" -> {
                this.BUSINESS_PASSENGERS[nop][0] = name;
                this.BUSINESS_PASSENGERS[nop][1] = Integer.toString(age);
                this.BUSINESS_PASSENGERS[nop][2] = itinerary;
                this.BUSINESS_PASSENGERS[nop][3] = airplaneType;
                this.BUSINESS_PASSENGERS[nop][4] = Double.toString(fare);
                this.BUSINESS_PASSENGERS[nop][5] = Double.toString(tax);
                this.BUSINESS_PASSENGERS[nop][6] = Double.toString(baggageFee);
                this.BUSINESS_PASSENGERS[nop][7] = Double.toString(discount);
                this.BUSINESS_PASSENGERS[nop][8] = Double.toString(travelInsurance);
                this.BUSINESS_PASSENGERS[nop][9] = Double.toString(totalFare);
                this.BUSINESS_PASSENGERS[nop][10] = "550.0";
                this.BUSINESS_PASSENGERS[nop][11] = controlNumber;
            }
            case "R" -> {
                this.REGULAR_PASSENGERS[nop][0] = name;
                this.REGULAR_PASSENGERS[nop][1] = Integer.toString(age);
                this.REGULAR_PASSENGERS[nop][2] = itinerary;
                this.REGULAR_PASSENGERS[nop][3] = airplaneType;
                this.REGULAR_PASSENGERS[nop][4] = Double.toString(fare);
                this.REGULAR_PASSENGERS[nop][5] = Double.toString(tax);
                this.REGULAR_PASSENGERS[nop][6] = Double.toString(baggageFee);
                this.REGULAR_PASSENGERS[nop][7] = Double.toString(discount);
                this.REGULAR_PASSENGERS[nop][8] = Double.toString(travelInsurance);
                this.REGULAR_PASSENGERS[nop][9] = Double.toString(totalFare);
                this.REGULAR_PASSENGERS[nop][10] = "255.0";
                this.REGULAR_PASSENGERS[nop][11] = controlNumber;
            }
        }
    }

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
    LocalDateTime now = LocalDateTime.now();
    ArrayList<String> transaction = new ArrayList<>();

    public String createControlNumber(String airplaneType, int numberOfPassenger, String itinerary) {
        String A = "", B = "";
        switch (airplaneType) {
            case "P" -> {
                A = "P";
            }
            case "B" -> {
                A = "B";
            }
            case "R" -> {
                A = "R";
            }
        }
        switch (itinerary) {
            case "MNL-BSO" ->
                B = A + "MB";
            case "BSO-MNL" ->
                B = A + "BM";
            case "MNL-PPS" ->
                B = A + "MP";
            case "PPS-MNL" ->
                B = A + "PM";
            case "MNL-KOR" ->
                B = A + "MK";
            case "KOR-MNL" ->
                B = A + "KM";
            case "MNL-JPN" ->
                B = A + "MJ";
            case "JPN-MNL" ->
                B = A + "JM";
            case "MNL-VNM" ->
                B = A + "MV";
            case "VNM-MNL" ->
                B = A + "VM";
        }
        // date + customer/transaction count + number of passenger + itinerary 
        String controlNumber = dtf.format(now) + (transaction.size() + 1) + numberOfPassenger + "-" + B;
        transaction.add(controlNumber);
        return controlNumber;
    }

    public double availTravelInsurance(String airplaneType) {
        double travelInsurance;
        travelInsurance = switch (airplaneType) {
            case "P" ->
                4500;
            case "B" ->
                6500;
            case "R" ->
                950;
            default ->
                0;
        };
        return travelInsurance;
    }

    public double computeTransactionFee(String airplaneType) {
        double tf = 0;
        switch (airplaneType) {
            case "P" ->
                tf = 500.0;
            case "B" ->
                tf = 500.0;
            case "R" ->
                tf = 255.0;
        }
        return tf;
    }

    public double computeTotal(double tax, double fare, double baggageFee, double travelInsurance, double discount) {
        double total = (tax + fare + baggageFee + travelInsurance) - discount;
        return total;
    }
}
