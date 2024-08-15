package com.example.moduleauthsecurityjava.models;

import com.example.moduleauthsecurityjava.constraints.PhoneNumberConstraint;

public class PhoneNumberRequest {
    
    @PhoneNumberConstraint
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
