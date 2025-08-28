package com.app.Car;
// Assignment 2 Question number 3 //
//a) Total miles driven per day.//
//b) Cost per gallon of gasoline.//
//c) Average miles per gallon.//
//d) Parking fees per day.//
//e) Tolls per day.//

public class CarCostCalculator {
    private double milesPerDay;
    private double costPerGallon;
    private double avgMilesPerGallon;
    private double parkingFees;
    private double tolls;

    public CarCostCalculator(double milesPerDay, double costPerGallon, double avgMilesPerGallon, double parkingFees, double tolls) {
        this.milesPerDay = milesPerDay;
        this.costPerGallon = costPerGallon;
        this.avgMilesPerGallon = avgMilesPerGallon;
        this.parkingFees = parkingFees;
        this.tolls = tolls;
    }

    public double calculateTotalCost() {
        double dailyGasCost = (milesPerDay / avgMilesPerGallon) * costPerGallon;
        return dailyGasCost + parkingFees + tolls;
    }
}
