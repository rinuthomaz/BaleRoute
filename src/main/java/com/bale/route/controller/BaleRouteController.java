package com.bale.route.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BaleRouteController {
    
    @RequestMapping("/welcome")
    public String index() {
        return "Ah! Its loading...";
    }
    
}
