package com.halen.springcloud.controller;

import com.halen.springcloud.entities.CommonResult;
import com.halen.springcloud.entities.Payment;
import com.halen.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created By Halen 2020/5/7 16:13
 */
@RestController
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        // openFeign - Ribbon 客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}
