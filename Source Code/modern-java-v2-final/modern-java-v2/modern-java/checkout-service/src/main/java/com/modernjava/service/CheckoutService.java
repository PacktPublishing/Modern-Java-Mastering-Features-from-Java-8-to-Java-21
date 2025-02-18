package com.modernjava.service;

import com.modernjava.domain.*;
import com.modernjava.payment.PaymentService;

public class CheckoutService {

    private final PaymentService paymentService;

    public CheckoutService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public CheckOutStatus checkoutOrder(OrderDetails orderDetails){

        var paymentResponse = paymentService.makePaymentv2(orderDetails);
        if(paymentResponse.equals(PaymentResponse.SUCCESS)){
            return CheckOutStatus.SUCCESS;
        }
        return CheckOutStatus.FAILURE;

    }
}
