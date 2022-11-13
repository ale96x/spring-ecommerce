package com.curso.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/administrador")
public class AdminstradorController {

    @GetMapping("")          //Con eso indicamos que si ingresa a localhost:8080/administrador o localhost:8080/administrador/
    public String home(){      //direcciona a home.html
        return "administrador/home";
    }
}
