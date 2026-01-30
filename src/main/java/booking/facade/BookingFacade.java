package booking.facade;

import booking.model.Booking;
import booking.dao.BookingDAO;
import payment.model.Payment;
import payment.dao.PaymentDAO;
import show.dao.ShowDAO;
import movie.dao.MovieDAO;
import user.dao.UserDAO;

public class BookingFacade {

    private UserDAO userDAO;
    private MovieDAO movieDAO;
    private ShowDAO showDAO;
    private BookingDAO bookingDAO;
    private PaymentDAO paymentDAO;

    public BookingFacade() {
        userDAO = new UserDAO();
        movieDAO = new MovieDAO();
        showDAO = new ShowDAO();
        bookingDAO = new BookingDAO();
        paymentDAO = new PaymentDAO();
    }

    /**
     * Book a ticket for a user
     * @param userId - user ID
     * @param showId - show ID
     * @param movieId - movie ID
     * @param seats - number of seats
     * @param amount - payment amount
     */
    public void bookTicket(int userId, int showId, int movieId, int seats, double amount) {
        try {
            // Optional: validate user exists (simplified)
            System.out.println("Booking started for User ID: " + userId);

            // 1. Create Booking
            Booking booking = new Booking(userId, showId, seats);
            bookingDAO.createBooking(booking);

            // 2. Make Payment
            Payment payment = new Payment(booking.getBookingId(), amount, "OnlineGateway");
            paymentDAO.makePayment(payment);

            System.out.println("Booking completed successfully for User ID: " + userId);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Booking failed for User ID: " + userId);
        }
    }
}
