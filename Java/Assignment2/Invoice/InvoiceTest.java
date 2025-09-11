package com.app.Invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        // Create Invoice objects
        Invoice invoice1 = new Invoice("A123", "Hammer", 5, 150.0);
        Invoice invoice2 = new Invoice("B456", "Screwdriver", -3, 50.0); // Invalid quantity
        Invoice invoice3 = new Invoice("C789", "Wrench", 2, -20.0); // Invalid price

        // Display invoice details
        displayInvoice(invoice1);
        displayInvoice(invoice2);
        displayInvoice(invoice3);
    }

    private static void displayInvoice(Invoice invoice) {
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
        System.out.println("-----------------------------");
        System.out.println(" Date :- 25/08/2025 ");
    }
}
