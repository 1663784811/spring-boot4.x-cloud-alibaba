package com.cyyaw.admin.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "admin-order")
public interface OrderClient {

    @GetMapping("/order/myOrder")
    String myOrder();
}