package edu.najah.cap.designpattern.strategydesign.exmaple;

import edu.najah.cap.designpattern.strategydesign.exmaple.payment.impl.*;

public class App {

    /*
    Imagine you are assigned the task of implementing an online payment processing system for an e-commerce website.
    This website allows users to make purchases using various payment methods, including credit cards, PayPal, and cryptocurrency.
    Your goal is to implement this feature in a way that makes it easy to add new payment methods in the future.
     */

    /*
    Imagine you are building a software feature for a company that deals with various lists of data.
    They often need to sort this data in different ways depending on the context.
    To make the software flexible, it should be implemented in such a way that allows users to choose the sorting algorithm at runtime.
     */
    public static void main(String[] args) {

        PaymentProccesser paymentProccesser = new PaymentProccesser(new CashPayemnt());
        paymentProccesser.processPayment(100);

        paymentProccesser = new PaymentProccesser(new CreditCardPayment());
        paymentProccesser.processPayment(100);

        paymentProccesser = new PaymentProccesser(new CryptoPayment());
        paymentProccesser.processPayment(100);

        paymentProccesser = new PaymentProccesser(new PayPalPayemnt());
        paymentProccesser.processPayment(100);




    }
}
