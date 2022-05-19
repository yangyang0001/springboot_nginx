package com.deepblue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class MineController {

    @RequestMapping("sayHello")
    public String sayHello(String username) {

        return "Hello " + username;

    }


}
