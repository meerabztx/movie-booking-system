package movie.controller;

import java.util.Scanner;
import movie.service.MovieService;

public class MovieController {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieService movieService = new MovieService();  

        System.out.println("Welcome to Movie Manager");

        boolean running = true;

        while(running){
            System.out.println("\n1. Add Movie");
            System.out.println("2. List Movies");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int option = sc.nextInt();
            sc.nextLine(); 

            switch(option){
                case 1:
                    // Add a new movie
                    System.out.print("Enter movie title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter movie genre: ");
                    String genre = sc.nextLine();

                    movieService.addMovie(title, genre);
                    System.out.println("Movie added successfully!");
                    break;

                case 2:
                   
                    movieService.listMovies(); 
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }

        sc.close();
    }
}
