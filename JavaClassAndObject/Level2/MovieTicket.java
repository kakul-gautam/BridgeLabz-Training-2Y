package Level2;
import java.util.Scanner;

public class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    // Constructor to initialize MovieTicket object
    MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket (assign seat and update price)
    void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked: Seat " + seatNumber + ", Price " + price);
    }

    // Method to display ticket details
    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter seat number: ");
        String seatNumber = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        MovieTicket ticket = new MovieTicket(movieName, "", 0);
        ticket.bookTicket(seatNumber, price);
        ticket.displayDetails();

        scanner.close();
    }
}
