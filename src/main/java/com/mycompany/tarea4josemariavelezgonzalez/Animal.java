/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea4josemariavelezgonzalez;

/**
 *
 * @author José
 */
public class Animal {
    
    private String nombre;
    private double tamaño;
    private String raza;

    public Animal(String nombre, double tamaño, String raza) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.raza = raza;
    }
    
    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", tama\u00f1o=" + tamaño + ", raza=" + raza + '}';
    }
}
