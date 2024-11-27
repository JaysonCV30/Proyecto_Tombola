package com.mycompany.proyecto_tombola;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Tombola_Grafica extends javax.swing.JFrame {

    private Bingo juego;
    private boolean botonPresionado;
    private HashMap<Integer, JLabel> etiquetasNumeros;
    
    public Tombola_Grafica() {
        this.juego = juego;
        this.botonPresionado = false;
        this.etiquetasNumeros = new HashMap<>();
        initComponents();
        inicializarEtiquetasNumeros();
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    // Relaciona cada número de Bingo con su respectivo componente gráfico (JLabel) en la interfaz
    private void inicializarEtiquetasNumeros() {
        // Relaciona cada número con su correspondiente JLabel
        etiquetasNumeros.put(1, uno);
        etiquetasNumeros.put(2, dos);
        etiquetasNumeros.put(3, tres);
        etiquetasNumeros.put(4, cuatro);
        etiquetasNumeros.put(5, cinco);
        etiquetasNumeros.put(6, seis);
        etiquetasNumeros.put(7, siete);
        etiquetasNumeros.put(8, ocho);
        etiquetasNumeros.put(9, nueve);
        etiquetasNumeros.put(10, diez);
        etiquetasNumeros.put(11, once);
        etiquetasNumeros.put(12, doce);
        etiquetasNumeros.put(13, trece);
        etiquetasNumeros.put(14, catorce);
        etiquetasNumeros.put(15, quince);
        etiquetasNumeros.put(16, dieciseis);
        etiquetasNumeros.put(17, diecisiete);
        etiquetasNumeros.put(18, dieciocho);
        etiquetasNumeros.put(19, diecinueve);
        etiquetasNumeros.put(20, veinte);
        etiquetasNumeros.put(21, veintiUno);
        etiquetasNumeros.put(22, veintiDos);
        etiquetasNumeros.put(23, veintiTres);
        etiquetasNumeros.put(24, veintiCuatro);
        etiquetasNumeros.put(25, veintiCinco);
        etiquetasNumeros.put(26, veintiSeis);
        etiquetasNumeros.put(27, veintiSiete);
        etiquetasNumeros.put(28, veintiOcho);
        etiquetasNumeros.put(29, veintiNueve);
        etiquetasNumeros.put(30, treinta);
        etiquetasNumeros.put(31, treintaUno);
        etiquetasNumeros.put(32, treintaDos);
        etiquetasNumeros.put(33, treintaTres);
        etiquetasNumeros.put(34, treintaCuatro);
        etiquetasNumeros.put(35, treintaCinco);
        etiquetasNumeros.put(36, treintaSeis);
        etiquetasNumeros.put(37, treintaSiete);
        etiquetasNumeros.put(38, treintaOcho);
        etiquetasNumeros.put(39, treintaNueve);
        etiquetasNumeros.put(40, cuarenta);
        etiquetasNumeros.put(41, cuarentaUno);
        etiquetasNumeros.put(42, cuarentaDos);
        etiquetasNumeros.put(43, cuarentaTres);
        etiquetasNumeros.put(44, cuarentaCuatro);
        etiquetasNumeros.put(45, cuarentaCinco);
        etiquetasNumeros.put(46, cuarentaSeis);
        etiquetasNumeros.put(47, cuarentaSiete);
        etiquetasNumeros.put(48, cuarentaOcho);
        etiquetasNumeros.put(49, cuarentaNueve);
        etiquetasNumeros.put(50, cincuenta);
        etiquetasNumeros.put(51, cincuentaUno);
        etiquetasNumeros.put(52, cincuentaDos);
        etiquetasNumeros.put(53, cincuentaTres);
        etiquetasNumeros.put(54, cincuentaCuatro);
        etiquetasNumeros.put(55, cincuentaCinco);
        etiquetasNumeros.put(56, cincuentaSeis);
        etiquetasNumeros.put(57, cincuentaSiete);
        etiquetasNumeros.put(58, cincuentaOcho);
        etiquetasNumeros.put(59, cincuentaNueve);
        etiquetasNumeros.put(60, sesenta);
        etiquetasNumeros.put(61, sesentaUno);
        etiquetasNumeros.put(62, sesentaDos);
        etiquetasNumeros.put(63, sesentaTres);
        etiquetasNumeros.put(64, sesentaCuatro);
        etiquetasNumeros.put(65, sesentaCinco);
        etiquetasNumeros.put(66, sesentaSeis);
        etiquetasNumeros.put(67, sesentaSiete);
        etiquetasNumeros.put(68, sesentaOcho);
        etiquetasNumeros.put(69, sesentaNueve);
        etiquetasNumeros.put(70, setenta);
        etiquetasNumeros.put(71, setentaUno);
        etiquetasNumeros.put(72, setentaDos);
        etiquetasNumeros.put(73, setentaTres);
        etiquetasNumeros.put(74, setentaCuatro);
        etiquetasNumeros.put(75, setentaCinco);
        
    }
    
    // Actualiza el panel de selección de patrón con la imagen correspondiente al patrón elegido
    public void actualizarImagenPatron(int patron) {
        // Construir la ruta de la imagen usando el número del patrón
        String imagePath = "C:\\Users\\Jayson\\Desktop\\UABC\\Semestre 2024-2\\Programación Orientada a Objetos\\Laboratorio\\Codigo_Practicas\\Proyecto_Tombola\\src\\main\\java\\imagenes\\patron_" + patron + ".png";
        ImageIcon patronImage = new ImageIcon(imagePath);
        Image scaledImage = patronImage.getImage().getScaledInstance(patronElegido.getWidth(), patronElegido.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        // Crear un JLabel con la imagen y agregarlo al panel patronElegido
        JLabel patronLabel = new JLabel(scaledIcon);
        patronElegido.removeAll();  // Limpiar el panel antes de agregar la nueva imagen
        patronElegido.add(patronLabel);  // Agregar el JLabel con la imagen
        patronElegido.revalidate(); // Actualizar el layout
        patronElegido.repaint();  // Redibujar el panel
    }
    
    // Verifica si el botón de sacar bola ha sido presionado
    public boolean isBotonPresionado(){
        botonSacarBola.addActionListener(e -> {
            botonPresionado = true; // Cambiar la bandera
        });
        return botonPresionado;
    }
    
    // Reinicia el estado del botón para permitir nuevas interacciones
    public void resetBotonPresionado(){
        botonPresionado = false;
    }
    
    // Muestra el número de la bola actual en el área correspondiente de la interfaz
    public void actualizarBolaActual(int bola){
        numeroActual.setText(Integer.toString(bola));
    }
    
    // Muestra el número de la bola anterior en el área correspondiente de la interfaz
    public void actualizarBolaAnterior(int bola){
        numeroAnterior.setText(Integer.toString(bola));
    }
    
    // Muestra los últimos cinco números extraídos en el panel de números anteriores
    public void actualizarBolasAnteriores(ArrayList <Integer> historial){
        numerosAnteriores.removeAll();
        
        //Determina las bolas que se pueden mostrar (5 o menos)
        int cantidad = Math.min(historial.size(),5);
        
        for (int i = historial.size() - cantidad; i < historial.size(); i++) {
            int bola = historial.get(i);
            
            JLabel etiquetaBola = new JLabel(Integer.toString(bola));
            etiquetaBola.setOpaque(true);
            etiquetaBola.setBackground(null);
            etiquetaBola.setForeground(new Color(0,204,204));
            etiquetaBola.setFont(new Font("Segoe UI", Font.PLAIN, 60));
            etiquetaBola.setHorizontalAlignment(JLabel.CENTER);
            
            numerosAnteriores.add(etiquetaBola);
        }
        numerosAnteriores.revalidate();
        numerosAnteriores.repaint();
    }
    
    // Cambia el color del texto del número extraído en la interfaz para destacarlo
    public void pintarNumero(int numero) {
        // Buscar el JLabel correspondiente al número
        JLabel etiqueta = etiquetasNumeros.get(numero);
        if (etiqueta != null) {
            etiqueta.setForeground(Color.YELLOW); // Cambiar el fondo
            etiqueta.setOpaque(true); // Asegurar que el fondo sea visible
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LetraB = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        LetraI = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        LetraN = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        LetraG = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        LetraO = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        LetraB1 = new javax.swing.JPanel();
        uno = new javax.swing.JLabel();
        LetraB2 = new javax.swing.JPanel();
        dos = new javax.swing.JLabel();
        LetraB3 = new javax.swing.JPanel();
        tres = new javax.swing.JLabel();
        LetraB4 = new javax.swing.JPanel();
        cuatro = new javax.swing.JLabel();
        LetraB6 = new javax.swing.JPanel();
        cinco = new javax.swing.JLabel();
        LetraB7 = new javax.swing.JPanel();
        seis = new javax.swing.JLabel();
        LetraB8 = new javax.swing.JPanel();
        siete = new javax.swing.JLabel();
        LetraB9 = new javax.swing.JPanel();
        ocho = new javax.swing.JLabel();
        LetraB10 = new javax.swing.JPanel();
        nueve = new javax.swing.JLabel();
        LetraB11 = new javax.swing.JPanel();
        diez = new javax.swing.JLabel();
        LetraB12 = new javax.swing.JPanel();
        once = new javax.swing.JLabel();
        LetraB13 = new javax.swing.JPanel();
        doce = new javax.swing.JLabel();
        LetraB15 = new javax.swing.JPanel();
        trece = new javax.swing.JLabel();
        LetraB16 = new javax.swing.JPanel();
        catorce = new javax.swing.JLabel();
        LetraB17 = new javax.swing.JPanel();
        quince = new javax.swing.JLabel();
        LetraB18 = new javax.swing.JPanel();
        dieciseis = new javax.swing.JLabel();
        LetraB19 = new javax.swing.JPanel();
        diecisiete = new javax.swing.JLabel();
        LetraB20 = new javax.swing.JPanel();
        dieciocho = new javax.swing.JLabel();
        LetraB21 = new javax.swing.JPanel();
        diecinueve = new javax.swing.JLabel();
        LetraB22 = new javax.swing.JPanel();
        veinte = new javax.swing.JLabel();
        LetraB23 = new javax.swing.JPanel();
        veintiUno = new javax.swing.JLabel();
        LetraB24 = new javax.swing.JPanel();
        veintiDos = new javax.swing.JLabel();
        LetraB25 = new javax.swing.JPanel();
        veintiTres = new javax.swing.JLabel();
        LetraB26 = new javax.swing.JPanel();
        veintiCuatro = new javax.swing.JLabel();
        LetraB27 = new javax.swing.JPanel();
        veintiCinco = new javax.swing.JLabel();
        LetraB28 = new javax.swing.JPanel();
        veintiSeis = new javax.swing.JLabel();
        LetraB29 = new javax.swing.JPanel();
        veintiSiete = new javax.swing.JLabel();
        LetraB30 = new javax.swing.JPanel();
        veintiOcho = new javax.swing.JLabel();
        LetraB31 = new javax.swing.JPanel();
        veintiNueve = new javax.swing.JLabel();
        LetraB32 = new javax.swing.JPanel();
        treinta = new javax.swing.JLabel();
        LetraB33 = new javax.swing.JPanel();
        treintaUno = new javax.swing.JLabel();
        LetraB34 = new javax.swing.JPanel();
        treintaDos = new javax.swing.JLabel();
        LetraB35 = new javax.swing.JPanel();
        treintaTres = new javax.swing.JLabel();
        LetraB36 = new javax.swing.JPanel();
        treintaCuatro = new javax.swing.JLabel();
        LetraB37 = new javax.swing.JPanel();
        treintaCinco = new javax.swing.JLabel();
        LetraB38 = new javax.swing.JPanel();
        treintaSeis = new javax.swing.JLabel();
        LetraB39 = new javax.swing.JPanel();
        treintaSiete = new javax.swing.JLabel();
        LetraB40 = new javax.swing.JPanel();
        treintaOcho = new javax.swing.JLabel();
        LetraB41 = new javax.swing.JPanel();
        treintaNueve = new javax.swing.JLabel();
        LetraB42 = new javax.swing.JPanel();
        cuarenta = new javax.swing.JLabel();
        LetraB43 = new javax.swing.JPanel();
        cuarentaUno = new javax.swing.JLabel();
        LetraB44 = new javax.swing.JPanel();
        cuarentaDos = new javax.swing.JLabel();
        LetraB45 = new javax.swing.JPanel();
        cuarentaTres = new javax.swing.JLabel();
        LetraB46 = new javax.swing.JPanel();
        cuarentaCuatro = new javax.swing.JLabel();
        LetraB47 = new javax.swing.JPanel();
        cuarentaCinco = new javax.swing.JLabel();
        LetraB48 = new javax.swing.JPanel();
        cuarentaSeis = new javax.swing.JLabel();
        LetraB49 = new javax.swing.JPanel();
        cuarentaSiete = new javax.swing.JLabel();
        LetraB50 = new javax.swing.JPanel();
        cuarentaOcho = new javax.swing.JLabel();
        LetraB51 = new javax.swing.JPanel();
        cuarentaNueve = new javax.swing.JLabel();
        LetraB52 = new javax.swing.JPanel();
        cincuenta = new javax.swing.JLabel();
        LetraB53 = new javax.swing.JPanel();
        cincuentaUno = new javax.swing.JLabel();
        LetraB54 = new javax.swing.JPanel();
        cincuentaDos = new javax.swing.JLabel();
        LetraB55 = new javax.swing.JPanel();
        cincuentaTres = new javax.swing.JLabel();
        LetraB56 = new javax.swing.JPanel();
        cincuentaCuatro = new javax.swing.JLabel();
        LetraB57 = new javax.swing.JPanel();
        cincuentaCinco = new javax.swing.JLabel();
        LetraB58 = new javax.swing.JPanel();
        cincuentaSeis = new javax.swing.JLabel();
        LetraB59 = new javax.swing.JPanel();
        cincuentaSiete = new javax.swing.JLabel();
        LetraB60 = new javax.swing.JPanel();
        cincuentaOcho = new javax.swing.JLabel();
        LetraB61 = new javax.swing.JPanel();
        cincuentaNueve = new javax.swing.JLabel();
        LetraB62 = new javax.swing.JPanel();
        sesenta = new javax.swing.JLabel();
        LetraB63 = new javax.swing.JPanel();
        sesentaUno = new javax.swing.JLabel();
        LetraB64 = new javax.swing.JPanel();
        sesentaDos = new javax.swing.JLabel();
        LetraB65 = new javax.swing.JPanel();
        sesentaTres = new javax.swing.JLabel();
        LetraB66 = new javax.swing.JPanel();
        sesentaCuatro = new javax.swing.JLabel();
        LetraB67 = new javax.swing.JPanel();
        sesentaCinco = new javax.swing.JLabel();
        LetraB68 = new javax.swing.JPanel();
        sesentaSeis = new javax.swing.JLabel();
        LetraB69 = new javax.swing.JPanel();
        sesentaSiete = new javax.swing.JLabel();
        LetraB70 = new javax.swing.JPanel();
        sesentaOcho = new javax.swing.JLabel();
        LetraB71 = new javax.swing.JPanel();
        sesentaNueve = new javax.swing.JLabel();
        LetraB72 = new javax.swing.JPanel();
        setenta = new javax.swing.JLabel();
        LetraB73 = new javax.swing.JPanel();
        setentaUno = new javax.swing.JLabel();
        LetraB74 = new javax.swing.JPanel();
        setentaDos = new javax.swing.JLabel();
        LetraB75 = new javax.swing.JPanel();
        setentaTres = new javax.swing.JLabel();
        LetraB76 = new javax.swing.JPanel();
        setentaCuatro = new javax.swing.JLabel();
        LetraB77 = new javax.swing.JPanel();
        setentaCinco = new javax.swing.JLabel();
        patronElegido = new javax.swing.JPanel();
        botonSacarBola = new javax.swing.JButton();
        numeroActual = new javax.swing.JLabel();
        numeroAnterior = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numerosAnteriores = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1510, 610));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Numero Actual");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Numero Anterior");

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 536));

        LetraB.setBackground(new java.awt.Color(0, 153, 255));
        LetraB.setPreferredSize(new java.awt.Dimension(70, 70));

        jLabel3.setBackground(new java.awt.Color(0, 0, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("B");
        jLabel3.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraBLayout = new javax.swing.GroupLayout(LetraB);
        LetraB.setLayout(LetraBLayout);
        LetraBLayout.setHorizontalGroup(
            LetraBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraBLayout.setVerticalGroup(
            LetraBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraI.setBackground(new java.awt.Color(255, 0, 0));
        LetraI.setPreferredSize(new java.awt.Dimension(70, 70));

        jLabel8.setBackground(new java.awt.Color(0, 0, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("I");
        jLabel8.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraILayout = new javax.swing.GroupLayout(LetraI);
        LetraI.setLayout(LetraILayout);
        LetraILayout.setHorizontalGroup(
            LetraILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraILayout.setVerticalGroup(
            LetraILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraN.setBackground(new java.awt.Color(0, 204, 51));
        LetraN.setPreferredSize(new java.awt.Dimension(70, 70));

        jLabel9.setBackground(new java.awt.Color(0, 0, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("N");
        jLabel9.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraNLayout = new javax.swing.GroupLayout(LetraN);
        LetraN.setLayout(LetraNLayout);
        LetraNLayout.setHorizontalGroup(
            LetraNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraNLayout.setVerticalGroup(
            LetraNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraG.setBackground(new java.awt.Color(255, 255, 51));
        LetraG.setPreferredSize(new java.awt.Dimension(70, 70));

        jLabel10.setBackground(new java.awt.Color(0, 0, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("G");
        jLabel10.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraGLayout = new javax.swing.GroupLayout(LetraG);
        LetraG.setLayout(LetraGLayout);
        LetraGLayout.setHorizontalGroup(
            LetraGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraGLayout.setVerticalGroup(
            LetraGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraO.setBackground(new java.awt.Color(204, 0, 204));
        LetraO.setPreferredSize(new java.awt.Dimension(70, 70));

        jLabel12.setBackground(new java.awt.Color(0, 0, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("O");
        jLabel12.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraOLayout = new javax.swing.GroupLayout(LetraO);
        LetraO.setLayout(LetraOLayout);
        LetraOLayout.setHorizontalGroup(
            LetraOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraOLayout.setVerticalGroup(
            LetraOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB1.setBackground(new java.awt.Color(204, 204, 204));
        LetraB1.setPreferredSize(new java.awt.Dimension(70, 70));

        uno.setBackground(new java.awt.Color(204, 204, 204));
        uno.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        uno.setForeground(new java.awt.Color(153, 153, 153));
        uno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uno.setText("1");
        uno.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB1Layout = new javax.swing.GroupLayout(LetraB1);
        LetraB1.setLayout(LetraB1Layout);
        LetraB1Layout.setHorizontalGroup(
            LetraB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uno, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB1Layout.setVerticalGroup(
            LetraB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB2.setBackground(new java.awt.Color(204, 204, 204));
        LetraB2.setPreferredSize(new java.awt.Dimension(70, 70));

        dos.setBackground(new java.awt.Color(204, 204, 204));
        dos.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        dos.setForeground(new java.awt.Color(153, 153, 153));
        dos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dos.setText("2");
        dos.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB2Layout = new javax.swing.GroupLayout(LetraB2);
        LetraB2.setLayout(LetraB2Layout);
        LetraB2Layout.setHorizontalGroup(
            LetraB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dos, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB2Layout.setVerticalGroup(
            LetraB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB3.setBackground(new java.awt.Color(204, 204, 204));
        LetraB3.setPreferredSize(new java.awt.Dimension(70, 70));

        tres.setBackground(new java.awt.Color(204, 204, 204));
        tres.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        tres.setForeground(new java.awt.Color(153, 153, 153));
        tres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tres.setText("3");
        tres.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB3Layout = new javax.swing.GroupLayout(LetraB3);
        LetraB3.setLayout(LetraB3Layout);
        LetraB3Layout.setHorizontalGroup(
            LetraB3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tres, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB3Layout.setVerticalGroup(
            LetraB3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB4.setBackground(new java.awt.Color(204, 204, 204));
        LetraB4.setPreferredSize(new java.awt.Dimension(70, 70));

        cuatro.setBackground(new java.awt.Color(204, 204, 204));
        cuatro.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cuatro.setForeground(new java.awt.Color(153, 153, 153));
        cuatro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuatro.setText("4");
        cuatro.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB4Layout = new javax.swing.GroupLayout(LetraB4);
        LetraB4.setLayout(LetraB4Layout);
        LetraB4Layout.setHorizontalGroup(
            LetraB4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB4Layout.setVerticalGroup(
            LetraB4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB6.setBackground(new java.awt.Color(204, 204, 204));
        LetraB6.setPreferredSize(new java.awt.Dimension(70, 70));

        cinco.setBackground(new java.awt.Color(204, 204, 204));
        cinco.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cinco.setForeground(new java.awt.Color(153, 153, 153));
        cinco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cinco.setText("5");
        cinco.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB6Layout = new javax.swing.GroupLayout(LetraB6);
        LetraB6.setLayout(LetraB6Layout);
        LetraB6Layout.setHorizontalGroup(
            LetraB6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cinco, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB6Layout.setVerticalGroup(
            LetraB6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB7.setBackground(new java.awt.Color(204, 204, 204));
        LetraB7.setPreferredSize(new java.awt.Dimension(70, 70));

        seis.setBackground(new java.awt.Color(204, 204, 204));
        seis.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        seis.setForeground(new java.awt.Color(153, 153, 153));
        seis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seis.setText("6");
        seis.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB7Layout = new javax.swing.GroupLayout(LetraB7);
        LetraB7.setLayout(LetraB7Layout);
        LetraB7Layout.setHorizontalGroup(
            LetraB7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seis, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB7Layout.setVerticalGroup(
            LetraB7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB8.setBackground(new java.awt.Color(204, 204, 204));
        LetraB8.setPreferredSize(new java.awt.Dimension(70, 70));

        siete.setBackground(new java.awt.Color(204, 204, 204));
        siete.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        siete.setForeground(new java.awt.Color(153, 153, 153));
        siete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        siete.setText("7");
        siete.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB8Layout = new javax.swing.GroupLayout(LetraB8);
        LetraB8.setLayout(LetraB8Layout);
        LetraB8Layout.setHorizontalGroup(
            LetraB8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(siete, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB8Layout.setVerticalGroup(
            LetraB8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB9.setBackground(new java.awt.Color(204, 204, 204));
        LetraB9.setPreferredSize(new java.awt.Dimension(70, 70));

        ocho.setBackground(new java.awt.Color(204, 204, 204));
        ocho.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        ocho.setForeground(new java.awt.Color(153, 153, 153));
        ocho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ocho.setText("8");
        ocho.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB9Layout = new javax.swing.GroupLayout(LetraB9);
        LetraB9.setLayout(LetraB9Layout);
        LetraB9Layout.setHorizontalGroup(
            LetraB9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ocho, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB9Layout.setVerticalGroup(
            LetraB9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB10.setBackground(new java.awt.Color(204, 204, 204));
        LetraB10.setPreferredSize(new java.awt.Dimension(70, 70));

        nueve.setBackground(new java.awt.Color(204, 204, 204));
        nueve.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        nueve.setForeground(new java.awt.Color(153, 153, 153));
        nueve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nueve.setText("9");
        nueve.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB10Layout = new javax.swing.GroupLayout(LetraB10);
        LetraB10.setLayout(LetraB10Layout);
        LetraB10Layout.setHorizontalGroup(
            LetraB10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nueve, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB10Layout.setVerticalGroup(
            LetraB10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB11.setBackground(new java.awt.Color(204, 204, 204));
        LetraB11.setPreferredSize(new java.awt.Dimension(70, 70));

        diez.setBackground(new java.awt.Color(204, 204, 204));
        diez.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        diez.setForeground(new java.awt.Color(153, 153, 153));
        diez.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diez.setText("10");
        diez.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB11Layout = new javax.swing.GroupLayout(LetraB11);
        LetraB11.setLayout(LetraB11Layout);
        LetraB11Layout.setHorizontalGroup(
            LetraB11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(diez, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB11Layout.setVerticalGroup(
            LetraB11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(diez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB12.setBackground(new java.awt.Color(204, 204, 204));
        LetraB12.setPreferredSize(new java.awt.Dimension(70, 70));

        once.setBackground(new java.awt.Color(204, 204, 204));
        once.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        once.setForeground(new java.awt.Color(153, 153, 153));
        once.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        once.setText("11");
        once.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB12Layout = new javax.swing.GroupLayout(LetraB12);
        LetraB12.setLayout(LetraB12Layout);
        LetraB12Layout.setHorizontalGroup(
            LetraB12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(once, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB12Layout.setVerticalGroup(
            LetraB12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(once, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB13.setBackground(new java.awt.Color(204, 204, 204));
        LetraB13.setPreferredSize(new java.awt.Dimension(70, 70));

        doce.setBackground(new java.awt.Color(204, 204, 204));
        doce.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        doce.setForeground(new java.awt.Color(153, 153, 153));
        doce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doce.setText("12");
        doce.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB13Layout = new javax.swing.GroupLayout(LetraB13);
        LetraB13.setLayout(LetraB13Layout);
        LetraB13Layout.setHorizontalGroup(
            LetraB13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(doce, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB13Layout.setVerticalGroup(
            LetraB13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(doce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB15.setBackground(new java.awt.Color(204, 204, 204));
        LetraB15.setPreferredSize(new java.awt.Dimension(70, 70));

        trece.setBackground(new java.awt.Color(204, 204, 204));
        trece.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        trece.setForeground(new java.awt.Color(153, 153, 153));
        trece.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trece.setText("13");
        trece.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB15Layout = new javax.swing.GroupLayout(LetraB15);
        LetraB15.setLayout(LetraB15Layout);
        LetraB15Layout.setHorizontalGroup(
            LetraB15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trece, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB15Layout.setVerticalGroup(
            LetraB15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB16.setBackground(new java.awt.Color(204, 204, 204));
        LetraB16.setPreferredSize(new java.awt.Dimension(70, 70));

        catorce.setBackground(new java.awt.Color(204, 204, 204));
        catorce.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        catorce.setForeground(new java.awt.Color(153, 153, 153));
        catorce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        catorce.setText("14");
        catorce.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB16Layout = new javax.swing.GroupLayout(LetraB16);
        LetraB16.setLayout(LetraB16Layout);
        LetraB16Layout.setHorizontalGroup(
            LetraB16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(catorce, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB16Layout.setVerticalGroup(
            LetraB16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(catorce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB17.setBackground(new java.awt.Color(204, 204, 204));
        LetraB17.setPreferredSize(new java.awt.Dimension(70, 70));

        quince.setBackground(new java.awt.Color(204, 204, 204));
        quince.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        quince.setForeground(new java.awt.Color(153, 153, 153));
        quince.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quince.setText("15");
        quince.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB17Layout = new javax.swing.GroupLayout(LetraB17);
        LetraB17.setLayout(LetraB17Layout);
        LetraB17Layout.setHorizontalGroup(
            LetraB17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quince, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB17Layout.setVerticalGroup(
            LetraB17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB18.setBackground(new java.awt.Color(204, 204, 204));
        LetraB18.setPreferredSize(new java.awt.Dimension(70, 70));

        dieciseis.setBackground(new java.awt.Color(204, 204, 204));
        dieciseis.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        dieciseis.setForeground(new java.awt.Color(153, 153, 153));
        dieciseis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dieciseis.setText("16");
        dieciseis.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB18Layout = new javax.swing.GroupLayout(LetraB18);
        LetraB18.setLayout(LetraB18Layout);
        LetraB18Layout.setHorizontalGroup(
            LetraB18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dieciseis, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB18Layout.setVerticalGroup(
            LetraB18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dieciseis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB19.setBackground(new java.awt.Color(204, 204, 204));
        LetraB19.setPreferredSize(new java.awt.Dimension(70, 70));

        diecisiete.setBackground(new java.awt.Color(204, 204, 204));
        diecisiete.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        diecisiete.setForeground(new java.awt.Color(153, 153, 153));
        diecisiete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diecisiete.setText("17");
        diecisiete.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB19Layout = new javax.swing.GroupLayout(LetraB19);
        LetraB19.setLayout(LetraB19Layout);
        LetraB19Layout.setHorizontalGroup(
            LetraB19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(diecisiete, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB19Layout.setVerticalGroup(
            LetraB19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(diecisiete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB20.setBackground(new java.awt.Color(204, 204, 204));
        LetraB20.setPreferredSize(new java.awt.Dimension(70, 70));

        dieciocho.setBackground(new java.awt.Color(204, 204, 204));
        dieciocho.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        dieciocho.setForeground(new java.awt.Color(153, 153, 153));
        dieciocho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dieciocho.setText("18");
        dieciocho.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB20Layout = new javax.swing.GroupLayout(LetraB20);
        LetraB20.setLayout(LetraB20Layout);
        LetraB20Layout.setHorizontalGroup(
            LetraB20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dieciocho, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB20Layout.setVerticalGroup(
            LetraB20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dieciocho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB21.setBackground(new java.awt.Color(204, 204, 204));
        LetraB21.setPreferredSize(new java.awt.Dimension(70, 70));

        diecinueve.setBackground(new java.awt.Color(204, 204, 204));
        diecinueve.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        diecinueve.setForeground(new java.awt.Color(153, 153, 153));
        diecinueve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diecinueve.setText("19");
        diecinueve.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB21Layout = new javax.swing.GroupLayout(LetraB21);
        LetraB21.setLayout(LetraB21Layout);
        LetraB21Layout.setHorizontalGroup(
            LetraB21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(diecinueve, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB21Layout.setVerticalGroup(
            LetraB21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(diecinueve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB22.setBackground(new java.awt.Color(204, 204, 204));
        LetraB22.setPreferredSize(new java.awt.Dimension(70, 70));

        veinte.setBackground(new java.awt.Color(204, 204, 204));
        veinte.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        veinte.setForeground(new java.awt.Color(153, 153, 153));
        veinte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        veinte.setText("20");
        veinte.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB22Layout = new javax.swing.GroupLayout(LetraB22);
        LetraB22.setLayout(LetraB22Layout);
        LetraB22Layout.setHorizontalGroup(
            LetraB22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veinte, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB22Layout.setVerticalGroup(
            LetraB22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veinte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB23.setBackground(new java.awt.Color(204, 204, 204));
        LetraB23.setPreferredSize(new java.awt.Dimension(70, 70));

        veintiUno.setBackground(new java.awt.Color(204, 204, 204));
        veintiUno.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        veintiUno.setForeground(new java.awt.Color(153, 153, 153));
        veintiUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        veintiUno.setText("21");
        veintiUno.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB23Layout = new javax.swing.GroupLayout(LetraB23);
        LetraB23.setLayout(LetraB23Layout);
        LetraB23Layout.setHorizontalGroup(
            LetraB23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiUno, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB23Layout.setVerticalGroup(
            LetraB23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB24.setBackground(new java.awt.Color(204, 204, 204));
        LetraB24.setPreferredSize(new java.awt.Dimension(70, 70));

        veintiDos.setBackground(new java.awt.Color(204, 204, 204));
        veintiDos.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        veintiDos.setForeground(new java.awt.Color(153, 153, 153));
        veintiDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        veintiDos.setText("22");
        veintiDos.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB24Layout = new javax.swing.GroupLayout(LetraB24);
        LetraB24.setLayout(LetraB24Layout);
        LetraB24Layout.setHorizontalGroup(
            LetraB24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiDos, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB24Layout.setVerticalGroup(
            LetraB24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB25.setBackground(new java.awt.Color(204, 204, 204));
        LetraB25.setPreferredSize(new java.awt.Dimension(70, 70));

        veintiTres.setBackground(new java.awt.Color(204, 204, 204));
        veintiTres.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        veintiTres.setForeground(new java.awt.Color(153, 153, 153));
        veintiTres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        veintiTres.setText("23");
        veintiTres.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB25Layout = new javax.swing.GroupLayout(LetraB25);
        LetraB25.setLayout(LetraB25Layout);
        LetraB25Layout.setHorizontalGroup(
            LetraB25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiTres, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB25Layout.setVerticalGroup(
            LetraB25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB26.setBackground(new java.awt.Color(204, 204, 204));
        LetraB26.setPreferredSize(new java.awt.Dimension(70, 70));

        veintiCuatro.setBackground(new java.awt.Color(204, 204, 204));
        veintiCuatro.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        veintiCuatro.setForeground(new java.awt.Color(153, 153, 153));
        veintiCuatro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        veintiCuatro.setText("24");
        veintiCuatro.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB26Layout = new javax.swing.GroupLayout(LetraB26);
        LetraB26.setLayout(LetraB26Layout);
        LetraB26Layout.setHorizontalGroup(
            LetraB26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB26Layout.setVerticalGroup(
            LetraB26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB27.setBackground(new java.awt.Color(204, 204, 204));
        LetraB27.setPreferredSize(new java.awt.Dimension(70, 70));

        veintiCinco.setBackground(new java.awt.Color(204, 204, 204));
        veintiCinco.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        veintiCinco.setForeground(new java.awt.Color(153, 153, 153));
        veintiCinco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        veintiCinco.setText("25");
        veintiCinco.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB27Layout = new javax.swing.GroupLayout(LetraB27);
        LetraB27.setLayout(LetraB27Layout);
        LetraB27Layout.setHorizontalGroup(
            LetraB27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiCinco, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB27Layout.setVerticalGroup(
            LetraB27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB28.setBackground(new java.awt.Color(204, 204, 204));
        LetraB28.setPreferredSize(new java.awt.Dimension(70, 70));

        veintiSeis.setBackground(new java.awt.Color(204, 204, 204));
        veintiSeis.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        veintiSeis.setForeground(new java.awt.Color(153, 153, 153));
        veintiSeis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        veintiSeis.setText("26");
        veintiSeis.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB28Layout = new javax.swing.GroupLayout(LetraB28);
        LetraB28.setLayout(LetraB28Layout);
        LetraB28Layout.setHorizontalGroup(
            LetraB28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiSeis, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB28Layout.setVerticalGroup(
            LetraB28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiSeis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB29.setBackground(new java.awt.Color(204, 204, 204));
        LetraB29.setPreferredSize(new java.awt.Dimension(70, 70));

        veintiSiete.setBackground(new java.awt.Color(204, 204, 204));
        veintiSiete.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        veintiSiete.setForeground(new java.awt.Color(153, 153, 153));
        veintiSiete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        veintiSiete.setText("27");
        veintiSiete.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB29Layout = new javax.swing.GroupLayout(LetraB29);
        LetraB29.setLayout(LetraB29Layout);
        LetraB29Layout.setHorizontalGroup(
            LetraB29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiSiete, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB29Layout.setVerticalGroup(
            LetraB29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiSiete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB30.setBackground(new java.awt.Color(204, 204, 204));
        LetraB30.setPreferredSize(new java.awt.Dimension(70, 70));

        veintiOcho.setBackground(new java.awt.Color(204, 204, 204));
        veintiOcho.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        veintiOcho.setForeground(new java.awt.Color(153, 153, 153));
        veintiOcho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        veintiOcho.setText("28");
        veintiOcho.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB30Layout = new javax.swing.GroupLayout(LetraB30);
        LetraB30.setLayout(LetraB30Layout);
        LetraB30Layout.setHorizontalGroup(
            LetraB30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiOcho, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB30Layout.setVerticalGroup(
            LetraB30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiOcho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB31.setBackground(new java.awt.Color(204, 204, 204));
        LetraB31.setPreferredSize(new java.awt.Dimension(70, 70));

        veintiNueve.setBackground(new java.awt.Color(204, 204, 204));
        veintiNueve.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        veintiNueve.setForeground(new java.awt.Color(153, 153, 153));
        veintiNueve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        veintiNueve.setText("29");
        veintiNueve.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB31Layout = new javax.swing.GroupLayout(LetraB31);
        LetraB31.setLayout(LetraB31Layout);
        LetraB31Layout.setHorizontalGroup(
            LetraB31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiNueve, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB31Layout.setVerticalGroup(
            LetraB31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(veintiNueve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB32.setBackground(new java.awt.Color(204, 204, 204));
        LetraB32.setPreferredSize(new java.awt.Dimension(70, 70));

        treinta.setBackground(new java.awt.Color(204, 204, 204));
        treinta.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        treinta.setForeground(new java.awt.Color(153, 153, 153));
        treinta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        treinta.setText("30");
        treinta.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB32Layout = new javax.swing.GroupLayout(LetraB32);
        LetraB32.setLayout(LetraB32Layout);
        LetraB32Layout.setHorizontalGroup(
            LetraB32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treinta, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB32Layout.setVerticalGroup(
            LetraB32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB33.setBackground(new java.awt.Color(204, 204, 204));
        LetraB33.setPreferredSize(new java.awt.Dimension(70, 70));

        treintaUno.setBackground(new java.awt.Color(204, 204, 204));
        treintaUno.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        treintaUno.setForeground(new java.awt.Color(153, 153, 153));
        treintaUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        treintaUno.setText("31");
        treintaUno.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB33Layout = new javax.swing.GroupLayout(LetraB33);
        LetraB33.setLayout(LetraB33Layout);
        LetraB33Layout.setHorizontalGroup(
            LetraB33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaUno, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB33Layout.setVerticalGroup(
            LetraB33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB34.setBackground(new java.awt.Color(204, 204, 204));
        LetraB34.setPreferredSize(new java.awt.Dimension(70, 70));

        treintaDos.setBackground(new java.awt.Color(204, 204, 204));
        treintaDos.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        treintaDos.setForeground(new java.awt.Color(153, 153, 153));
        treintaDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        treintaDos.setText("32");
        treintaDos.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB34Layout = new javax.swing.GroupLayout(LetraB34);
        LetraB34.setLayout(LetraB34Layout);
        LetraB34Layout.setHorizontalGroup(
            LetraB34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaDos, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB34Layout.setVerticalGroup(
            LetraB34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB35.setBackground(new java.awt.Color(204, 204, 204));
        LetraB35.setPreferredSize(new java.awt.Dimension(70, 70));

        treintaTres.setBackground(new java.awt.Color(204, 204, 204));
        treintaTres.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        treintaTres.setForeground(new java.awt.Color(153, 153, 153));
        treintaTres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        treintaTres.setText("33");
        treintaTres.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB35Layout = new javax.swing.GroupLayout(LetraB35);
        LetraB35.setLayout(LetraB35Layout);
        LetraB35Layout.setHorizontalGroup(
            LetraB35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaTres, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB35Layout.setVerticalGroup(
            LetraB35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB36.setBackground(new java.awt.Color(204, 204, 204));
        LetraB36.setPreferredSize(new java.awt.Dimension(70, 70));

        treintaCuatro.setBackground(new java.awt.Color(204, 204, 204));
        treintaCuatro.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        treintaCuatro.setForeground(new java.awt.Color(153, 153, 153));
        treintaCuatro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        treintaCuatro.setText("34");
        treintaCuatro.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB36Layout = new javax.swing.GroupLayout(LetraB36);
        LetraB36.setLayout(LetraB36Layout);
        LetraB36Layout.setHorizontalGroup(
            LetraB36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB36Layout.setVerticalGroup(
            LetraB36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB37.setBackground(new java.awt.Color(204, 204, 204));
        LetraB37.setPreferredSize(new java.awt.Dimension(70, 70));

        treintaCinco.setBackground(new java.awt.Color(204, 204, 204));
        treintaCinco.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        treintaCinco.setForeground(new java.awt.Color(153, 153, 153));
        treintaCinco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        treintaCinco.setText("35");
        treintaCinco.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB37Layout = new javax.swing.GroupLayout(LetraB37);
        LetraB37.setLayout(LetraB37Layout);
        LetraB37Layout.setHorizontalGroup(
            LetraB37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaCinco, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB37Layout.setVerticalGroup(
            LetraB37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB38.setBackground(new java.awt.Color(204, 204, 204));
        LetraB38.setPreferredSize(new java.awt.Dimension(70, 70));

        treintaSeis.setBackground(new java.awt.Color(204, 204, 204));
        treintaSeis.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        treintaSeis.setForeground(new java.awt.Color(153, 153, 153));
        treintaSeis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        treintaSeis.setText("36");
        treintaSeis.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB38Layout = new javax.swing.GroupLayout(LetraB38);
        LetraB38.setLayout(LetraB38Layout);
        LetraB38Layout.setHorizontalGroup(
            LetraB38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaSeis, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB38Layout.setVerticalGroup(
            LetraB38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaSeis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB39.setBackground(new java.awt.Color(204, 204, 204));
        LetraB39.setPreferredSize(new java.awt.Dimension(70, 70));

        treintaSiete.setBackground(new java.awt.Color(204, 204, 204));
        treintaSiete.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        treintaSiete.setForeground(new java.awt.Color(153, 153, 153));
        treintaSiete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        treintaSiete.setText("37");
        treintaSiete.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB39Layout = new javax.swing.GroupLayout(LetraB39);
        LetraB39.setLayout(LetraB39Layout);
        LetraB39Layout.setHorizontalGroup(
            LetraB39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaSiete, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB39Layout.setVerticalGroup(
            LetraB39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaSiete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB40.setBackground(new java.awt.Color(204, 204, 204));
        LetraB40.setPreferredSize(new java.awt.Dimension(70, 70));

        treintaOcho.setBackground(new java.awt.Color(204, 204, 204));
        treintaOcho.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        treintaOcho.setForeground(new java.awt.Color(153, 153, 153));
        treintaOcho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        treintaOcho.setText("38");
        treintaOcho.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB40Layout = new javax.swing.GroupLayout(LetraB40);
        LetraB40.setLayout(LetraB40Layout);
        LetraB40Layout.setHorizontalGroup(
            LetraB40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaOcho, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB40Layout.setVerticalGroup(
            LetraB40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaOcho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB41.setBackground(new java.awt.Color(204, 204, 204));
        LetraB41.setPreferredSize(new java.awt.Dimension(70, 70));

        treintaNueve.setBackground(new java.awt.Color(204, 204, 204));
        treintaNueve.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        treintaNueve.setForeground(new java.awt.Color(153, 153, 153));
        treintaNueve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        treintaNueve.setText("39");
        treintaNueve.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB41Layout = new javax.swing.GroupLayout(LetraB41);
        LetraB41.setLayout(LetraB41Layout);
        LetraB41Layout.setHorizontalGroup(
            LetraB41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaNueve, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB41Layout.setVerticalGroup(
            LetraB41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treintaNueve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB42.setBackground(new java.awt.Color(204, 204, 204));
        LetraB42.setPreferredSize(new java.awt.Dimension(70, 70));

        cuarenta.setBackground(new java.awt.Color(204, 204, 204));
        cuarenta.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cuarenta.setForeground(new java.awt.Color(153, 153, 153));
        cuarenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuarenta.setText("40");
        cuarenta.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB42Layout = new javax.swing.GroupLayout(LetraB42);
        LetraB42.setLayout(LetraB42Layout);
        LetraB42Layout.setHorizontalGroup(
            LetraB42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarenta, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB42Layout.setVerticalGroup(
            LetraB42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB43.setBackground(new java.awt.Color(204, 204, 204));
        LetraB43.setPreferredSize(new java.awt.Dimension(70, 70));

        cuarentaUno.setBackground(new java.awt.Color(204, 204, 204));
        cuarentaUno.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cuarentaUno.setForeground(new java.awt.Color(153, 153, 153));
        cuarentaUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuarentaUno.setText("41");
        cuarentaUno.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB43Layout = new javax.swing.GroupLayout(LetraB43);
        LetraB43.setLayout(LetraB43Layout);
        LetraB43Layout.setHorizontalGroup(
            LetraB43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaUno, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB43Layout.setVerticalGroup(
            LetraB43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB44.setBackground(new java.awt.Color(204, 204, 204));
        LetraB44.setPreferredSize(new java.awt.Dimension(70, 70));

        cuarentaDos.setBackground(new java.awt.Color(204, 204, 204));
        cuarentaDos.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cuarentaDos.setForeground(new java.awt.Color(153, 153, 153));
        cuarentaDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuarentaDos.setText("42");
        cuarentaDos.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB44Layout = new javax.swing.GroupLayout(LetraB44);
        LetraB44.setLayout(LetraB44Layout);
        LetraB44Layout.setHorizontalGroup(
            LetraB44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaDos, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB44Layout.setVerticalGroup(
            LetraB44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB45.setBackground(new java.awt.Color(204, 204, 204));
        LetraB45.setPreferredSize(new java.awt.Dimension(70, 70));

        cuarentaTres.setBackground(new java.awt.Color(204, 204, 204));
        cuarentaTres.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cuarentaTres.setForeground(new java.awt.Color(153, 153, 153));
        cuarentaTres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuarentaTres.setText("43");
        cuarentaTres.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB45Layout = new javax.swing.GroupLayout(LetraB45);
        LetraB45.setLayout(LetraB45Layout);
        LetraB45Layout.setHorizontalGroup(
            LetraB45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaTres, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB45Layout.setVerticalGroup(
            LetraB45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB46.setBackground(new java.awt.Color(204, 204, 204));
        LetraB46.setPreferredSize(new java.awt.Dimension(70, 70));

        cuarentaCuatro.setBackground(new java.awt.Color(204, 204, 204));
        cuarentaCuatro.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cuarentaCuatro.setForeground(new java.awt.Color(153, 153, 153));
        cuarentaCuatro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuarentaCuatro.setText("44");
        cuarentaCuatro.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB46Layout = new javax.swing.GroupLayout(LetraB46);
        LetraB46.setLayout(LetraB46Layout);
        LetraB46Layout.setHorizontalGroup(
            LetraB46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB46Layout.setVerticalGroup(
            LetraB46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB47.setBackground(new java.awt.Color(204, 204, 204));
        LetraB47.setPreferredSize(new java.awt.Dimension(70, 70));

        cuarentaCinco.setBackground(new java.awt.Color(204, 204, 204));
        cuarentaCinco.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cuarentaCinco.setForeground(new java.awt.Color(153, 153, 153));
        cuarentaCinco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuarentaCinco.setText("45");
        cuarentaCinco.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB47Layout = new javax.swing.GroupLayout(LetraB47);
        LetraB47.setLayout(LetraB47Layout);
        LetraB47Layout.setHorizontalGroup(
            LetraB47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaCinco, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB47Layout.setVerticalGroup(
            LetraB47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB48.setBackground(new java.awt.Color(204, 204, 204));
        LetraB48.setPreferredSize(new java.awt.Dimension(70, 70));

        cuarentaSeis.setBackground(new java.awt.Color(204, 204, 204));
        cuarentaSeis.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cuarentaSeis.setForeground(new java.awt.Color(153, 153, 153));
        cuarentaSeis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuarentaSeis.setText("46");
        cuarentaSeis.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB48Layout = new javax.swing.GroupLayout(LetraB48);
        LetraB48.setLayout(LetraB48Layout);
        LetraB48Layout.setHorizontalGroup(
            LetraB48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaSeis, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB48Layout.setVerticalGroup(
            LetraB48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaSeis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB49.setBackground(new java.awt.Color(204, 204, 204));
        LetraB49.setPreferredSize(new java.awt.Dimension(70, 70));

        cuarentaSiete.setBackground(new java.awt.Color(204, 204, 204));
        cuarentaSiete.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cuarentaSiete.setForeground(new java.awt.Color(153, 153, 153));
        cuarentaSiete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuarentaSiete.setText("47");
        cuarentaSiete.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB49Layout = new javax.swing.GroupLayout(LetraB49);
        LetraB49.setLayout(LetraB49Layout);
        LetraB49Layout.setHorizontalGroup(
            LetraB49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaSiete, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB49Layout.setVerticalGroup(
            LetraB49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaSiete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB50.setBackground(new java.awt.Color(204, 204, 204));
        LetraB50.setPreferredSize(new java.awt.Dimension(70, 70));

        cuarentaOcho.setBackground(new java.awt.Color(204, 204, 204));
        cuarentaOcho.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cuarentaOcho.setForeground(new java.awt.Color(153, 153, 153));
        cuarentaOcho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuarentaOcho.setText("48");
        cuarentaOcho.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB50Layout = new javax.swing.GroupLayout(LetraB50);
        LetraB50.setLayout(LetraB50Layout);
        LetraB50Layout.setHorizontalGroup(
            LetraB50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaOcho, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB50Layout.setVerticalGroup(
            LetraB50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaOcho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB51.setBackground(new java.awt.Color(204, 204, 204));
        LetraB51.setPreferredSize(new java.awt.Dimension(70, 70));

        cuarentaNueve.setBackground(new java.awt.Color(204, 204, 204));
        cuarentaNueve.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cuarentaNueve.setForeground(new java.awt.Color(153, 153, 153));
        cuarentaNueve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuarentaNueve.setText("49");
        cuarentaNueve.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB51Layout = new javax.swing.GroupLayout(LetraB51);
        LetraB51.setLayout(LetraB51Layout);
        LetraB51Layout.setHorizontalGroup(
            LetraB51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaNueve, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB51Layout.setVerticalGroup(
            LetraB51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cuarentaNueve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB52.setBackground(new java.awt.Color(204, 204, 204));
        LetraB52.setPreferredSize(new java.awt.Dimension(70, 70));

        cincuenta.setBackground(new java.awt.Color(204, 204, 204));
        cincuenta.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cincuenta.setForeground(new java.awt.Color(153, 153, 153));
        cincuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cincuenta.setText("50");
        cincuenta.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB52Layout = new javax.swing.GroupLayout(LetraB52);
        LetraB52.setLayout(LetraB52Layout);
        LetraB52Layout.setHorizontalGroup(
            LetraB52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB52Layout.setVerticalGroup(
            LetraB52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB53.setBackground(new java.awt.Color(204, 204, 204));
        LetraB53.setPreferredSize(new java.awt.Dimension(70, 70));

        cincuentaUno.setBackground(new java.awt.Color(204, 204, 204));
        cincuentaUno.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cincuentaUno.setForeground(new java.awt.Color(153, 153, 153));
        cincuentaUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cincuentaUno.setText("51");
        cincuentaUno.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB53Layout = new javax.swing.GroupLayout(LetraB53);
        LetraB53.setLayout(LetraB53Layout);
        LetraB53Layout.setHorizontalGroup(
            LetraB53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaUno, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB53Layout.setVerticalGroup(
            LetraB53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB54.setBackground(new java.awt.Color(204, 204, 204));
        LetraB54.setPreferredSize(new java.awt.Dimension(70, 70));

        cincuentaDos.setBackground(new java.awt.Color(204, 204, 204));
        cincuentaDos.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cincuentaDos.setForeground(new java.awt.Color(153, 153, 153));
        cincuentaDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cincuentaDos.setText("52");
        cincuentaDos.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB54Layout = new javax.swing.GroupLayout(LetraB54);
        LetraB54.setLayout(LetraB54Layout);
        LetraB54Layout.setHorizontalGroup(
            LetraB54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaDos, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB54Layout.setVerticalGroup(
            LetraB54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB55.setBackground(new java.awt.Color(204, 204, 204));
        LetraB55.setPreferredSize(new java.awt.Dimension(70, 70));

        cincuentaTres.setBackground(new java.awt.Color(204, 204, 204));
        cincuentaTres.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cincuentaTres.setForeground(new java.awt.Color(153, 153, 153));
        cincuentaTres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cincuentaTres.setText("53");
        cincuentaTres.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB55Layout = new javax.swing.GroupLayout(LetraB55);
        LetraB55.setLayout(LetraB55Layout);
        LetraB55Layout.setHorizontalGroup(
            LetraB55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaTres, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB55Layout.setVerticalGroup(
            LetraB55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB56.setBackground(new java.awt.Color(204, 204, 204));
        LetraB56.setPreferredSize(new java.awt.Dimension(70, 70));

        cincuentaCuatro.setBackground(new java.awt.Color(204, 204, 204));
        cincuentaCuatro.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cincuentaCuatro.setForeground(new java.awt.Color(153, 153, 153));
        cincuentaCuatro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cincuentaCuatro.setText("54");
        cincuentaCuatro.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB56Layout = new javax.swing.GroupLayout(LetraB56);
        LetraB56.setLayout(LetraB56Layout);
        LetraB56Layout.setHorizontalGroup(
            LetraB56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB56Layout.setVerticalGroup(
            LetraB56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB57.setBackground(new java.awt.Color(204, 204, 204));
        LetraB57.setPreferredSize(new java.awt.Dimension(70, 70));

        cincuentaCinco.setBackground(new java.awt.Color(204, 204, 204));
        cincuentaCinco.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cincuentaCinco.setForeground(new java.awt.Color(153, 153, 153));
        cincuentaCinco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cincuentaCinco.setText("55");
        cincuentaCinco.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB57Layout = new javax.swing.GroupLayout(LetraB57);
        LetraB57.setLayout(LetraB57Layout);
        LetraB57Layout.setHorizontalGroup(
            LetraB57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaCinco, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB57Layout.setVerticalGroup(
            LetraB57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB58.setBackground(new java.awt.Color(204, 204, 204));
        LetraB58.setPreferredSize(new java.awt.Dimension(70, 70));

        cincuentaSeis.setBackground(new java.awt.Color(204, 204, 204));
        cincuentaSeis.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cincuentaSeis.setForeground(new java.awt.Color(153, 153, 153));
        cincuentaSeis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cincuentaSeis.setText("56");
        cincuentaSeis.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB58Layout = new javax.swing.GroupLayout(LetraB58);
        LetraB58.setLayout(LetraB58Layout);
        LetraB58Layout.setHorizontalGroup(
            LetraB58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaSeis, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB58Layout.setVerticalGroup(
            LetraB58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaSeis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB59.setBackground(new java.awt.Color(204, 204, 204));
        LetraB59.setPreferredSize(new java.awt.Dimension(70, 70));

        cincuentaSiete.setBackground(new java.awt.Color(204, 204, 204));
        cincuentaSiete.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cincuentaSiete.setForeground(new java.awt.Color(153, 153, 153));
        cincuentaSiete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cincuentaSiete.setText("57");
        cincuentaSiete.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB59Layout = new javax.swing.GroupLayout(LetraB59);
        LetraB59.setLayout(LetraB59Layout);
        LetraB59Layout.setHorizontalGroup(
            LetraB59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaSiete, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB59Layout.setVerticalGroup(
            LetraB59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaSiete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB60.setBackground(new java.awt.Color(204, 204, 204));
        LetraB60.setPreferredSize(new java.awt.Dimension(70, 70));

        cincuentaOcho.setBackground(new java.awt.Color(204, 204, 204));
        cincuentaOcho.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cincuentaOcho.setForeground(new java.awt.Color(153, 153, 153));
        cincuentaOcho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cincuentaOcho.setText("58");
        cincuentaOcho.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB60Layout = new javax.swing.GroupLayout(LetraB60);
        LetraB60.setLayout(LetraB60Layout);
        LetraB60Layout.setHorizontalGroup(
            LetraB60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaOcho, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB60Layout.setVerticalGroup(
            LetraB60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaOcho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB61.setBackground(new java.awt.Color(204, 204, 204));
        LetraB61.setPreferredSize(new java.awt.Dimension(70, 70));

        cincuentaNueve.setBackground(new java.awt.Color(204, 204, 204));
        cincuentaNueve.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        cincuentaNueve.setForeground(new java.awt.Color(153, 153, 153));
        cincuentaNueve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cincuentaNueve.setText("59");
        cincuentaNueve.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB61Layout = new javax.swing.GroupLayout(LetraB61);
        LetraB61.setLayout(LetraB61Layout);
        LetraB61Layout.setHorizontalGroup(
            LetraB61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaNueve, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB61Layout.setVerticalGroup(
            LetraB61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cincuentaNueve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB62.setBackground(new java.awt.Color(204, 204, 204));
        LetraB62.setPreferredSize(new java.awt.Dimension(70, 70));

        sesenta.setBackground(new java.awt.Color(204, 204, 204));
        sesenta.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        sesenta.setForeground(new java.awt.Color(153, 153, 153));
        sesenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sesenta.setText("60");
        sesenta.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB62Layout = new javax.swing.GroupLayout(LetraB62);
        LetraB62.setLayout(LetraB62Layout);
        LetraB62Layout.setHorizontalGroup(
            LetraB62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesenta, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB62Layout.setVerticalGroup(
            LetraB62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB63.setBackground(new java.awt.Color(204, 204, 204));
        LetraB63.setPreferredSize(new java.awt.Dimension(70, 70));

        sesentaUno.setBackground(new java.awt.Color(204, 204, 204));
        sesentaUno.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        sesentaUno.setForeground(new java.awt.Color(153, 153, 153));
        sesentaUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sesentaUno.setText("61");
        sesentaUno.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB63Layout = new javax.swing.GroupLayout(LetraB63);
        LetraB63.setLayout(LetraB63Layout);
        LetraB63Layout.setHorizontalGroup(
            LetraB63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB63Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaUno, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB63Layout.setVerticalGroup(
            LetraB63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB63Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB64.setBackground(new java.awt.Color(204, 204, 204));
        LetraB64.setPreferredSize(new java.awt.Dimension(70, 70));

        sesentaDos.setBackground(new java.awt.Color(204, 204, 204));
        sesentaDos.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        sesentaDos.setForeground(new java.awt.Color(153, 153, 153));
        sesentaDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sesentaDos.setText("62");
        sesentaDos.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB64Layout = new javax.swing.GroupLayout(LetraB64);
        LetraB64.setLayout(LetraB64Layout);
        LetraB64Layout.setHorizontalGroup(
            LetraB64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB64Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaDos, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB64Layout.setVerticalGroup(
            LetraB64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB64Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB65.setBackground(new java.awt.Color(204, 204, 204));
        LetraB65.setPreferredSize(new java.awt.Dimension(70, 70));

        sesentaTres.setBackground(new java.awt.Color(204, 204, 204));
        sesentaTres.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        sesentaTres.setForeground(new java.awt.Color(153, 153, 153));
        sesentaTres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sesentaTres.setText("63");
        sesentaTres.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB65Layout = new javax.swing.GroupLayout(LetraB65);
        LetraB65.setLayout(LetraB65Layout);
        LetraB65Layout.setHorizontalGroup(
            LetraB65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaTres, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB65Layout.setVerticalGroup(
            LetraB65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB66.setBackground(new java.awt.Color(204, 204, 204));
        LetraB66.setPreferredSize(new java.awt.Dimension(70, 70));

        sesentaCuatro.setBackground(new java.awt.Color(204, 204, 204));
        sesentaCuatro.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        sesentaCuatro.setForeground(new java.awt.Color(153, 153, 153));
        sesentaCuatro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sesentaCuatro.setText("64");
        sesentaCuatro.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB66Layout = new javax.swing.GroupLayout(LetraB66);
        LetraB66.setLayout(LetraB66Layout);
        LetraB66Layout.setHorizontalGroup(
            LetraB66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB66Layout.setVerticalGroup(
            LetraB66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB67.setBackground(new java.awt.Color(204, 204, 204));
        LetraB67.setPreferredSize(new java.awt.Dimension(70, 70));

        sesentaCinco.setBackground(new java.awt.Color(204, 204, 204));
        sesentaCinco.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        sesentaCinco.setForeground(new java.awt.Color(153, 153, 153));
        sesentaCinco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sesentaCinco.setText("65");
        sesentaCinco.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB67Layout = new javax.swing.GroupLayout(LetraB67);
        LetraB67.setLayout(LetraB67Layout);
        LetraB67Layout.setHorizontalGroup(
            LetraB67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB67Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaCinco, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB67Layout.setVerticalGroup(
            LetraB67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB67Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB68.setBackground(new java.awt.Color(204, 204, 204));
        LetraB68.setPreferredSize(new java.awt.Dimension(70, 70));

        sesentaSeis.setBackground(new java.awt.Color(204, 204, 204));
        sesentaSeis.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        sesentaSeis.setForeground(new java.awt.Color(153, 153, 153));
        sesentaSeis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sesentaSeis.setText("66");
        sesentaSeis.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB68Layout = new javax.swing.GroupLayout(LetraB68);
        LetraB68.setLayout(LetraB68Layout);
        LetraB68Layout.setHorizontalGroup(
            LetraB68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaSeis, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB68Layout.setVerticalGroup(
            LetraB68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaSeis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB69.setBackground(new java.awt.Color(204, 204, 204));
        LetraB69.setPreferredSize(new java.awt.Dimension(70, 70));

        sesentaSiete.setBackground(new java.awt.Color(204, 204, 204));
        sesentaSiete.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        sesentaSiete.setForeground(new java.awt.Color(153, 153, 153));
        sesentaSiete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sesentaSiete.setText("67");
        sesentaSiete.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB69Layout = new javax.swing.GroupLayout(LetraB69);
        LetraB69.setLayout(LetraB69Layout);
        LetraB69Layout.setHorizontalGroup(
            LetraB69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB69Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaSiete, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB69Layout.setVerticalGroup(
            LetraB69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB69Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaSiete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB70.setBackground(new java.awt.Color(204, 204, 204));
        LetraB70.setPreferredSize(new java.awt.Dimension(70, 70));

        sesentaOcho.setBackground(new java.awt.Color(204, 204, 204));
        sesentaOcho.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        sesentaOcho.setForeground(new java.awt.Color(153, 153, 153));
        sesentaOcho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sesentaOcho.setText("68");
        sesentaOcho.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB70Layout = new javax.swing.GroupLayout(LetraB70);
        LetraB70.setLayout(LetraB70Layout);
        LetraB70Layout.setHorizontalGroup(
            LetraB70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB70Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaOcho, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB70Layout.setVerticalGroup(
            LetraB70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB70Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaOcho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB71.setBackground(new java.awt.Color(204, 204, 204));
        LetraB71.setPreferredSize(new java.awt.Dimension(70, 70));

        sesentaNueve.setBackground(new java.awt.Color(204, 204, 204));
        sesentaNueve.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        sesentaNueve.setForeground(new java.awt.Color(153, 153, 153));
        sesentaNueve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sesentaNueve.setText("69");
        sesentaNueve.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB71Layout = new javax.swing.GroupLayout(LetraB71);
        LetraB71.setLayout(LetraB71Layout);
        LetraB71Layout.setHorizontalGroup(
            LetraB71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB71Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaNueve, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB71Layout.setVerticalGroup(
            LetraB71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB71Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sesentaNueve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB72.setBackground(new java.awt.Color(204, 204, 204));
        LetraB72.setPreferredSize(new java.awt.Dimension(70, 70));

        setenta.setBackground(new java.awt.Color(204, 204, 204));
        setenta.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        setenta.setForeground(new java.awt.Color(153, 153, 153));
        setenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setenta.setText("70");
        setenta.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB72Layout = new javax.swing.GroupLayout(LetraB72);
        LetraB72.setLayout(LetraB72Layout);
        LetraB72Layout.setHorizontalGroup(
            LetraB72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB72Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setenta, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB72Layout.setVerticalGroup(
            LetraB72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB72Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB73.setBackground(new java.awt.Color(204, 204, 204));
        LetraB73.setPreferredSize(new java.awt.Dimension(70, 70));

        setentaUno.setBackground(new java.awt.Color(204, 204, 204));
        setentaUno.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        setentaUno.setForeground(new java.awt.Color(153, 153, 153));
        setentaUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setentaUno.setText("71");
        setentaUno.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB73Layout = new javax.swing.GroupLayout(LetraB73);
        LetraB73.setLayout(LetraB73Layout);
        LetraB73Layout.setHorizontalGroup(
            LetraB73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB73Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setentaUno, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB73Layout.setVerticalGroup(
            LetraB73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB73Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setentaUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB74.setBackground(new java.awt.Color(204, 204, 204));
        LetraB74.setPreferredSize(new java.awt.Dimension(70, 70));

        setentaDos.setBackground(new java.awt.Color(204, 204, 204));
        setentaDos.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        setentaDos.setForeground(new java.awt.Color(153, 153, 153));
        setentaDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setentaDos.setText("72");
        setentaDos.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB74Layout = new javax.swing.GroupLayout(LetraB74);
        LetraB74.setLayout(LetraB74Layout);
        LetraB74Layout.setHorizontalGroup(
            LetraB74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setentaDos, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB74Layout.setVerticalGroup(
            LetraB74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setentaDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB75.setBackground(new java.awt.Color(204, 204, 204));
        LetraB75.setPreferredSize(new java.awt.Dimension(70, 70));

        setentaTres.setBackground(new java.awt.Color(204, 204, 204));
        setentaTres.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        setentaTres.setForeground(new java.awt.Color(153, 153, 153));
        setentaTres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setentaTres.setText("73");
        setentaTres.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB75Layout = new javax.swing.GroupLayout(LetraB75);
        LetraB75.setLayout(LetraB75Layout);
        LetraB75Layout.setHorizontalGroup(
            LetraB75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB75Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setentaTres, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB75Layout.setVerticalGroup(
            LetraB75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB75Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setentaTres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB76.setBackground(new java.awt.Color(204, 204, 204));
        LetraB76.setPreferredSize(new java.awt.Dimension(70, 70));

        setentaCuatro.setBackground(new java.awt.Color(204, 204, 204));
        setentaCuatro.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        setentaCuatro.setForeground(new java.awt.Color(153, 153, 153));
        setentaCuatro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setentaCuatro.setText("74");
        setentaCuatro.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB76Layout = new javax.swing.GroupLayout(LetraB76);
        LetraB76.setLayout(LetraB76Layout);
        LetraB76Layout.setHorizontalGroup(
            LetraB76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB76Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setentaCuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB76Layout.setVerticalGroup(
            LetraB76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB76Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setentaCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LetraB77.setBackground(new java.awt.Color(204, 204, 204));
        LetraB77.setPreferredSize(new java.awt.Dimension(70, 70));

        setentaCinco.setBackground(new java.awt.Color(204, 204, 204));
        setentaCinco.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        setentaCinco.setForeground(new java.awt.Color(153, 153, 153));
        setentaCinco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setentaCinco.setText("75");
        setentaCinco.setPreferredSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout LetraB77Layout = new javax.swing.GroupLayout(LetraB77);
        LetraB77.setLayout(LetraB77Layout);
        LetraB77Layout.setHorizontalGroup(
            LetraB77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB77Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setentaCinco, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );
        LetraB77Layout.setVerticalGroup(
            LetraB77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetraB77Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setentaCinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LetraB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LetraI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LetraN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraB47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LetraO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LetraB48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LetraB63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LetraB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LetraB18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LetraB19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LetraB20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LetraB21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LetraB22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LetraB23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LetraB24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LetraB25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LetraB26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LetraB27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LetraB28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LetraB29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LetraB30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LetraB31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LetraB32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LetraN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraB33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraB34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraB35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraB36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraB37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraB38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraB39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraB40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraB41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraB42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraB43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraB44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraB45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraB46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraB47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LetraG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LetraB48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LetraB63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraB77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        patronElegido.setBackground(new java.awt.Color(255, 255, 255));
        patronElegido.setPreferredSize(new java.awt.Dimension(210, 210));
        patronElegido.setLayout(new java.awt.GridLayout(1, 1));

        botonSacarBola.setBackground(new java.awt.Color(0, 153, 153));
        botonSacarBola.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        botonSacarBola.setText("Sacar bola");
        botonSacarBola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSacarBolaActionPerformed(evt);
            }
        });

        numeroActual.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
        numeroActual.setForeground(new java.awt.Color(255, 153, 153));
        numeroActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeroActual.setText("0");

        numeroAnterior.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        numeroAnterior.setForeground(new java.awt.Color(255, 153, 153));
        numeroAnterior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeroAnterior.setText("0");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Patron Elegido");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Numero Anteriores");

        numerosAnteriores.setBackground(new java.awt.Color(0, 51, 102));
        numerosAnteriores.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(numeroActual, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(numeroAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(patronElegido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(botonSacarBola)
                        .addGap(251, 251, 251)
                        .addComponent(numerosAnteriores, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(412, 412, 412))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroActual, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patronElegido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numerosAnteriores, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonSacarBola, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSacarBolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSacarBolaActionPerformed
        //
    }//GEN-LAST:event_botonSacarBolaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tombola_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tombola_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tombola_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tombola_Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tombola_Grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LetraB;
    private javax.swing.JPanel LetraB1;
    private javax.swing.JPanel LetraB10;
    private javax.swing.JPanel LetraB11;
    private javax.swing.JPanel LetraB12;
    private javax.swing.JPanel LetraB13;
    private javax.swing.JPanel LetraB14;
    private javax.swing.JPanel LetraB15;
    private javax.swing.JPanel LetraB16;
    private javax.swing.JPanel LetraB17;
    private javax.swing.JPanel LetraB18;
    private javax.swing.JPanel LetraB19;
    private javax.swing.JPanel LetraB2;
    private javax.swing.JPanel LetraB20;
    private javax.swing.JPanel LetraB21;
    private javax.swing.JPanel LetraB22;
    private javax.swing.JPanel LetraB23;
    private javax.swing.JPanel LetraB24;
    private javax.swing.JPanel LetraB25;
    private javax.swing.JPanel LetraB26;
    private javax.swing.JPanel LetraB27;
    private javax.swing.JPanel LetraB28;
    private javax.swing.JPanel LetraB29;
    private javax.swing.JPanel LetraB3;
    private javax.swing.JPanel LetraB30;
    private javax.swing.JPanel LetraB31;
    private javax.swing.JPanel LetraB32;
    private javax.swing.JPanel LetraB33;
    private javax.swing.JPanel LetraB34;
    private javax.swing.JPanel LetraB35;
    private javax.swing.JPanel LetraB36;
    private javax.swing.JPanel LetraB37;
    private javax.swing.JPanel LetraB38;
    private javax.swing.JPanel LetraB39;
    private javax.swing.JPanel LetraB4;
    private javax.swing.JPanel LetraB40;
    private javax.swing.JPanel LetraB41;
    private javax.swing.JPanel LetraB42;
    private javax.swing.JPanel LetraB43;
    private javax.swing.JPanel LetraB44;
    private javax.swing.JPanel LetraB45;
    private javax.swing.JPanel LetraB46;
    private javax.swing.JPanel LetraB47;
    private javax.swing.JPanel LetraB48;
    private javax.swing.JPanel LetraB49;
    private javax.swing.JPanel LetraB5;
    private javax.swing.JPanel LetraB50;
    private javax.swing.JPanel LetraB51;
    private javax.swing.JPanel LetraB52;
    private javax.swing.JPanel LetraB53;
    private javax.swing.JPanel LetraB54;
    private javax.swing.JPanel LetraB55;
    private javax.swing.JPanel LetraB56;
    private javax.swing.JPanel LetraB57;
    private javax.swing.JPanel LetraB58;
    private javax.swing.JPanel LetraB59;
    private javax.swing.JPanel LetraB6;
    private javax.swing.JPanel LetraB60;
    private javax.swing.JPanel LetraB61;
    private javax.swing.JPanel LetraB62;
    private javax.swing.JPanel LetraB63;
    private javax.swing.JPanel LetraB64;
    private javax.swing.JPanel LetraB65;
    private javax.swing.JPanel LetraB66;
    private javax.swing.JPanel LetraB67;
    private javax.swing.JPanel LetraB68;
    private javax.swing.JPanel LetraB69;
    private javax.swing.JPanel LetraB7;
    private javax.swing.JPanel LetraB70;
    private javax.swing.JPanel LetraB71;
    private javax.swing.JPanel LetraB72;
    private javax.swing.JPanel LetraB73;
    private javax.swing.JPanel LetraB74;
    private javax.swing.JPanel LetraB75;
    private javax.swing.JPanel LetraB76;
    private javax.swing.JPanel LetraB77;
    private javax.swing.JPanel LetraB8;
    private javax.swing.JPanel LetraB9;
    private javax.swing.JPanel LetraG;
    private javax.swing.JPanel LetraI;
    private javax.swing.JPanel LetraN;
    private javax.swing.JPanel LetraN2;
    private javax.swing.JPanel LetraO;
    private javax.swing.JButton botonSacarBola;
    private javax.swing.JLabel catorce;
    private javax.swing.JLabel cinco;
    private javax.swing.JLabel cincuenta;
    private javax.swing.JLabel cincuentaCinco;
    private javax.swing.JLabel cincuentaCuatro;
    private javax.swing.JLabel cincuentaDos;
    private javax.swing.JLabel cincuentaNueve;
    private javax.swing.JLabel cincuentaOcho;
    private javax.swing.JLabel cincuentaSeis;
    private javax.swing.JLabel cincuentaSiete;
    private javax.swing.JLabel cincuentaTres;
    private javax.swing.JLabel cincuentaUno;
    private javax.swing.JLabel cuarenta;
    private javax.swing.JLabel cuarentaCinco;
    private javax.swing.JLabel cuarentaCuatro;
    private javax.swing.JLabel cuarentaDos;
    private javax.swing.JLabel cuarentaNueve;
    private javax.swing.JLabel cuarentaOcho;
    private javax.swing.JLabel cuarentaSeis;
    private javax.swing.JLabel cuarentaSiete;
    private javax.swing.JLabel cuarentaTres;
    private javax.swing.JLabel cuarentaUno;
    private javax.swing.JLabel cuatro;
    private javax.swing.JLabel diecinueve;
    private javax.swing.JLabel dieciocho;
    private javax.swing.JLabel dieciseis;
    private javax.swing.JLabel diecisiete;
    private javax.swing.JLabel diez;
    private javax.swing.JLabel doce;
    private javax.swing.JLabel dos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nueve;
    private javax.swing.JLabel numero14;
    private javax.swing.JLabel numero5;
    private javax.swing.JLabel numeroActual;
    private javax.swing.JLabel numeroAnterior;
    private javax.swing.JPanel numerosAnteriores;
    private javax.swing.JLabel ocho;
    private javax.swing.JLabel once;
    private javax.swing.JPanel patronElegido;
    private javax.swing.JLabel quince;
    private javax.swing.JLabel seis;
    private javax.swing.JLabel sesenta;
    private javax.swing.JLabel sesentaCinco;
    private javax.swing.JLabel sesentaCuatro;
    private javax.swing.JLabel sesentaDos;
    private javax.swing.JLabel sesentaNueve;
    private javax.swing.JLabel sesentaOcho;
    private javax.swing.JLabel sesentaSeis;
    private javax.swing.JLabel sesentaSiete;
    private javax.swing.JLabel sesentaTres;
    private javax.swing.JLabel sesentaUno;
    private javax.swing.JLabel setenta;
    private javax.swing.JLabel setentaCinco;
    private javax.swing.JLabel setentaCuatro;
    private javax.swing.JLabel setentaDos;
    private javax.swing.JLabel setentaTres;
    private javax.swing.JLabel setentaUno;
    private javax.swing.JLabel siete;
    private javax.swing.JLabel trece;
    private javax.swing.JLabel treinta;
    private javax.swing.JLabel treintaCinco;
    private javax.swing.JLabel treintaCuatro;
    private javax.swing.JLabel treintaDos;
    private javax.swing.JLabel treintaNueve;
    private javax.swing.JLabel treintaOcho;
    private javax.swing.JLabel treintaSeis;
    private javax.swing.JLabel treintaSiete;
    private javax.swing.JLabel treintaTres;
    private javax.swing.JLabel treintaUno;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel uno;
    private javax.swing.JLabel veinte;
    private javax.swing.JLabel veintiCinco;
    private javax.swing.JLabel veintiCuatro;
    private javax.swing.JLabel veintiDos;
    private javax.swing.JLabel veintiNueve;
    private javax.swing.JLabel veintiOcho;
    private javax.swing.JLabel veintiSeis;
    private javax.swing.JLabel veintiSiete;
    private javax.swing.JLabel veintiTres;
    private javax.swing.JLabel veintiUno;
    // End of variables declaration//GEN-END:variables
}