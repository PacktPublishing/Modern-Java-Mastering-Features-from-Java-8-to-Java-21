package com.modernjava.domain;

public record OrderDetails(String orderId,

                           Card card,
                           double finalAmount) {
}
