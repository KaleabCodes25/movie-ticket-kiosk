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
        final double MINIMUM_TICKET_PRICE = 5.00;

        // Price per ticket after the day discount, never below the minimum
        double ticketPrice = Math.max(basePrice - dayDiscount, MINIMUM_TICKET_PRICE);
        double subtotal = ticketPrice * ticketCount;
        double memberDiscount = 0.00;                // no member discount yet
        double total = subtotal - memberDiscount + SERVICE_FEE;
        long rewardPoints = Math.round(total);       // one point per dollar, rounded

        System.out.println("Ticket price: " + ticketPrice);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total: " + total);
        System.out.println("Reward points: " + rewardPoints);


    }

}
