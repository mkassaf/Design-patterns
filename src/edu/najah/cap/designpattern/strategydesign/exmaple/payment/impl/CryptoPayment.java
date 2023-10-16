package edu.najah.cap.designpattern.strategydesign.exmaple.payment.impl;

import edu.najah.cap.designpattern.strategydesign.exmaple.payment.abstraction.Payment;

public class CryptoPayment implements Payment {

        @Override
        public void pay(int amount) {
            System.out.println("Crypto Payment");
        }
}
