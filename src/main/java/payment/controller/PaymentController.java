package payment.controller;

import java.util.Scanner;
import payment.model.Payment;
import payment.service.PaymentService;

public class PaymentController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentService service = new PaymentService();

        System.out.print("Enter Booking ID: ");
        int bookingId = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Enter Payment Gateway (e.g., Credit Card, JazzCash): ");
        String gateway = sc.nextLine();
        
        Payment payment = new Payment(bookingId, amount, gateway);

            service.makePayment(payment);
    }
}
