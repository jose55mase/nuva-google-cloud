package com.googlecloud.nuva.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nuvaController {

    @RequestMapping("/")
    String hellow()   {
        return "¡Hola, desarrollador de Google\n" +
                "Cloud! mensaje de Java.";
    }
}
