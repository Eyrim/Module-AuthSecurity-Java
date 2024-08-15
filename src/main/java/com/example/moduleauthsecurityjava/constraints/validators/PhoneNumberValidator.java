package com.example.moduleauthsecurityjava.constraints.validators;

import com.example.moduleauthsecurityjava.constraints.PhoneNumberConstraint;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumberConstraint, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value.startsWith("+44")) {
            return validatePhoneNumberWithCountryCode(value);
        } else if (hasAlphabeticalCharacters(value)) {
            return false;
        } else if (value.length() != 11) {
            return false;
        }

        return true;
    }

    private boolean validatePhoneNumberWithCountryCode(final String value) {
        return value.length() != 13 ? false : true;
    }

    private boolean hasAlphabeticalCharacters(final String value) {
        final int letterCount = value.chars()
                .filter(Character::isLetter)
                .sum();

        return letterCount == 0 ? false : true;
    }
}
