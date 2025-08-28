package com.app.Car;
import java.util.Scanner;

public class CarCostApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double milesPerDay = sc.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = sc.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double avgMilesPerGallon = sc.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parkingFees = sc.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = sc.nextDouble();

        CarCostCalculator calculator = new CarCostCalculator(milesPerDay, costPerGallon, avgMilesPerGallon, parkingFees, tolls);
        double totalDailyCost = calculator.calculateTotalCost();

        System.out.printf("Your total daily driving cost is: %.2f\n", totalDailyCost);
        System.out.println("Date : 25/08/2025");
        sc.close();
        }

}
