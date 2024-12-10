/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuempresa.tuproject.model;

public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String correo;

    @Override
    public String toString() {
        return nombre + "|" + apellidoPaterno + "|" + apellidoMaterno + "|" + edad + "|" + correo;
    }

    // Getters y Setters
}
