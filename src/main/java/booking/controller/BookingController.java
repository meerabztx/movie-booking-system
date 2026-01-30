package booking.controller;

import java.util.Scanner;
import booking.model.Booking;
import booking.service.BookingService;

public class BookingController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookingService service = new BookingService();

        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();

        System.out.print("Enter Movie ID: ");
        int movieId = sc.nextInt();

        System.out.print("Enter Show ID: ");
        int showId = sc.nextInt();

        Booking booking = new Booking(userId, movieId, showId);
        service.bookMovie(booking);

        service.viewBookings();
    }
}
