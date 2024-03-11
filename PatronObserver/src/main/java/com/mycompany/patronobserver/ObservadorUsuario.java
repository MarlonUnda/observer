/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronobserver;

/**
 *
 * @Marlon
 */
 class ObservadorUsuario implements Observador{
     
     private String nombreUsuario;

    public ObservadorUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public void actualizar(String nuevoArticulo) {
       System.out.println("Hola " + nombreUsuario + "! Se ha publicado un nuevo artículo: " + nuevoArticulo);
    }
    
}
