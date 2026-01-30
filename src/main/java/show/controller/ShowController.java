package show.controller;

import java.util.Scanner;
import show.model.Show;
import show.service.ShowService;

public class ShowController {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShowService service = new ShowService();

        try {
            // Get Movie ID
            System.out.print("Enter Movie ID: ");
            int movieId = sc.nextInt();
            sc.nextLine(); // consume newline

            // Get Show Time
            System.out.print("Enter Show Time (YYYY-MM-DD HH:MM:SS): ");
            String time = sc.nextLine();

            // Get Theatre Number
            System.out.print("Enter Theatre Number: ");
            String theatre = sc.nextLine();

            // Get Number of Seats
            System.out.print("Enter Number of Seats: ");
            int seats = sc.nextInt();

            // Create Show object
            Show show = new Show(movieId, time, theatre, seats);

            // Add show to database
            service.addShow(show);

            // Display all shows
            System.out.println("\n--- Current Shows ---");
            service.viewShows();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error adding show!");
        } finally {
            sc.close();
        }
    }
}
