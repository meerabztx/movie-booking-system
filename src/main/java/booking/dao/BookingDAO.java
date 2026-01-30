package booking.dao;

import java.sql.*;
import booking.model.Booking;
import user.db.DBConnection; // <-- Singleton

public class BookingDAO {

    // Create a new booking
    public void createBooking(Booking booking) {
        String sql = "INSERT INTO Booking(user_id, show_id, seats_booked) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getInstance().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, booking.getUserId());
            ps.setInt(2, booking.getShowId());
            ps.setInt(3, booking.getSeatsBooked());

            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    booking.setBookingId(rs.getInt(1));
                    System.out.println("Booking successful with ID: " + booking.getBookingId());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // View all bookings
    public void viewBookings() {
        String sql = "SELECT b.booking_id, b.user_id, b.seats_booked, m.movie_id, m.title " +
                     "FROM Booking b " +
                     "JOIN MShow s ON b.show_id = s.show_id " +
                     "JOIN Movie m ON s.movie_id = m.movie_id";

        try (Connection conn = DBConnection.getInstance().getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    "Booking ID: " + rs.getInt("booking_id") +
                    " | User ID: " + rs.getInt("user_id") +
                    " | Movie ID: " + rs.getInt("movie_id") +
                    " | Movie Title: " + rs.getString("title") +
                    " | Seats Booked: " + rs.getInt("seats_booked")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
