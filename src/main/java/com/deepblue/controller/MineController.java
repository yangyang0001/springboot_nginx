package com.deepblue.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class MineController {

    Logger logger = LoggerFactory.getLogger(MineController.class);

    @RequestMapping("sayHello")
    public String sayHello(String username) {

        logger.info("say hello method invoke, username is " + username);

        return "Hello " + username;

    }


}
