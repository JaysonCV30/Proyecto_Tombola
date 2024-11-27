package com.mycompany.proyecto_tombola;

import javax.swing.JOptionPane;

public class JuegoLogico {

    private Tombola_Grafica tombolaGrafica;
    private Bingo juego;

    public void iniciarJuego() {
        System.out.println("¡Bienvenido al Bingo!");

        juego = new Bingo();
        tombolaGrafica = new Tombola_Grafica();

        // Configura el patron a través de la interfaz gráfica
        int tipoPatron = mostrarDialogoDePatron();
        juego.setTipoPatron(tipoPatron);
        tombolaGrafica.actualizarImagenPatron(tipoPatron);
        juego.configurarPatron();

        boolean ganadorEncontrado = false;
        System.out.println("\n¡Comenzando el juego!");
        tombolaGrafica.setVisible(true);

        while (!ganadorEncontrado) {
            // Esperar a que se presione el botón
            while (!tombolaGrafica.isBotonPresionado()) {
                try {
                    Thread.sleep(100); // Esperar un poco para evitar un bucle ocupado
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Sacar bola
            int bola = juego.sacarBola();
            System.out.println("Se ha sacado la bola: " + bola);
            tombolaGrafica.actualizarBolaActual(bola);
            tombolaGrafica.actualizarBolasAnteriores(juego.getHistorial());
            tombolaGrafica.pintarNumero(bola);
            if (juego.getHistorial().size() > 1) {
                int ultimaBola = juego.getHistorial().size() - 2;
                tombolaGrafica.actualizarBolaAnterior(juego.getHistorial().get(ultimaBola));
            }
            tombolaGrafica.resetBotonPresionado();

            // Mostrar historial
            juego.mostrarHistorial();

            // Verificar ganador
            for (int i = 0; i < juego.getCards().size(); i++) {
                boolean esGanadora = juego.verificarCarta(juego.getCards().get(i));
                javax.swing.SwingUtilities.invokeLater(() -> {
                    if (esGanadora) {
                        int opcion = JOptionPane.showOptionDialog(
                                tombolaGrafica,
                                "¡Alguien dijo bingo! ¿Quieres verificar la carta?",
                                "Verificar Bingo",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                new Object[]{"Verificar Carta", "Cancelar"},
                                "Verificar Carta"
                        );

                        if (opcion == JOptionPane.YES_OPTION) {
                            // Mostrar resultado de la verificación
                            if (esGanadora) {
                                JOptionPane.showMessageDialog(
                                        tombolaGrafica,
                                        "¡Si es carta ganadora!",
                                        "Ganador",
                                        JOptionPane.INFORMATION_MESSAGE
                                );
                            } else {
                                JOptionPane.showMessageDialog(
                                        tombolaGrafica,
                                        "No es una carta ganadora.",
                                        "Error",
                                        JOptionPane.ERROR_MESSAGE
                                );
                            }
                        }
                    }
                });

                if (juego.verificarCarta(juego.getCards().get(i))) {
                    ganadorEncontrado = true;
                    break;
                }
            }

            if (!ganadorEncontrado) {
                System.out.println("No hay ganadores todavía. Continúa el juego...\n");
            }
        }
        System.out.println("\n¡Fin del juego! Gracias por jugar.");
    }

    private int mostrarDialogoDePatron() {
        // Crear el diálogo con las imágenes
        BingoSeleccionDePatron mostrarPatronDialog = new BingoSeleccionDePatron();
        return mostrarPatronDialog.mostrarDialogo();  // Retorna el número de patrón seleccionado
    }
}