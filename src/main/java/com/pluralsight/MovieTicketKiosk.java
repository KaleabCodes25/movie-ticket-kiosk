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

        // Price per ticket after the day discount
        double ticketPrice = basePrice - dayDiscount; // 9
        double subtotal = ticketPrice * ticketCount; //27
        double memberDiscount = 0.00;                // no member discount yet
        double total = subtotal - memberDiscount + SERVICE_FEE;

        System.out.println("Ticket price: " + ticketPrice);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total: " + total);
    }

}
