package com.mycompany.proyecto_tombola;

import javax.swing.*;
import java.awt.*;

public class BingoSeleccionDePatron {
    
    // Muestra un cuadro de diálogo con imágenes y nombres de los patrones disponibles para 
    // que el jugador seleccione uno. Retorna el número del patrón seleccionado o -1 si se cancela
    public int mostrarDialogo() {
        // Lista de nombres de patrones
        String[] patrones = {
            "Patrón 1", "Patrón 2", "Patrón 3", "Patrón 4", "Patrón 5", "Patrón 6", "Patrón 7", "Patrón 8", "Patrón 9", "Patrón 10", "Patrón 11", 
            "Patrón 12","Patrón 13", "Patrón 14", "Patrón 15", "Patrón 16", "Patrón 17", "Patrón 18", "Patrón 19", "Patrón 20", "Patrón 21", "Patrón 22", 
            "Patrón 23", "Patrón 24", "Patrón 25", "Patrón 26", "Patrón 27", "Patrón 28", "Patrón 29", "Patrón 30","Patrón 31", "Patrón 32",
            "Patrón 33", "Patrón 34", "Patrón 35", "Patrón 36", "Patrón 37", "Patrón 38"
        };

        // Lista de imágenes correspondientes a cada patrón
        ImageIcon[] patronesImages = new ImageIcon[38];
        for (int i = 0; i < 38; i++) {
            patronesImages[i] = new ImageIcon("C:\\Users\\Jayson\\Desktop\\UABC\\Semestre 2024-2\\Programación Orientada a Objetos\\Laboratorio\\Codigo_Practicas\\Proyecto_Tombola\\src\\main\\java\\imagenes\\patron_" + (i + 1) + ".png");
        }

        // Crear el panel que contendrá las imágenes
        JPanel panel = new JPanel(new GridLayout(7, 6)); // 7 filas, 6 columnas
        ButtonGroup group = new ButtonGroup();

        // Añadir las imágenes y botones al panel
        for (int i = 0; i < patronesImages.length; i++) {
            JPanel optionPanel = new JPanel(new BorderLayout());
            JLabel label = new JLabel(patronesImages[i]); // Mostrar la imagen del patrón
            JRadioButton radioButton = new JRadioButton(patrones[i]);
            radioButton.setActionCommand(String.valueOf(i + 1)); // El número del patrón asociado

            // Añadir el radio button al grupo para que solo uno pueda ser seleccionado
            group.add(radioButton);

            // Añadir el componente con la imagen y el botón al panel
            optionPanel.add(label, BorderLayout.CENTER);
            optionPanel.add(radioButton, BorderLayout.SOUTH);
            panel.add(optionPanel);
        }

        // Mostrar el diálogo con el panel de selección
        int result = JOptionPane.showConfirmDialog(
                null,
                panel,
                "Seleccione un patrón de Bingo",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        // Manejar la selección del usuario
        if (result == JOptionPane.OK_OPTION) {
            ButtonModel selectedModel = group.getSelection();
            if (selectedModel != null) {
                int selectedPatron = Integer.parseInt(selectedModel.getActionCommand()); // Obtener el patrón seleccionado
                System.out.println("Seleccionaste el patrón: " + selectedPatron);
                return selectedPatron;
            } else {
                System.out.println("No seleccionaste ninguna opción.");
                return -1;
            }
        } else {
            System.out.println("El usuario canceló la selección.");
            return -1;
        }
    }
}