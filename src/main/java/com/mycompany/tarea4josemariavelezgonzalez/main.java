/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea4josemariavelezgonzalez;

/**
 *
 * @author herma
 */
public class main {
    public static void main(String[] args) {
            Animal perro = new Animal("Luna", 10.2, "Pug");
            Animal gato = new Animal("Estrella", 5.3, "Azul ruso");
            Animal conejo = new Animal("Goku", 55.6, "mini lop");
            
            System.out.println(perro);
            System.out.println(gato);
            System.out.println(conejo);
    }
}
