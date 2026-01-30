package movie.service;

import movie.dao.MovieDAO;
import movie.model.Movie;

public class MovieService {
    private MovieDAO dao = new MovieDAO();

    public void addMovie(String title, String genre){
        Movie movie = new Movie(title, genre);
        dao.saveMovie(movie);
    }
     public void listMovies(){
        dao.listMovies();  
    }
}
