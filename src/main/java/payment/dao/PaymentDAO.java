package payment.dao;

import java.sql.*;
import payment.model.Payment;
import user.db.DBConnection; // <-- Singleton

public class PaymentDAO {
    
    // Record a payment
    public void makePayment(Payment payment) {
        String sql = "INSERT INTO Payment(booking_id, amount, gateway) VALUES (?, ?, ?)";
        
        try (Connection conn = DBConnection.getInstance().getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            ps.setInt(1, payment.getBookingId());
            ps.setDouble(2, payment.getAmount());
            ps.setString(3, payment.getGateway()); 
            
            ps.executeUpdate();
            
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    payment.setPaymentId(rs.getInt(1));
                    System.out.println("Payment recorded with ID: " + payment.getPaymentId());
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
