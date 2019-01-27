package com.hepexta.springmicrocervices.configuration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    public String toPlainString;

    @RequestMapping("/")
    public String getConfigs() {
        System.out.println(toPlainString);
        return toPlainString;
    }
}
