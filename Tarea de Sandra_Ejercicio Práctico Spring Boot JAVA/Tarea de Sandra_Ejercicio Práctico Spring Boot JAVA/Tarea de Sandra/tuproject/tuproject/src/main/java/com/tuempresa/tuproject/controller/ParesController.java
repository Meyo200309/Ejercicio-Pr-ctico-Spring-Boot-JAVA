/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuempresa.tuproject.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/proyecto")
public class ParesController {
    
    @PostMapping("/pares")
    public Map<String, List<Integer>> getParesImpares(@RequestBody List<Integer> numeros) {
        List<Integer> pares = numeros.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        List<Integer> impares = numeros.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        Map<String, List<Integer>> resultado = new HashMap<>();
        resultado.put("pares", pares);
        resultado.put("impares", impares);
        return resultado;
    }
}
