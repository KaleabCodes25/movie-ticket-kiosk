package com.pluralsight;

public class MovieTicketKiosk {
    public static void main(String[] args) {
        System.out.println("Welcome to the Movie Ticket Kiosk");
        // Customer details, typed in by hand for now
        String customerName = "Maya";
        int age = 34;
        int ticketCount = 3;
        String dayOfWeek = "Tuesday";
        boolean isMember = true;

        // Prices
        double basePrice = 12.00;
        double dayDiscount = 3.00;
        final double SERVICE_FEE = 1.50;

        // Check the values
        System.out.println("Customer: " + customerName);
        System.out.println("Tickets: " + ticketCount);
        System.out.println("Member: " + isMember);
        System.out.println("Base price: " + basePrice);
    }
}
