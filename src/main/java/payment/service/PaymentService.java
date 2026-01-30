package payment.service;

import payment.dao.PaymentDAO;
import payment.model.Payment;

public class PaymentService {
    PaymentDAO dao = new PaymentDAO();

    public void makePayment(Payment payment) {
        dao.makePayment(payment);
    }
}
