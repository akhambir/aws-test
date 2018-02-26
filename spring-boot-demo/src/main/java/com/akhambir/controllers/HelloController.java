package com.akhambir.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public Hello hello(HttpServletRequest req) {
        Hello hello = new Hello();
        hello.userName = req.getRemoteUser();
        hello.msg = "Hello from Spring Boot";
        return hello;
    }

    class Hello {
        public String userName;
        public String msg;
    }
}
