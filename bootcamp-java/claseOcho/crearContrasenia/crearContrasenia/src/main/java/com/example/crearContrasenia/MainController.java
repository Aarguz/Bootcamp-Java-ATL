package com.example.crearContrasenia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/create-password")
    public String crearContrasenia() {
        int parteNumerica = (int) (Math.random() * 10000);

        String parteLetra = "hwhe";

        return parteLetra + parteNumerica;
    }
}
