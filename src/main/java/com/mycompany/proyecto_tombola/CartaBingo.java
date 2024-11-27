package com.mycompany.proyecto_tombola;

import java.util.ArrayList;
import java.util.Random;

public class CartaBingo {

    private int[][] carta;

    // Constructor que inicializa una carta de Bingo de 5x5 y genera los 
    // números aleatorios para cada celda
    public CartaBingo() {
        this.carta = new int[5][5];
        generateCard();
    }

    // Constructor que permite inicializar una carta usando un 
    // arreglo de enteros especificado
    public CartaBingo(int[][] carta) {
        this.carta = carta;
    }

    // Genera los números aleatorios para la carta de Bingo asegurando que 
    // cada columna tenga valores únicos dentro de su rango permitido. El 
    // centro (posición 2,2) se marca como un espacio "Free"
    public void generateCard() {
        Random random = new Random();
        for (int columna = 0; columna < 5; columna++) {
            int start = (columna * 15) + 1;
            int end = start + 14;
            for (int fila = 0; fila < 5; fila++) {
                if (columna == 2 && fila == 2) { // Espacio central vacío
                    carta[fila][columna] = 0;
                } else {
                    int numero;
                    do {
                        numero = random.nextInt(end - start + 1) + start;
                    } while (isNumberInColumn(columna, numero));
                    carta[fila][columna] = numero;
                }
            }
        }
    }

    // Verifica si un número ya existe en una columna específica de la carta
    public boolean isNumberInColumn(int columna, int numero) {
        for (int fila = 0; fila < 5; fila++) {
            if (carta[fila][columna] == numero) {
                return true;
            }
        }
        return false;
    }

    // Imprime la carta en consola, con formato adecuado, incluyendo las letras 
    // B, I, N, G, O y mostrando "Free" en la posición central.
    public void printCard() {
        // Imprimir la cabecera con las letras B I N G O
        System.out.printf("%-5s%-5s%-5s%-5s%-5s%n", "B", "I", "N", "G", "O");
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                if (carta[fila][columna] == 0) {
                    System.out.printf("%-5s", "Free");
                } else {
                    System.out.printf("%-5s", carta[fila][columna]);
                }
            }
            System.out.println();
        }
    }

    // Comprueba si la carta cumple con el patrón de Bingo especificado 
    // usando las bolas extraídas en el historial
    public boolean verificar(ArrayList<Integer> historial, int patron) {
        switch (patron) {
            case 1: // Vertical 1
                return verificarColumna(historial, 0);
            case 2: // Vertical 2
                return verificarColumna(historial, 1);
            case 3: // Vertical 3
                return verificarColumna(historial, 2);
            case 4: // Vertical 4
                return verificarColumna(historial, 3);
            case 5: // Vertical 5
                return verificarColumna(historial, 4);
            case 6: // Diagonal descendente
                return verificarDiagonalPrincipal(historial);
            case 7: // Horizontal 1
                return verificarFila(historial, 0);
            case 8: // Horizontal 2
                return verificarFila(historial, 1);
            case 9: // Horizontal 3
                return verificarFila(historial, 2);
            case 10: // Horizontal 4
                return verificarFila(historial, 3);
            case 11: // Horizontal 5
                return verificarFila(historial, 4);
            case 12: // Diagonal ascendente
                return verificarDiagonalSecundaria(historial);
            case 13: // 6-Pack BI-fila 1
                return verificarBloque(historial, 0, 2, 0, 2);
            case 14: // 6-Pack BI-fila 2
                return verificarBloque(historial, 1, 4, 0, 2);
            case 15: // 6-Pack BI-fila 3
                return verificarBloque(historial, 2, 5, 0, 2);
            case 16: // 6-Pack IN-fila 1
                return verificarBloque(historial, 0, 3, 1, 3); 
            case 17: // 6-Pack IN-fila 2
                return verificarBloque(historial, 1, 4, 1, 3);
            case 18: // 6-Pack IN-fila 3
                return verificarBloque(historial, 2, 5, 1, 3);
            case 19: // 6-Pack NG-fila 1
                return verificarBloque(historial, 0, 3, 2, 4);
            case 20: // 6-Pack NG-fila 2
                return verificarBloque(historial, 1, 4, 2, 4);
            case 21: // 6-Pack NG-fila 3
                return verificarBloque(historial, 2, 5, 2, 4);
            case 22: // 6-Pack GO-fila 1
                return verificarBloque(historial, 0, 3, 3, 5);
            case 23: // 6-Pack GO-fila 2
                return verificarBloque(historial, 1, 4, 3, 5);
            case 24: // 6-Pack GO-fila 3
                return verificarBloque(historial, 2, 5, 3, 5);
            case 25: // 6-Pack BIN-fila 1
                return verificarBloque(historial, 0, 2, 0, 3);
            case 26: // 6-Pack ING-fila 1
                return verificarBloque(historial, 0, 2, 1, 4);
            case 27: // 6-Pack NGO-fila 1
                return verificarBloque(historial, 0, 2, 2, 5);
            case 28: // 6-Pack BIN-fila 2
                return verificarBloque(historial, 1, 3, 0, 3);
            case 29: // 6-Pack ING-fila 2
                return verificarBloque(historial, 1, 3, 1, 4);
            case 30: // 6-Pack NGO-fila 2
                return verificarBloque(historial, 1, 3, 2, 5);
            case 31: // 6-Pack BIN-fila 3
                return verificarBloque(historial, 2, 4, 0, 3);
            case 32: // 6-Pack ING-fila 3
                return verificarBloque(historial, 2, 4, 1, 4);
            case 33: // 6-Pack NGO-fila 3
                return verificarBloque(historial, 2, 4, 2, 5);
            case 34: // 6-Pack BIN-fila 4
                return verificarBloque(historial, 3, 5, 0, 3);
            case 35: // 6-Pack ING-fila 4
                return verificarBloque(historial, 3, 5, 1, 4);
            case 36: // 6-Pack NGO-fila 4
                return verificarBloque(historial, 3, 5, 2, 5);
            case 37: // 8 Diamond
                return verificar8Diamond(historial);
            case 38: // 8 Small Center Box
                return verificarBloque(historial, 1, 4, 1, 4);
            default:
                return false;
        }
    }

    // Verifica si una columna completa está marcada según las bolas extraídas
    public boolean verificarColumna(ArrayList<Integer> historial, int columna) {
        for (int fila = 0; fila < 5; fila++) {
            // Ignorar el espacio "Free" en la posición central
            if (carta[fila][columna] == 0) {
                    continue;
                }
            if (!historial.contains(carta[fila][columna])) {
                return false;
            }
        }
        return true;
    }

    // Verifica si una fila completa está marcada según las bolas extraídas
    public boolean verificarFila(ArrayList<Integer> historial, int fila) {
        for (int columna = 0; columna < 5; columna++) {
            // Ignorar el espacio "Free" en la posición central
            if (carta[fila][columna] == 0) {
                    continue;
                }
            if (!historial.contains(carta[fila][columna])) {
                return false;
            }
        }
        return true;
    }

    // Verifica si la diagonal descendente está completa según las bolas extraídas
    public boolean verificarDiagonalPrincipal(ArrayList<Integer> historial) {
        for (int i = 0; i < 5; i++) {
            // Ignorar el espacio "Free" en la posición central
            if (i == 2 && carta[i][i] == 0) {
                continue;
            }
            if (!historial.contains(carta[i][i])) {
                return false;
            }
        }
        return true;
    }

    // Verifica si la diagonal ascendente está completa según las bolas extraídas
    public boolean verificarDiagonalSecundaria(ArrayList<Integer> historial) {
        for (int i = 0; i < 5; i++) {
            // Ignorar el espacio "Free" en la posición central
            if (i == 2 && carta[i][i] == 0) {
                continue;
            }
            if (!historial.contains(carta[i][4 - i])) {
                return false;
            }
        }
        return true;
    }

    // Comprueba si un bloque de celdas específicas está marcado, ignorando el espacio "Free"
    public boolean verificarBloque(ArrayList<Integer> historial, int filaInicio, int filaFin, int colInicio, int colFin) {
        for (int fila = filaInicio; fila < filaFin; fila++) {
            for (int columna = colInicio; columna < colFin; columna++) {
                if (carta[fila][columna] == 0) {
                    // Ignorar el espacio "Free"
                    continue;
                }
                if (!historial.contains(carta[fila][columna])) {
                    return false;
                }
            }
        }
        return true;
    }

    // Verifica si el patrón de diamante está marcado según las bolas extraídas
    public boolean verificar8Diamond(ArrayList<Integer> historial) {
        int[][] posiciones = {
            {0, 2}, {1, 1}, {1, 3}, {2, 0}, {2, 4}, {3, 1}, {3, 3}, {4, 2}
        };
        for (int[] pos : posiciones) {
            if (!historial.contains(carta[pos[0]][pos[1]])) {
                return false;
            }
        }
        return true;
    }
}