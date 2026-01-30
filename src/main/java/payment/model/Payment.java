package payment.model;

public class Payment {
    private int paymentId;    
    private int bookingId;
    private double amount;
    private String gateway;     
    private String status;
    public Payment(int bookingId, double amount, String gateway) {
        this.bookingId = bookingId;
        this.amount = amount;
        this.gateway = gateway;
    }
    public int getPaymentId() { return paymentId; }
    public void setPaymentId(int paymentId) { this.paymentId = paymentId; }

    public int getBookingId() { return bookingId; }
    public void setBookingId(int bookingId) { this.bookingId = bookingId; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getGateway() { return gateway; }
    public void setGateway(String gateway) { this.gateway = gateway; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
