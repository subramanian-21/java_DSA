package systemDesign.railwarReservationSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean start = true;

        while (start) {
            System.out.println("1. Book Tickets\n2. Cancel Tickets\n3.Booked Tickets\n4.Exit");
            int choice = s.nextInt();

            switch (choice) {
                case 1:{
                    System.out.println("Enter Passenger Name and age:");
                    String name = s.next();
                    int age = s.nextInt();
                    Passenger p = new Passenger(name, age);
                    TicketBooker ticket = new TicketBooker();
                    ticket.bookTicket(p);
                    break;
                }
                case 2:{
                    // cancel ticket
                    break;
                }
                case 3:{
                    // booked tickets
                    break;
                }
                case 4:{
                    // exit
                    start = false;
                    break;
                } 
                default:
                System.out.println("Invalid Operation");
                    break;
            }
        }
    }
}
