package edu.najah.cap.designpattern.quiz.q17;

import edu.najah.cap.designpattern.quiz.q17.third.GoogleEmailSender;

public class Customer {

    private IEmailSender emailSender;

    public Customer(IEmailSender emailSender){
        this.emailSender = emailSender;
    }
    public void sendEmailToCustomer(String email){
        emailSender.sendEmail(email);
    }
}
