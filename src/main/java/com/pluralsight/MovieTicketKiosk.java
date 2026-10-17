package com.pluralsight;

import java.util.Scanner;
public class MovieTicketKiosk {
    public static void main(String[] args) {
        System.out.println("Welcome to the Movie Ticket Kiosk");

        // One Scanner reads everything the user types
        Scanner scanner = new Scanner(System.in);

        // Customer details
        System.out.print("What is your name? ");
        String customerName = scanner.nextLine();

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

        // Receipt
        System.out.println();
        System.out.printf("Customer:        %s%n", customerName);
        System.out.printf("Tickets:         %d x $%.2f%n", ticketCount, ticketPrice);
        System.out.printf("Subtotal:        $%.2f%n", subtotal);
        System.out.printf("Member discount: $%.2f%n", memberDiscount);
        System.out.printf("Service fee:     $%.2f%n", SERVICE_FEE);
        System.out.printf("Total:           $%.2f%n", total);
        System.out.printf("Reward points:   %d%n", rewardPoints);

        scanner.close();                             // done reading: release the keyboard


    }

}
