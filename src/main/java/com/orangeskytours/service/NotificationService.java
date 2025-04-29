package com.orangeskytours.service;

import com.orangeskytours.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(Contact contact) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("vansh.rajput2608@gmail.com");
        msg.setSubject("New Contact from " + contact.getName());
        msg.setText("Email: " + contact.getEmail() + "\nMessage: " + contact.getMessage());
        mailSender.send(msg);
    }

    public void sendSms(Contact contact) {
        // Mock SMS sending
        System.out.println("SMS to 7013162767: New contact from " + contact.getName());
    }
}