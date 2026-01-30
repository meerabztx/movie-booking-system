package user.controller;

import java.util.Scanner;
import user.services.UserService;

public class UserController {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService service = new UserService();  

        System.out.println("Welcome to User Registration/Login");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.print("Choose option: ");
        int option = sc.nextInt();
        sc.nextLine();

        if(option == 1){
            // Registration
            System.out.print("Enter phone: ");
            String phone = sc.nextLine();

            System.out.print("Enter email: ");
            String email = sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            service.registerUser(phone, email, name, password);
            System.out.println("User registered successfully!");
        } 
        else if(option == 2){
            // Login
            System.out.print("Enter email: ");
            String email = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            boolean success = service.loginUser(email, password);
            if(success){
                System.out.println("Login successful! Welcome.");
            } else{
                System.out.println("Invalid email or password.");
            }
        }
        else {
            System.out.println("Invalid option!");
        }

        sc.close();
    }
}
