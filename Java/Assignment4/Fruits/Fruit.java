package com.app.Fruits;

public class Fruit {
    private String color;
    private double weight;
    private String name;
    private boolean isFresh;

    // Constructor
    public Fruit(String name, String color, double weight, boolean isFresh) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = isFresh;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isFresh() {
        return isFresh;
    }

    // toString method
    @Override
    public String toString() {
        return "Fruit{name='" + name + "', color='" + color + "', weight=" + weight + ", isFresh=" + isFresh + "}";
    }

    // taste method
    public String taste() {
        return "no specific taste";
    }
}

// Subclass Apple
class Apple extends Fruit {
    public Apple(String color, double weight, boolean isFresh) {
        super("Apple", color, weight, isFresh);
    }

    @Override
    public String taste() {
        return "sweet n sour";
    }
}

// Subclass Orange
class Orange extends Fruit {
    public Orange(String color, double weight, boolean isFresh) {
        super("Orange", color, weight, isFresh);
    }

    @Override
    public String taste() {
        return "sour";
    }
}

// Subclass Mango
class Mango extends Fruit {
    public Mango(String color, double weight, boolean isFresh) {
        super("Mango", color, weight, isFresh);
    }

    @Override
    public String taste() {
        return "sweet";
    }
}