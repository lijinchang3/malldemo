package com.d2c.product.business.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigCtrl {

    @Value("${server.profile}")
    private String profile;

    @GetMapping("/profile")
    public String profile() {
        return this.profile;
    }

}
