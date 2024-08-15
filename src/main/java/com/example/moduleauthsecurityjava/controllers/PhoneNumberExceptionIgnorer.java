package com.example.moduleauthsecurityjava.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class PhoneNumberExceptionIgnorer {
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Please Supply A Valid UK Phone Number")
    @ExceptionHandler(BindException.class)
    public void bindError() {
        // noop
    }
}
