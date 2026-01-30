package show.model;

public class Show {
    private int showId;
    private int movieId;
    private String showTime;
    private String theatreNumber; // NEW
    private int seats;            // NEW

    // Constructor
    public Show(int movieId, String showTime, String theatreNumber, int seats) {
        this.movieId = movieId;
        this.showTime = showTime;
        this.theatreNumber = theatreNumber;
        this.seats = seats;
    }

    // Getters and setters
    public int getShowId() {
        return showId;
    }
    public void setShowId(int showId) {
        this.showId = showId;
    }

    public int getMovieId() {
        return movieId;
    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getShowTime() {
        return showTime;
    }
    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getTheatreNumber() {      // NEW
        return theatreNumber;
    }
    public void setTheatreNumber(String theatreNumber) { // NEW
        this.theatreNumber = theatreNumber;
    }

    public int getSeats() {                  // NEW
        return seats;
    }
    public void setSeats(int seats) {       // NEW
        this.seats = seats;
    }
}
