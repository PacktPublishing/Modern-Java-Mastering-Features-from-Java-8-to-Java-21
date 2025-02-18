package com.modernjava.domain;

public record Card(String name,
                   String cardNumber,
                   String verificationCode,
                   String expiryDate,
                   CardType cardType
) {
}
