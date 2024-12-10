/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuempresa.tuproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.List;

import com.tuempresa.tuproject.model.Persona;

@RestController
@RequestMapping("/proyecto")
public class ArchivoController {

    @PostMapping("/crearArchivo")
    public ResponseEntity<String> crearArchivo(@RequestBody List<Persona> personas) throws IOException {
        Path path = Paths.get("personas.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            for (Persona persona : personas) {
                writer.write(persona.toString() + "\n");
            }
        }
        return ResponseEntity.ok("Archivo creado");
    }
}

