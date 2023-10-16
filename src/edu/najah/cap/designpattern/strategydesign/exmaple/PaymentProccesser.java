package edu.najah.cap.designpattern.strategydesign.exmaple;

import edu.najah.cap.designpattern.strategydesign.exmaple.payment.abstraction.Payment;

public class PaymentProccesser {

    private Payment paymentContext = null;

    public PaymentProccesser(Payment paymentContext) {
        this.paymentContext = paymentContext;
    }

    //1- DIP violaviolationtion
    //2- SRP violation - reuse -- Fixed
    //3- OCP violation - extension
    public void processPayment(int amount) {
        paymentContext.pay(amount);
    }

}
