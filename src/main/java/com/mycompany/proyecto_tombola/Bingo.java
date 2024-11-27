package com.mycompany.proyecto_tombola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bingo extends Tombola implements JuegoBingo{
    private ArrayList<CartaBingo> cards;
    private int tipoPatron;

    public Bingo() {
        super();
        cards = new ArrayList<>();
        inicializarCartas();
    }

    private void inicializarCartas() {
        for (int i = 0; i < 5; i++) { // Por defecto, se crean 5 cartas
            cards.add(new CartaBingo());
        }
    }
    
    public ArrayList<CartaBingo> getCards() {
        return cards;
    }
    
    public void setTipoPatron(int tipoPatron) {
        this.tipoPatron = tipoPatron;
    }
    
    public void configurarPatron() {
        System.out.println("Elija un patron:");
        crearBolas();
    }
    
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
    
    public int sacarBola() {
        if (bolas.isEmpty()) {
            throw new IllegalStateException("No quedan bolas en la tómbola.");
        }
        int bola = bolas.remove(0);
        agregarAlHistorial(bola); // Usar método de Tombola
        return bola;
    }
    
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
    
    public boolean verificarCarta(CartaBingo carta) {
        return carta.verificar(historial, tipoPatron);
    }
    
    public ArrayList<Integer> getHistorial(){
        return historial;
    }
}
