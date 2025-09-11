package com.app.Fruits;

import java.util.Scanner;

class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basket size: ");
        int size = sc.nextInt();
        Fruit[] basket = new Fruit[size];

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Apple");
            System.out.println("2. Add Mango");
            System.out.println("3. Add Orange");
            System.out.println("4. Show Basket");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addFruit(basket, new Apple("Red", 0.2, true));
                    break;
                case 2:
                    addFruit(basket, new Mango("Yellow", 0.3, true));
                    break;
                case 3:
                    addFruit(basket, new Orange("Orange", 0.25, true));
                    break;
                case 4:
                    showBasket(basket);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private static void addFruit(Fruit[] basket, Fruit fruit) {
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                basket[i] = fruit;
                System.out.println(fruit.getName() + " added to basket.");
                return;
            }
        }
        System.out.println("Basket is full!");
    }

    private static void showBasket(Fruit[] basket) {
        System.out.println("\nBasket contents:");
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] != null) {
                System.out.println((i+1) + ". " + basket[i] + " | Taste: " + basket[i].taste());
            } else {
                System.out.println((i+1) + ". [Empty]");
            }
        }
    }
}

