package edu.najah.cap.designpattern.strategydesign.exmaple.payment.impl;

import edu.najah.cap.designpattern.strategydesign.exmaple.payment.abstraction.Payment;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Credit Card Payment");
    }
}
