package com.javalovers.arbolbinarioordenararreglos;

import java.util.Random;

public class ArbolBinarioOrdenarArreglos {

    public static void main(String[] args) {
        
        
     
        
class Nodo {
    int valor;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = null;
        derecho = null;
    }
}

class ArbolBinario {
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
            System.out.print(nodo.valor + " ");
            recorrerInOrdenRecursivo(nodo.derecho);
        }
    }
}
        ArbolBinario arbol = new ArbolBinario();
        Random random = new Random();
        
        int arreglo[] = new int[5];
        for(int i = 0; i<arreglo.length;i++){
            arreglo[i] = random.nextInt(99)+1;
            arbol.insertar(arreglo[i]);
        }

        System.out.println("Recorrido en orden:");
        arbol.recorrerInOrden();
    }
}



