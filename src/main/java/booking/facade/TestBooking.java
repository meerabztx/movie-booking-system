/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking.facade;
import booking.dao.BookingDAO;

/**
 *
 * @author HP
 */
public class TestBooking {
    public static void main(String[] args) {
        BookingFacade facade = new BookingFacade();
        // Book 2 seats for user 1, show 1, movie 1, amount 500
        facade.bookTicket(1, 1, 1, 2, 500.0);

        // Optional: view bookings
        BookingDAO bookingDAO = new BookingDAO();
        bookingDAO.viewBookings();
    }
}
