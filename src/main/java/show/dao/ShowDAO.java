package show.dao;

import java.sql.*;
import show.model.Show;
import user.db.DBConnection; // Singleton DB connection

public class ShowDAO {

    // Add a new show
    public void addShow(Show show) {
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            String sql = "INSERT INTO MShow(movie_id, show_time, theatre_number, seats) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, show.getMovieId());
            ps.setString(2, show.getShowTime());
            ps.setString(3, show.getTheatreNumber());
            ps.setInt(4, show.getSeats());
            ps.executeUpdate();
            System.out.println("Show added successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // View all shows
    public void viewShows() {
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(
                "SELECT show_id, movie_id, show_time, theatre_number, seats FROM MShow"
            );

            while (rs.next()) {
                System.out.println(
                    "Show ID: " + rs.getInt("show_id") +
                    " | Movie ID: " + rs.getInt("movie_id") +
                    " | Time: " + rs.getString("show_time") +
                    " | Theatre: " + rs.getString("theatre_number") +
                    " | Seats: " + rs.getInt("seats")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
