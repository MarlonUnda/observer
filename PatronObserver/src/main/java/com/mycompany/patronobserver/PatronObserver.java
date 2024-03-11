/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronobserver;

/**
 *
 * @Marlon
 */
public class PatronObserver {

    public static void main(String[] args) {
        SujetoObservable sujeto = new SujetoObservable();

        // Crear los observadores
        ObservadorUsuario usuario1 = new ObservadorUsuario("Usuario1");
        ObservadorUsuario usuario2 = new ObservadorUsuario("Usuario2");

        // Registrar observadores en el sujeto
        sujeto.agregarObservador(usuario1);
       sujeto.agregarObservador(usuario2);

        // Publicar un nuevo artículo
        sujeto.publicarNuevoArticulo("Sobre el Patron Observer en Java netbenss");

        // Usuario1 deja de seguir el blog
        sujeto.eliminarObservador(usuario1);

        //sujeto Publicar otro artículo
        sujeto.publicarNuevoArticulo("Patrones de diseño en Programacion orientada a Objetos ");
        
    }
}
