package edu.najah.cap.designpattern.strategydesign.exmaple.payment.impl;

import edu.najah.cap.designpattern.strategydesign.exmaple.payment.abstraction.Payment;

public class PayPalPayemnt implements Payment {

    @Override
    public void pay(int amount) {
        System.out.println("PayPal Payment");
        //Code realted to PayPal payment processing
    }
}
