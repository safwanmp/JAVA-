class TicketBookingSystem {
    private int totalTickets = 5;

    public synchronized void bookTicket(String customer, int tickets) {
        if (tickets <= totalTickets) {
            System.out.println(customer + " booked " + tickets + " ticket(s)");
            totalTickets -= tickets;
            System.out.println("Remaining tickets: " + totalTickets);
        } else {
            System.out.println(customer + " cannot book. Not enough tickets.");
        }
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem();
        Thread t1 = new Thread(() -> system.bookTicket("Customer 1", 2));
        Thread t2 = new Thread(() -> system.bookTicket("Customer 2", 3));
        Thread t3 = new Thread(() -> system.bookTicket("Customer 3", 1));
        t1.start();
        t2.start();
        t3.start();
    }
}
