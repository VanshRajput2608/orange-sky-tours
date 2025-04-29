package com.orangeskytours.controller;

import com.orangeskytours.model.Contact;
import com.orangeskytours.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContactController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/submitContact")
    public @ResponseBody String submitContact(Contact contact) {
        notificationService.sendEmail(contact);
        notificationService.sendSms(contact);
        return "success";
    }

}
