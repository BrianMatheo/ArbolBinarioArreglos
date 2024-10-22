/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javalovers.arbolbinarioordenararreglos;

import javax.swing.JOptionPane;

public class ArbolBinario{
    Nodo raiz;

     
    public ArbolBinario() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }

        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }

        return actual;
    }

    public void recorrerInOrden() {
        recorrerInOrdenRecursivo(raiz);
    }

    private void recorrerInOrdenRecursivo(Nodo nodo) {
        
        if (nodo != null) {
            recorrerInOrdenRecursivo(nodo.izquierdo);
            JOptionPane.showMessageDialog(null, nodo.valor);
            recorrerInOrdenRecursivo(nodo.derecho);
        }
    }
}
        
