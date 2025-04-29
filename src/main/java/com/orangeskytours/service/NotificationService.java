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
		msg.setSubject("New Contact Request from " + contact.getName());

		String body = "Dear Admin,\n\n" + "You have received a new contact inquiry through Orange Sky Tours.\n\n"
				+ "Details are as follows:\n" + "--------------------------------------\n" + "Name    : "
				+ contact.getName() + "\n" + "Email   : " + contact.getEmail() + "\n" + "Phone   : "
				+ contact.getPhone() + "\n" + "Message : " + contact.getMessage() + "\n"
				+ "--------------------------------------\n\n"
				+ "Please respond to the customer at your earliest convenience.\n\n" + "Best Regards,\n"
				+ "Orange Sky Tours Website";

		msg.setText(body);
		mailSender.send(msg);
	}

	public void sendSms(Contact contact) {
		// Mock SMS sending
		System.out
				.println("SMS to 7013162767: New contact from " + contact.getName() + " (" + contact.getPhone() + ")");
	}

}