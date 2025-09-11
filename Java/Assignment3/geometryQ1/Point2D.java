package com.app.geometryQ2;

public class Point2D {
    private double x;
    private double y;

    // Parameterized constructor
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to return string form of point's x & y coordinates
    public String getDetails() {
        return "Point: (" + x + ", " + y + ")";
    }

    // Method to check if two points are equal
    public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
    }

    // Method to calculate distance between current point and specified point
    public double calculateDistance(Point2D other) {

        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}
