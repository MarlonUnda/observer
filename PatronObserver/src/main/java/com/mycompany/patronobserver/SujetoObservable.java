/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronobserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Marlon
 */
public class SujetoObservable {
   private List<Observador> observadores = new ArrayList<>();
   private String nuevoArticulo;
    
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }
    
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }
    
     public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(nuevoArticulo);
        }
    }
     
    public void publicarNuevoArticulo(String articulo) {
        this.nuevoArticulo = articulo;
        notificarObservadores();
    }
}
