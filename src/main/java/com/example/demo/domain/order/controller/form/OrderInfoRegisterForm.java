package com.example.demo.domain.order.controller.form;

import com.example.demo.domain.order.service.request.DeliveryRegisterRequest;
import com.example.demo.domain.order.service.request.OrderItemRegisterRequest;
import com.example.demo.domain.order.service.request.PaymentRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class OrderInfoRegisterForm {



    // Payment
    private final PaymentRequest paymentRequest; // 결제 정보

    private List<OrderItemRegisterRequest> orderItemRegisterRequestList;

}