package com.cyyaw.admin.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/order")
@RestController
public class OrderController {

    @GetMapping("/myOrder")
    public String myOrder(){

        return "myOrder";
    }

}
