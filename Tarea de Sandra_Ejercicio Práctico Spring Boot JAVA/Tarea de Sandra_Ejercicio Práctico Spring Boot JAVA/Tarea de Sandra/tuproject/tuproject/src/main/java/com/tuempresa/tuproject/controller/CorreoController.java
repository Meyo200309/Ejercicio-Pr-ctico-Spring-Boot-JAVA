/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuempresa.tuproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.regex.Pattern;

@Controller
@RequestMapping("/proyecto")
public class CorreoController {
    
    @GetMapping("/validacorreo")
    public String getCorreoPage(Model model) {
        model.addAttribute("correo", new Correo());
        return "validacorreo";
    }
    
    @PostMapping("/validacorreo")
    public String validarCorreo(@ModelAttribute Correo correo, Model model) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        boolean isValid = Pattern.matches(regex, correo.getCorreo());
                model.addAttribute("resultado", isValid ? "Correo válido" : "Correo inválido");
                return "validacorreo";
            }
        }
        
        class Correo {
            public CharSequence getCorreo() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'getCorreo'");
            }
}
