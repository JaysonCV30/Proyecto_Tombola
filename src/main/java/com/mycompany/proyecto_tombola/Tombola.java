package com.mycompany.proyecto_tombola;

import java.util.ArrayList;

public abstract class Tombola {
    protected ArrayList<Integer> bolas;
    protected ArrayList<Integer> historial;

    public Tombola() {
        this.bolas = new ArrayList<>();
        this.historial = new ArrayList<>();
    }

    // Agrega una bola al historial de bolas extraídas.
    public void agregarAlHistorial(int bola) {
        historial.add(bola);
    }

    // Métodos abstractos para implementar en subclases
    // Extrae una bola de la lista
    public abstract int sacarBola();
    
    // Genera las bolas según las reglas del juego
    public abstract void crearBolas();
    
    // Muestra el historial de bolas extraídas
    public abstract void mostrarHistorial();
}