package com.mycompany.proyecto_tombola;

import java.util.ArrayList;

public abstract class Tombola {
    protected ArrayList<Integer> bolas;
    protected ArrayList<Integer> historial;

    public Tombola() {
        this.bolas = new ArrayList<>();
        this.historial = new ArrayList<>();
    }

    // Métodos comunes que las subclases pueden usar
    public void agregarAlHistorial(int bola) {
        historial.add(bola);
    }

    // Métodos abstractos para implementar en subclases
    public abstract int sacarBola();
    public abstract void crearBolas();
    public abstract void mostrarHistorial();
}