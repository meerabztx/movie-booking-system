package movie.dao;

import movie.model.Movie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import user.db.DBConnection; // <-- Use singleton

public class MovieDAO {

    // Add a movie
    public void addMovie(String title, String genre){
        try {
            Connection conn = DBConnection.getInstance().getConnection();  
            String sql = "INSERT INTO movies(title, genre) VALUES(?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, genre);
            ps.executeUpdate();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    // List all movies
    public void listMovies(){
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            String sql = "SELECT * FROM movies";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("ID: " + rs.getInt("id") + ", Title: " + rs.getString("title") + ", Genre: " + rs.getString("genre"));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
   
    // Save a movie object
    public void saveMovie(Movie movie) {
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            String sql = "INSERT INTO movies(title, genre) VALUES(?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, movie.getTitle());
            ps.setString(2, movie.getGenre());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
