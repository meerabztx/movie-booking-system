package booking.model;

public class Booking {
    private int bookingId; 
    private int showId;
    private int userId;
    private int seatsBooked; 

    public Booking(int showId, int userId, int seatsBooked) {
        this.showId = showId;
        this.userId = userId;
        this.seatsBooked = seatsBooked;
    }

    public Booking(int bookingId, int showId, int userId, int seatsBooked) {
        this.bookingId = bookingId;
        this.showId = showId;
        this.userId = userId;
        this.seatsBooked = seatsBooked;
    }

    public int getBookingId() { return bookingId; }
    public void setBookingId(int bookingId) { this.bookingId = bookingId; }

    public int getShowId() { return showId; }
    public void setShowId(int showId) { this.showId = showId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public int getSeatsBooked() { return seatsBooked; }
    public void setSeatsBooked(int seatsBooked) { this.seatsBooked = seatsBooked; }
}
