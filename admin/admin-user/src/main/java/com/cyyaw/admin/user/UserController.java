package com.cyyaw.admin.user;

import com.cyyaw.admin.user.client.OrderClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    private final OrderClient orderClient;

    public UserController(OrderClient orderClient) {
        this.orderClient = orderClient;
    }

    @GetMapping("/getUserInfo")
    public String getUserInfo(){
        String orderInfo = orderClient.myOrder();
        return "getUserInfo -> " + orderInfo;
    }

}
