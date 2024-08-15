package com.example.moduleauthsecurityjava.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.moduleauthsecurityjava.models.PhoneNumberRequest;

import jakarta.validation.Valid;

@RestController
public class PhoneNumberController {
    @PostMapping("/phone-number")
    public String phoneNumberSubmit(final @ModelAttribute @Valid PhoneNumberRequest request) {
        System.out.println("\033[96mThe user submitted the phone number: " + request.getPhone() + "\033[0m");
        return "Successful!";
    }
}
