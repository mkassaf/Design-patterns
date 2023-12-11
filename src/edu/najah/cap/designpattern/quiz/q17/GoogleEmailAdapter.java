package edu.najah.cap.designpattern.quiz.q17;

import edu.najah.cap.designpattern.quiz.q17.third.GoogleEmailSender;

public class GoogleEmailAdapter implements IEmailSender {
    private GoogleEmailSender googleEmailSender;

    public GoogleEmailAdapter(GoogleEmailSender googleEmailSender) {
        this.googleEmailSender = googleEmailSender;
    }

    @Override
    public void sendEmail(String email) {
        googleEmailSender.sendEmail(email);
    }
}
