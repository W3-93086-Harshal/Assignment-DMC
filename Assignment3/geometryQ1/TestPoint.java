package com.app.geometry;


import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y coordinates for Point 1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        Point2D p1 = new Point2D(x1, y1);

        System.out.print("Enter x and y coordinates for Point 2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Point2D p2 = new Point2D(x2, y2);

        System.out.println("Point 1 details: " + p1.getDetails());
        System.out.println("Point 2 details: " + p2.getDetails());

        if (p1.isEqual(p2)) {
            System.out.println("Points are at the same position.");
        } else {
            System.out.println("Points are at different positions.");
            System.out.printf("Distance between points: %.2f\n", p1.calculateDistance(p2));
            System.out.println(" Date :- 25/08/2025 ");
        }
        sc.close();
    }
}
