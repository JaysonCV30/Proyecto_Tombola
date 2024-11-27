package com.mycompany.proyecto_tombola;


public interface JuegoBingo {
    void configurarPatron();
    int sacarBola();
    boolean verificarCarta(CartaBingo carta);
    void mostrarHistorial();
}