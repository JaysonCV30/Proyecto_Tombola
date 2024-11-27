package com.mycompany.proyecto_tombola;


public interface JuegoBingo {
    // Configura el patrón a jugar en el Bingo
    void configurarPatron();
    
    // Extrae una bola de la tómbola
    int sacarBola();
    
    // Verifica si una carta cumple con el patrón de Bingo 
    // usando las bolas extraídas
    boolean verificarCarta(CartaBingo carta);
    
    // Muestra en consola el historial de bolas extraídas
    void mostrarHistorial();
}