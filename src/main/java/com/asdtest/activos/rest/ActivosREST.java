package com.asdtest.activos.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ActivosREST {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello() {
        return "<p>Hello world</p>";
    }

}
