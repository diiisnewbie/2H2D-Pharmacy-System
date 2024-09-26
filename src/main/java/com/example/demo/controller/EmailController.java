package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.SendEmailService;


@Controller
public class EmailController {
    @Autowired
    private SendEmailService sendEmailService;

    @GetMapping("sendEmail")
    public String sendEmail() {
        sendEmailService.sendEmail("vtd190092004@gmail.com", "May Ngu", "Test send email");
        return "Sent successfuly";
    }
}
