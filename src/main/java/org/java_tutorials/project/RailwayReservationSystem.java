package org.java_tutorials.project;


import java.util.*;

class Train {
    String name;
    String boarding;
    String destination;
    int fare;
    int trainNumber;

    public Train(String name, String boarding, String destination, int fare, int trainNumber) {
        this.name = name;
        this.boarding = boarding;
        this.destination = destination;
        this.fare = fare;
        this.trainNumber = trainNumber;
    }
}

class Passenger {
    String name;
    int age;
    String gender;
    int coachNo;
    String berth;

    public Passenger(String name, int age, String gender, int coachNo, String berth) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.coachNo = coachNo;
        this.berth = berth;
    }
}

public class RailwayReservationSystem {
    static Train[] trains = new Train[10];
    static Scanner sc = new Scanner(System.in);

    public void initializeTrains() {
        trains[0] = new Train("Rajdhani Express", "Delhi", "Mumbai", 2500, 1001);
        trains[1] = new Train("Shatabdi Express", "Delhi", "Lucknow", 1200, 1002);
        trains[2] = new Train("Duronto Express", "Mumbai", "Kolkata", 2800, 1003);
        trains[3] = new Train("Garib Rath", "Delhi", "Jaipur", 800, 1004);
        trains[4] = new Train("Humsafar Express", "Bangalore", "Hyderabad", 1500, 1005);
        trains[5] = new Train("Tejas Express", "Delhi", "Chandigarh", 1000, 1006);
        trains[6] = new Train("Jan Shatabdi", "Patna", "Varanasi", 600, 1007);
        trains[7] = new Train("Vande Bharat", "Chennai", "Bangalore", 2200, 1008);
        trains[8] = new Train("Superfast Express", "Kolkata", "Delhi", 2600, 1009);
        trains[9] = new Train("Mail Express", "Nagpur", "Bhopal", 700, 1010);
    }

    public static void displayTrains() {
        System.out.println("\nAvailable Trains:");
        System.out.println("Train No\tTrain Name\t\tBoarding\tDestination\tFare");
        for (int i = 0; i < trains.length; i++) {
            Train t = trains[i];
            System.out.println(t.trainNumber + "\t" + t.name + "\t" + t.boarding + "\t" + t.destination + "\t" + t.fare);
        }
    }

    public static String getBerth(int index) {
        String[] berths = {"Lower", "Middle", "Upper", "Side Lower", "Side Upper"};
        return berths[index % berths.length];
    }

    public static int getCoachNo(int index) {
        return (index % 10) + 1;
    }

    public static void main(String[] args) {
        RailwayReservationSystem ob = new RailwayReservationSystem();
        ob.initializeTrains();

        System.out.print("Enter date of journey (dd): ");
        int day = sc.nextInt();
        System.out.print("Enter month of journey (mm): ");
        int month = sc.nextInt();

        // Assume current month is September (09) for validation
        int currentMonth = 9;

        if (month != currentMonth || day < 1 || day > 31) {
            System.out.println("Invalid date. Only current month is allowed!");
            return;
        }

        sc.nextLine();
        System.out.print("Enter Boarding Station: ");
        String boarding = sc.nextLine();
        System.out.print("Enter Destination Station: ");
        String destination = sc.nextLine();

        displayTrains();
        System.out.print("\nEnter Train Number: ");
        int trainNo = sc.nextInt();
        sc.nextLine();

        Train selectedTrain = null;
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].trainNumber == trainNo) {
                selectedTrain = trains[i];
                break;
            }
        }

        if (selectedTrain == null) {
            System.out.println("Invalid train number!");
            return;
        }

        System.out.print("Enter number of passengers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Passenger[] passengers = new Passenger[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Passenger " + (i + 1));
            System.out.print("Name: ");
            String pname = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Gender (M/F): ");
            String gender = sc.nextLine();
            int coachNo = getCoachNo(i);
            String berth = getBerth(i);
            passengers[i] = new Passenger(pname, age, gender, coachNo, berth);
        }

        int totalCost = selectedTrain.fare * n;
        String PNR = selectedTrain.name.substring(0, 3).toUpperCase() + day + month;

        System.out.println("\n---------------- RAILWAY TICKET ----------------");
        System.out.println("Date of Journey: " + day + "/" + month);
        System.out.println("Boarding: " + boarding);
        System.out.println("Destination: " + destination);
        System.out.println("Train: " + selectedTrain.name + " (" + selectedTrain.trainNumber + ")");
        System.out.println("PNR: " + PNR);
        System.out.println("\nPassenger Details:");
        System.out.println("Name\tAge\tGender\tCoach\tBerth");
        for (int i = 0; i < passengers.length; i++) {
            Passenger p = passengers[i];
            System.out.println(p.name + "\t" + p.age + "\t" + p.gender + "\t" + p.coachNo + "\t" + p.berth);
        }
        System.out.println("------------------------------------------------");
        System.out.println("Total Fare: Rs. " + totalCost);
        System.out.println("------------------------------------------------");
    }
}