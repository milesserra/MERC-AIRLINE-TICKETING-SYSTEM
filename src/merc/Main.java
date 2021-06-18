/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merc;

/**
 *
 * @author miles
 */
import java.util.ArrayList;
import java.util.Scanner;
import lib.AirlineType;
import lib.Destination;
import lib.Passenger;
import lib.Person;
import lib.Transaction;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Main M = new Main();
    static Destination D = new Destination();
    static Transaction T = new Transaction();
    static AirlineType A = new AirlineType();

    static String travelType;
    static String airplaneType;
    static String itinerary;

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

    void checkAvailableSeats() {
        System.out.println("************ AVAILABLE FLIGHTS: ************\n");
        if (travelType.equals("L")) {
            //<editor-fold defaultstate="collapsed" desc="PRIVATE LOCAL FLIGHTS">
            if (airplaneType.equals("P")) {
                // Check availability of PRIVATE LOCAL FLIGHTS
                System.out.println("Manila (MNL) - Basco (BSO)");
                System.out.println(
                        "Available seats: "
                        + (20 - 6 - PRIVATE_MNL_BSO.size()));
                System.out.println("Basco (BSO) - Manila (MNL)");
                System.out.println(
                        "Available seats: "
                        + (20 - 6 - PRIVATE_BSO_MNL.size()));
                System.out.println("Manila (MNL) - Puerto Princesa (PPS)");
                System.out.println(
                        "Available seats: "
                        + (20 - 6 - PRIVATE_MNL_PPS.size()));
                System.out.println("Puerto Princesa (PPS) - Manila (MNL)");
                System.out.println(
                        "Available seats: "
                        + (20 - 6 - PRIVATE_PPS_MNL.size()));
            }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="BUSINESS LOCAL FLIGHTS">
            if (airplaneType.equals("B")) {
                // Check availability of BUSINESS LOCAL FLIGHTS
                System.out.println("Manila (MNL) - Basco (BSO)");
                System.out.println(
                        "Available seats: "
                        + (30 - 7 - BUSINESS_MNL_BSO.size()));
                System.out.println("Basco (BSO) - Manila (MNL)");
                System.out.println(
                        "Available seats: "
                        + (30 - 7 - BUSINESS_BSO_MNL.size()));
                System.out.println("Manila (MNL) - Puerto Princesa (PPS)");
                System.out.println(
                        "Available seats: "
                        + (30 - 7 - BUSINESS_MNL_PPS.size()));
                System.out.println("Puerto Princesa (PPS) - Manila (MNL)");
                System.out.println(
                        "Available seats: "
                        + (30 - 7 - BUSINESS_PPS_MNL.size()));
            }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="REGULAR LOCAL FLIGHTS">
            if (airplaneType.equals("R")) {
                // Check availability of REGULAR LOCAL FLIGHTS
                System.out.println("Manila (MNL) - Basco (BSO)");
                System.out.println(
                        "Available seats: "
                        + (100 - 52 - REGULAR_MNL_BSO.size()));
                System.out.println("Basco (BSO) - Manila (MNL)");
                System.out.println(
                        "Available seats: "
                        + (100 - 52 - REGULAR_BSO_MNL.size()));
                System.out.println("Manila (MNL) - Puerto Princesa (PPS)");
                System.out.println(
                        "Available seats: "
                        + (100 - 52 - REGULAR_MNL_PPS.size()));
                System.out.println("Puerto Princesa (PPS) - Manila (MNL)");
                System.out.println(
                        "Available seats: "
                        + (100 - 52 - REGULAR_PPS_MNL.size()));
            }
            //</editor-fold>
        } else if (travelType.equals("I")) {
            //<editor-fold defaultstate="collapsed" desc="PRIVATE INTERNATIONAL FLIGHTS">
            if (airplaneType.equals("P")) {
                // Check availability of PRIVATE INTERNATIONAL FLIGHTS
                System.out.println("Manila (MNL) - South Korea (KOR)");
                System.out.println(
                        "Available seats: "
                        + (20 - 6 - PRIVATE_MNL_KOR.size()));
                System.out.println("South Korea (KOR) - Manila (MNL)");
                System.out.println(
                        "Available seats: "
                        + (20 - 6 - PRIVATE_KOR_MNL.size()));
                System.out.println("Manila (MNL) - Japan (JPN)");
                System.out.println(
                        "Available seats: "
                        + (20 - 6 - PRIVATE_MNL_JPN.size()));
                System.out.println("Japan (JPN) - Manila (MNL)");
                System.out.println(
                        "Available seats: "
                        + (20 - 6 - PRIVATE_JPN_MNL.size()));
                System.out.println("Manila (MNL) - Vietnam (VNM)");
                System.out.println(
                        "Available seats: "
                        + (20 - 6 - PRIVATE_MNL_VNM.size()));
                System.out.println("Vietnam (VNM) - Manila (MNL)");
                System.out.println(
                        "Available seats: "
                        + (20 - 6 - PRIVATE_VNM_MNL.size()));
            }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="BUSINESS INTERNATIONAL FLIGHTS">
            if (airplaneType.equals("B")) {
                // Check availability of BUSINESS INTERNATIONAL FLIGHTS
                System.out.println("Manila (MNL) - South Korea (KOR)");
                System.out.println(
                        "Available seats: "
                        + (30 - 7 - BUSINESS_MNL_KOR.size()));
                System.out.println("South Korea (KOR) - Manila (MNL)");
                System.out.println(
                        "Available seats: "
                        + (30 - 7 - BUSINESS_KOR_MNL.size()));
                System.out.println("Manila (MNL) - Japan (JPN)");
                System.out.println(
                        "Available seats: "
                        + (30 - 7 - BUSINESS_MNL_JPN.size()));
                System.out.println("Japan (JPN) - Manila (MNL)");
                System.out.println(
                        "Available seats: "
                        + (30 - 7 - BUSINESS_JPN_MNL.size()));
                System.out.println("Manila (MNL) - Vietnam (VNM)");
                System.out.println(
                        "Available seats: "
                        + (30 - 7 - BUSINESS_MNL_VNM.size()));
                System.out.println("Vietnam (VNM) - Manila (MNL)");
                System.out.println(
                        "Available seats: "
                        + (30 - 7 - BUSINESS_VNM_MNL.size()));
            }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="REGULAR INTERNATIONAL FLIGHTS">
            if (airplaneType.equals("R")) {
                // Check availability of REGULAR INTERNATIONAL FLIGHTS
                System.out.println("Manila (MNL) - South Korea (KOR)");
                System.out.println(
                        "Available seats: "
                        + (100 - 52 - REGULAR_MNL_KOR.size()));
                System.out.println("South Korea (KOR) - Manila (MNL)");
                System.out.println(
                        "Available seats: "
                        + (100 - 52 - REGULAR_KOR_MNL.size()));
                System.out.println("Manila (MNL) - Japan (JPN)");
                System.out.println(
                        "Available seats: "
                        + (100 - 52 - REGULAR_MNL_JPN.size()));
                System.out.println("Japan (JPN) - Manila (MNL)");
                System.out.println(
                        "Available seats: "
                        + (100 - 52 - REGULAR_JPN_MNL.size()));
                System.out.println("Manila (MNL) - Vietnam (VNM)");
                System.out.println(
                        "Available seats: "
                        + (100 - 52 - REGULAR_MNL_VNM.size()));
                System.out.println("Vietnam (VNM) - Manila (MNL)");
                System.out.println(
                        "Available seats: "
                        + (100 - 52 - REGULAR_VNM_MNL.size()));
            }
            //</editor-fold>
        }
        System.out.println("\n********************************************");
        System.out.println();
    }

    int countAvailableSeats() {
        int availableSeats = 0;
        switch (airplaneType) {
            case "P" -> {
                switch (itinerary) {
                    case "MNL-BSO" ->
                        availableSeats = 20 - 6 - PRIVATE_MNL_BSO.size();
                    case "BSO-MNL" ->
                        availableSeats = 20 - 6 - PRIVATE_BSO_MNL.size();
                    case "MNL-PPS" ->
                        availableSeats = 20 - 6 - PRIVATE_MNL_PPS.size();
                    case "PPS-MNL" ->
                        availableSeats = 20 - 6 - PRIVATE_PPS_MNL.size();
                    case "MNL-KOR" ->
                        availableSeats = 20 - 6 - PRIVATE_MNL_KOR.size();
                    case "KOR-MNL" ->
                        availableSeats = 20 - 6 - PRIVATE_KOR_MNL.size();
                    case "MNL-JPN" ->
                        availableSeats = 20 - 6 - PRIVATE_MNL_JPN.size();
                    case "JPN-MNL" ->
                        availableSeats = 20 - 6 - PRIVATE_JPN_MNL.size();
                    case "MNL-VNM" ->
                        availableSeats = 20 - 6 - PRIVATE_MNL_VNM.size();
                    case "VNM-MNL" ->
                        availableSeats = 20 - 6 - PRIVATE_VNM_MNL.size();
                }
            }

            case "B" -> {
                switch (itinerary) {
                    case "MNL-BSO" ->
                        availableSeats = 30 - 7 - BUSINESS_MNL_BSO.size();
                    case "BSO-MNL" ->
                        availableSeats = 30 - 7 - BUSINESS_BSO_MNL.size();
                    case "MNL-PPS" ->
                        availableSeats = 30 - 7 - BUSINESS_MNL_PPS.size();
                    case "PPS-MNL" ->
                        availableSeats = 30 - 7 - BUSINESS_PPS_MNL.size();
                    case "MNL-KOR" ->
                        availableSeats = 30 - 7 - BUSINESS_MNL_KOR.size();
                    case "KOR-MNL" ->
                        availableSeats = 30 - 7 - BUSINESS_KOR_MNL.size();
                    case "MNL-JPN" ->
                        availableSeats = 30 - 7 - BUSINESS_MNL_JPN.size();
                    case "JPN-MNL" ->
                        availableSeats = 30 - 7 - BUSINESS_JPN_MNL.size();
                    case "MNL-VNM" ->
                        availableSeats = 30 - 7 - BUSINESS_MNL_VNM.size();
                    case "VNM-MNL" ->
                        availableSeats = 30 - 7 - BUSINESS_VNM_MNL.size();
                }
            }

            case "R" -> {
                switch (itinerary) {
                    case "MNL-BSO" ->
                        availableSeats = 100 - 52 - REGULAR_MNL_BSO.size();
                    case "BSO-MNL" ->
                        availableSeats = 100 - 52 - REGULAR_BSO_MNL.size();
                    case "MNL-PPS" ->
                        availableSeats = 100 - 52 - REGULAR_MNL_PPS.size();
                    case "PPS-MNL" ->
                        availableSeats = 100 - 52 - REGULAR_PPS_MNL.size();
                    case "MNL-KOR" ->
                        availableSeats = 100 - 52 - REGULAR_MNL_KOR.size();
                    case "KOR-MNL" ->
                        availableSeats = 100 - 52 - REGULAR_KOR_MNL.size();
                    case "MNL-JPN" ->
                        availableSeats = 100 - 52 - REGULAR_MNL_JPN.size();
                    case "JPN-MNL" ->
                        availableSeats = 100 - 52 - REGULAR_JPN_MNL.size();
                    case "MNL-VNM" ->
                        availableSeats = 100 - 52 - REGULAR_MNL_VNM.size();
                    case "VNM-MNL" ->
                        availableSeats = 100 - 52 - REGULAR_VNM_MNL.size();
                }
            }

        }
        return availableSeats;
    }

    void addPassenger(String name) {
        switch (airplaneType) {
            case "P" -> {
                switch (itinerary) {
                    case "MNL-BSO" ->
                        PRIVATE_MNL_BSO.add(name);
                    case "BSO-MNL" ->
                        PRIVATE_BSO_MNL.add(name);
                    case "MNL-PPS" ->
                        PRIVATE_MNL_PPS.add(name);
                    case "PPS-MNL" ->
                        PRIVATE_PPS_MNL.add(name);
                    case "MNL-KOR" ->
                        PRIVATE_MNL_KOR.add(name);
                    case "KOR-MNL" ->
                        PRIVATE_KOR_MNL.add(name);
                    case "MNL-JPN" ->
                        PRIVATE_MNL_JPN.add(name);
                    case "JPN-MNL" ->
                        PRIVATE_JPN_MNL.add(name);
                    case "MNL-VNM" ->
                        PRIVATE_MNL_VNM.add(name);
                    case "VNM-MNL" ->
                        PRIVATE_VNM_MNL.add(name);
                }
            }
            case "B" -> {
                switch (itinerary) {
                    case "MNL-BSO" ->
                        BUSINESS_MNL_BSO.add(name);
                    case "BSO-MNL" ->
                        BUSINESS_BSO_MNL.add(name);
                    case "MNL-PPS" ->
                        BUSINESS_MNL_PPS.add(name);
                    case "PPS-MNL" ->
                        BUSINESS_PPS_MNL.add(name);
                    case "MNL-KOR" ->
                        BUSINESS_MNL_KOR.add(name);
                    case "KOR-MNL" ->
                        BUSINESS_KOR_MNL.add(name);
                    case "MNL-JPN" ->
                        BUSINESS_MNL_JPN.add(name);
                    case "JPN-MNL" ->
                        BUSINESS_JPN_MNL.add(name);
                    case "MNL-VNM" ->
                        BUSINESS_MNL_VNM.add(name);
                    case "VNM-MNL" ->
                        BUSINESS_VNM_MNL.add(name);
                }
            }
            case "R" -> {
                switch (itinerary) {
                    case "MNL-BSO" ->
                        REGULAR_MNL_BSO.add(name);
                    case "BSO-MNL" ->
                        REGULAR_BSO_MNL.add(name);
                    case "MNL-PPS" ->
                        REGULAR_MNL_PPS.add(name);
                    case "PPS-MNL" ->
                        REGULAR_PPS_MNL.add(name);
                    case "MNL-KOR" ->
                        REGULAR_MNL_KOR.add(name);
                    case "KOR-MNL" ->
                        REGULAR_KOR_MNL.add(name);
                    case "MNL-JPN" ->
                        REGULAR_MNL_JPN.add(name);
                    case "JPN-MNL" ->
                        REGULAR_JPN_MNL.add(name);
                    case "MNL-VNM" ->
                        REGULAR_MNL_VNM.add(name);
                    case "VNM-MNL" ->
                        REGULAR_VNM_MNL.add(name);
                }
            }
        }
    }

    void viewAvailabilityOfFlights() {

        System.out.println("Travel type? ");
        System.out.println("[L] Local [I] International");
        while (true) {
            System.out.print(": ");
            A.setTravelType(sc.nextLine().toUpperCase());
            if (A.getTravelType().equals("L") || A.getTravelType().equals("I")) {
                travelType = A.getTravelType();
                break;
            } else {
                System.out.println("Invalid travel type, try again.");
            }
        }
        System.out.println();

        System.out.println("Airplane type? ");
        System.out.println("[P] Private [B] Business [R] Regular");
        while (true) {
            System.out.print(": ");
            A.setAirplaneType(sc.nextLine().toUpperCase());
            if (A.getAirplaneType().equals("P") || A.getAirplaneType().equals("B") || A.getAirplaneType().equals("R")) {
                airplaneType = A.getAirplaneType();
                break;
            } else {
                System.out.println("Invalid airplane type, try again.");
            }

        }
        System.out.println();

        M.checkAvailableSeats();
    }

    void chooseItinerary() {
        String[] LOCAL_FLIGHTS = {"MNL-BSO", "BSO-MNL", "MNL-PPS", "PPS-MNL"};
        String[] INTERNATIONAL_FLIGHTS = {"MNL-KOR", "KOR-MNL", "MNL-JPN", "JPN-MNL", "MNL-VNM", "VNM-MNL"};
        int l = 0;
        String example = "";
        switch (travelType) {
            case "L" -> {
                example = "MNL-BSO";
                l = LOCAL_FLIGHTS.length;
            }
            case "I" -> {
                example = "MNL-KOR";
                l = INTERNATIONAL_FLIGHTS.length;
            }
        }
        System.out.println("Choose itinerary (example: " + example + ")");
        boolean flag = false;
        while (!flag) {
            System.out.print(": ");
            //sc.nextLine();
            D.setItinerary(sc.nextLine().toUpperCase());
            for (int a = 0; a < l; a++) {
                switch (travelType) {
                    case "L" -> {
                        if (D.getItinerary().equals(LOCAL_FLIGHTS[a])) {
                            flag = true;
                        }
                    }
                    case "I" -> {
                        if (D.getItinerary().equals(INTERNATIONAL_FLIGHTS[a])) {
                            flag = true;
                        }
                    }
                }
            }
            if (!flag) {
                System.out.println("Invalid itinerary, try again.");
            }
        }
        itinerary = D.getItinerary();
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Welcome to MERC AIRLINE TICKETING SYSTEM");
        System.out.println();

        int todo = 0;
        String choice = "";
        while (todo != 3 && !choice.equals("Y")) {
            System.out.println("What do you want to do?");
            System.out.println("[1] Book flight  [2] View availability of flights  [3] Exit");
            System.out.print(": ");
            todo = sc.nextInt();
            sc.nextLine(); //throw a line
            System.out.println();

            switch (todo) {
                case 1 -> //<editor-fold defaultstate="collapsed" desc="BOOK FLIGHT">
                {
                    M.viewAvailabilityOfFlights();

                    M.chooseItinerary();

                    System.out.println("NOTE: Below 19 Cannot travel alone and must be "
                            + "accompanied by atleast one (1) Adult and/or Senior Citizen");
                    System.out.println("NOTE: Senior Citizen is Tax Exempted and will get Total Travel Destination "
                            .concat("computation only and 20% discount\n"));
                    int numberOfPassenger;
                    String name;
                    int age;
                    double fare;
                    double tax;
                    double baggageFee;
                    double discount;
                    String wantToAvailInsurance;
                    double travelInsurance = 0;
                    double additionalFee;
                    double subTotalFee = 0;
                    double totalFee;
                    String controlNumber;
                    while (true) {
                        System.out.print("Number of passenger/s \n: ");
                        numberOfPassenger = sc.nextInt();
                        sc.nextLine(); // throw a line
                        System.out.println();
                        if (numberOfPassenger > M.countAvailableSeats()) {
                            System.out.println("***** Number of passengers cannot be greater than the available seats. *****\n");
                        } else if (numberOfPassenger < 0) {
                            System.out.println("***** NEGATIVE INPUT NOT ALLOWED HERE. *****\n");
                        } else {
                            controlNumber = T.createControlNumber(airplaneType, numberOfPassenger, itinerary);
                            for (int a = 1; a <= numberOfPassenger; a++) {
                                System.out.println("Passenger " + a);
                                System.out.print("Name: ");
                                name = sc.nextLine();
                                System.out.print("Age: ");
                                age = sc.nextInt();
                                sc.nextLine(); // thow a line
                                if (a == 1 && age < 19) {
                                    System.out.println("\n***** Please read the NOTE above. *****\n");
                                    a--;
                                } else {
                                    Person passenger = new Passenger(name, age);
                                    tax = passenger.applyTravelTax(airplaneType);
                                    baggageFee = passenger.applyBaggageFee(airplaneType);
                                    fare = passenger.computeFare(airplaneType, itinerary);
                                    discount = passenger.applyDiscount(age, fare);
                                    System.out.println("Fare: " + fare);
                                    System.out.println("Tax: " + tax);
                                    System.out.println("Baggage fee: " + baggageFee);
                                    System.out.println("Discount: " + discount + "\n");
                                    OUTER:
                                    for (int b = 0; b < 1 && a == numberOfPassenger; b++) {
                                        System.out.println("Do you want to avail travel insurance? Y/N");
                                        System.out.print(": ");
                                        wantToAvailInsurance = sc.nextLine().toUpperCase();
                                        System.out.println();
                                        switch (wantToAvailInsurance) {
                                            case "Y" -> {
                                                travelInsurance = T.availTravelInsurance(airplaneType);
                                                break OUTER;
                                            }
                                            case "N" -> {
                                                // Do nothing
                                                break OUTER;
                                            }
                                            default -> {
                                                System.out.println("Invalid choice, try again.\n");
                                                b--;
                                            }
                                        }
                                    }

                                    subTotalFee += T.computeTotal(tax, fare, baggageFee, travelInsurance, discount);
                                    //System.out.print(totalFare);
                                    //totalFare = T.computeTotal(A.getAirplaneType(), totalFare, age, totalFare, totalFare);
                                    //to save: name, age, itinerary, airplane type, fare, tax, baggage fee, discount, travel insurance, total fare, control number
                                    M.addPassenger(name);
                                    T.recordTransaction(name, age, itinerary, airplaneType,
                                            fare, tax, baggageFee, discount, travelInsurance,
                                            subTotalFee, controlNumber);
                                    // To do: apply tax, compute fare, compute baggage fee and ask travel insurance
                                    //destination.assignPassenger(passenger.getName(), airlineType.getFlightType(), destination.getDestination());
                                }
                            }
                            additionalFee = T.computeTransactionFee(airplaneType);
                            totalFee = subTotalFee + additionalFee;
                            System.out.println("Control number: " + controlNumber);
                            System.out.println("Travel insurance (" + airplaneType + "): " + travelInsurance);
                            System.out.println("Additional transaction fee: " + additionalFee);
                            System.out.println("Total fee: " + totalFee);
                            System.out.println("\nREMINDER: Show the control number on cashier and pay, STRICTLY NO REFUND.\n");
                            break;
                        }
                    }
                }
                //</editor-fold>
                case 2 -> //<editor-fold defaultstate="collapsed" desc="VIEW AVAILABILITY OF FLIGHTS">
                {
                    M.viewAvailabilityOfFlights();
                }
                //</editor-fold>
                case 3 -> //<editor-fold defaultstate="collapsed" desc="EXIT">
                {
                    System.out.print("Are you sure do you want to exit? Y/N");
                    System.out.println(": ");
                    //sc.nextLine();
                    choice = sc.nextLine().toUpperCase();
                    if (choice.equals("Y")) {
                        todo = 3;
                    } else {
                        todo = 0;
                        System.out.println();
                    }
                }
//</editor-fold>
                default ->
                    System.out.println("INVALID CHOICE!\n");
            }
        }
    }
}
