package com.mycompany.proyecto_tombola;

import java.util.ArrayList;
import java.util.Collections;

public class Bingo extends Tombola implements JuegoBingo{
    private ArrayList<CartaBingo> cards;
    private int tipoPatron;

    public Bingo() {
        super();
        cards = new ArrayList<>();
        inicializarCartas();
    }

    // Crea 50 instancias de la clase CartaBingo y las agrega a la lista cards
    public void inicializarCartas() {
        for (int i = 0; i < 50; i++) { 
            cards.add(new CartaBingo());
        }
    }
    
    // Retorna la lista de cartas del juego
    public ArrayList<CartaBingo> getCards() {
        return cards;
    }
    
    // Establece el patrón seleccionado por el jugador para el juego
    public void setTipoPatron(int tipoPatron) {
        this.tipoPatron = tipoPatron;
    }
    
    // Muestra un mensaje para que el jugador elija un patrón y genera 
    // las bolas necesarias según el patrón seleccionado
    public void configurarPatron() {
        System.out.println("Elija un patron:");
        crearBolas();
    }
    
    // Genera y mezcla las bolas según el patrón de Bingo seleccionado. 
    // Los rangos de números varían dependiendo del patrón elegido
    public void crearBolas() {
        bolas.clear(); // Limpiar la lista de bolas previamente generadas

        switch (tipoPatron) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: // Verticales B, I, N, G, O
                int rangoInicio = (tipoPatron - 1) * 15 + 1;
                int rangoFin = rangoInicio + 14;
                for (int i = rangoInicio; i <= rangoFin; i++) {
                    bolas.add(i);
                }
                break;

            case 7:
            case 8:
            case 9:
            case 10:
            case 11: // Horizontales
            case 6:
            case 12: // Diagonales
            case 37: // Diamond
                for (int i = 1; i <= 75; i++) {
                    bolas.add(i);
                }
                break;

            case 13:
            case 14:
            case 15: // 6-Pack en B e I
                for (int i = 1; i <= 30; i++) {
                    bolas.add(i);
                }
                break;

            case 16:
            case 17:
            case 18: // 6-Pack en I y N
                for (int i = 16; i <= 45; i++) { // I y N
                    bolas.add(i);
                }
                break;

            case 19:
            case 20:
            case 21: // 6-Pack en N y G
                for (int i = 31; i <= 60; i++) { // N y G
                    bolas.add(i);
                }
                break;

            case 22:
            case 23:
            case 24: // 6-Pack en G y O
                for (int i = 46; i <= 75; i++) {
                    bolas.add(i);
                }
                break;

            case 25:
            case 28:
            case 31:
            case 34: // 6-Pack en B, I y O
                for (int i = 1; i <= 45; i++) {
                    bolas.add(i);
                }
                break;

            case 26:
            case 29:
            case 32:
            case 35: // 6-Pack en I, N y G
            case 38: // Small Center Box
                for (int i = 16; i <= 60; i++) {
                    bolas.add(i);
                }
                break;

            case 27:
            case 30:
            case 33:
            case 36: // 6-Pack en N, G y O
                for (int i = 31; i <= 75; i++) {
                    bolas.add(i);
                }
                break;
        }

        Collections.shuffle(bolas);  // Mezclar las bolas para que salgan en orden aleatorio
    }
    
    // Extrae la primera bola disponible de la lista bolas, la agrega al historial y la retorna. 
    // Si no hay bolas disponibles, lanza una excepción
    public int sacarBola() {
        if (bolas.isEmpty()) {
            throw new IllegalStateException("No quedan bolas en la tómbola.");
        }
        int bola = bolas.remove(0);
        agregarAlHistorial(bola); 
        return bola;
    }
    
    // Muestra en consola las bolas extraídas, separadas por las letras correspondientes 
    // de Bingo (B, I, N, G, O).
    public void mostrarHistorial() {
        // Crear listas separadas para cada letra
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> i = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();
        ArrayList<Integer> g = new ArrayList<>();
        ArrayList<Integer> o = new ArrayList<>();

        for (int numero : historial) {
            if (numero >= 1 && numero <= 15) b.add(numero);
            else if (numero >= 16 && numero <= 30) i.add(numero);
            else if (numero >= 31 && numero <= 45) n.add(numero);
            else if (numero >= 46 && numero <= 60) g.add(numero);
            else if (numero >= 61 && numero <= 75) o.add(numero);
        }

        System.out.println("B: " + b);
        System.out.println("I: " + i);
        System.out.println("N: " + n);
        System.out.println("G: " + g);
        System.out.println("O: " + o);
    }
    
    // Verifica si una carta cumple con el patrón de Bingo utilizando el historial de bolas extraídas
    public boolean verificarCarta(CartaBingo carta) {
        return carta.verificar(historial, tipoPatron);
    }
    
    // Retorna la lista de bolas extraídas.
    public ArrayList<Integer> getHistorial(){
        return historial;
    }
}