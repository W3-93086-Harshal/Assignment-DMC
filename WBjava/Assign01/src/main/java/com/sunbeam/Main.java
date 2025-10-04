package com.sunbeam;

import com.sunbeam.Dao.*;
import com.sunbeam.entities.FoodItem;
import com.sunbeam.entities.Order;
import com.sunbeam.entities.OrderDetail;
import com.sunbeam.entities.User;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Database connection successful!");

            while (true) {
                System.out.println("\n--- Food Order System ---");
                System.out.println("1. Manage Users");
                System.out.println("2. Manage Food Items");
                System.out.println("3. Manage Orders");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        manageUsers(scanner);
                        break;
                    case 2:
                        manageFoodItems(scanner);
                        break;
                    case 3:
                        manageOrders(scanner);
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void manageOrders(Scanner scanner) {

    }

    private static void manageUsers(Scanner scanner) throws Exception {
        UserDao userDao = new UserDaoImpl();
        System.out.println("\n--- User Management ---");
        System.out.println("1. Add User");
        System.out.println("2. Find User by Email");
        System.out.println("3. Show All Users");
        System.out.println("4. Delete User by Email");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                // Logic to add a user
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter email: ");
                String email = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                System.out.print("Enter mobile: ");
                String mobile = scanner.nextLine();
                User newuser = new User(); // Assume User setters
                // ... set properties
                userDao.save(newuser);
                System.out.println("User added successfully!");
                break;
            case 2:
                // Logic to find a user by email
                System.out.print("Enter email: ");
                String findEmail = scanner.nextLine();
                User user = userDao.findByEmail(findEmail);
                System.out.println("Found User: " + (user != null ? user.getName() : "Not Found"));
                break;
            case 3:
                // Logic to show all users
                List<User> users = userDao.findAll();
                users.forEach(u -> System.out.println(u.getName() + " (" + u.getEmail() + ")"));
                break;
            case 4:
                // Logic to delete a user
                System.out.print("Enter email to delete: ");
                String deleteEmail = scanner.nextLine();
                int rowsAffected = userDao.deleteByEmail(deleteEmail);
                System.out.println(rowsAffected > 0 ? "User deleted." : "User not found.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void manageFoodItems(Scanner scanner) throws Exception {
        try(FoodItemDao foodItemDao = new FoodDaoImpl()) {
            System.out.println("\n--- Food Item Management ---");
            System.out.println("1. Show All Food Items");
            System.out.println("2. Find Food Item by ID");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    List<FoodItem> items = foodItemDao.findAll();
                    items.forEach(item -> System.out.printf("%d: %s - $%.2f\n", item.getFid(), item.getName(), item.getPrice()));
                    break;
                case 2:
                    System.out.print("Enter food ID: ");
                    int id = scanner.nextInt();
                    FoodItem item = foodItemDao.findById(id);
                    System.out.println("Found Item: " + (item != null ? item.getName() : "Not Found"));
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

//    private static void manageOrders(Scanner scanner) throws Exception {
//        System.out.println("\n--- Order Management ---");
//        System.out.println("1. Place New Order");
//        System.out.println("2. View Orders by User");
//        System.out.println("3. Update Order Status");
//        System.out.print("Enter your choice: ");
//        int choice = scanner.nextInt();
//        scanner.nextLine();
//
//        switch (choice) {
//            case 1:
//                // Simplified logic to place an order
//                System.out.print("Enter your User ID to place an order: ");
//                int userId = scanner.nextInt();
//                if (UserDao.findById(userId) == null) {
//                    System.out.println("User not found!");
//                    break;
//                }
//
//                System.out.print("Enter Food ID to order: ");
//                int foodId = scanner.nextInt();
//                System.out.print("Enter quantity: ");
//                int quantity = scanner.nextInt();
//
//                FoodItem item =FoodItemDao.findById(foodId);
//                if(item == null) {
//                    System.out.println("Food item not found!");
//                    break;
//                }
//
//                // Create and save the order
//                Order newOrder = new Order();
//                newOrder.setUid(userId);
//                newOrder.setTotalAmount(item.getPrice() * quantity);
//                int orderId = OrderDao.saveOrder(newOrder); // Assume saveOrder returns the generated ID
//
//                // Create and save order detail
//                OrderDetail detail = new OrderDetail();
//                detail.setOid(orderId);
//                detail.setFid(foodId);
//                detail.setQuantity(quantity);
//                OrderDao.saveOrderDetail(detail);
//
//                System.out.println("Order placed successfully with ID: " + orderId);
//                break;
//            case 2:
//                // Logic to view orders by user
//                System.out.print("Enter User ID to view orders: ");
//                int uid = scanner.nextInt();
//                List<Order> orders = OrderDao.findOrdersByUserId(uid);
//                orders.forEach(o -> System.out.printf("Order ID: %d, Amount: $%.2f, Status: %s\n", o.getOid(), o.getTotalAmount(), o.getStatus()));
//                break;
//            case 3:
//                // Logic to update order status
//                System.out.print("Enter Order ID to update: ");
//                int oId = scanner.nextInt();
//                scanner.nextLine(); // consume newline
//                System.out.print("Enter new status (PENDING, PROCESSING, DELIVERED, CANCELLED): ");
//                String status = scanner.nextLine().toUpperCase();
//                int updated = OrderDao.updateOrderStatus(oId, status);
//                System.out.println(updated > 0 ? "Status updated." : "Order not found.");
//                break;
//            default:
//                System.out.println("Invalid choice.");
//        }
//    }
}