/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controller.AdministradorArchivos;
import Controller.Controlador;
import Projects.GestorArchivos;
import Projects.PreguntasTestIQ;
import java.io.File;

/**
 *
 * @author IVETT
 */
public class FrmTomarPrueba extends javax.swing.JFrame {
public enum dificultadLabel{PREGUNTAS_FACILES,PREGUNTAS_MEDIAS,PREGUNTAS_DIFICILES}
    public String[] direcciones = {
        "src" + File.separatorChar + "Extras" + File.separatorChar + "RazonamientoLogico" + File.separatorChar,
        "src" + File.separatorChar + "Extras" + File.separatorChar + "PercepcionEspacial" + File.separatorChar,
        "src" + File.separatorChar + "Extras" + File.separatorChar + "PercepcionyAtencion" + File.separatorChar,
        "src" + File.separatorChar + "Extras" + File.separatorChar + "RazonamientoVerbal" + File.separatorChar,
        "src" + File.separatorChar + "Extras" + File.separatorChar + "RazonamientoCuantitativo" + File.separatorChar};
    private Controlador controlador;
    private String dir;
    private PreguntasTestIQ testIq;
    private AdministradorArchivos archivo;
    private int tema;
    private int i = 0;
    private int dificultad;
    private int[] aciertos=new int[5];

    public FrmTomarPrueba(Controlador controlador, int dificultad, int tema) {
        this.dificultad = dificultad;
        initComponents();
        btnSiguiente.setEnabled(false);
        this.controlador = controlador;
        this.dir = direcciones[tema];
        this.tema = tema;
        jLabel1.setText(dificultadLabel.values()[dificultad-1].name().replace("_", " "));
        archivo = new AdministradorArchivos();
        archivo.cargarArchivo(dir + dificultad + ".txt");
        buttomGroup.add(op1);
        buttomGroup.add(op2);
        buttomGroup.add(op3);
        buttomGroup.add(op4);
        switch (dificultad) {
            case 1:
                presentarFaciles();
                break;
            case 2:
                presentarMedias();
                break;
            case 3:
                presentarDificiles();
                break;
            default:
                throw new AssertionError();
        }
    }

    private void presentarFaciles() {
        testIq = new PreguntasTestIQ(archivo.getPreguntas()[i]);
        preguntaLbl.setText("<html>" + testIq.getPregunta() + "</html>");
        String[] aux = testIq.getRespuestas();
        op1.setText(aux[0]);
        op2.setText(aux[1]);
        op3.setText(aux[2]);
        op4.setText(aux[3]);
    }

    private void presentarMedias() {
        testIq = new PreguntasTestIQ(archivo.getPreguntas()[i]);
        preguntaLbl.setText("<html>" + testIq.getPregunta() + "</html>");
        String[] aux = testIq.getRespuestas();
        op1.setText(aux[0]);
        op2.setText(aux[1]);
        op3.setText(aux[2]);
        op4.setText(aux[3]);
    }

    private void presentarDificiles() {
        testIq = new PreguntasTestIQ(archivo.getPreguntas()[i]);
        preguntaLbl.setText("<html>" + testIq.getPregunta() + "</html>");
        String[] aux = testIq.getRespuestas();
        op1.setText(aux[0]);
        op2.setText(aux[1]);
        op3.setText(aux[2]);
        op4.setText(aux[3]);
    }

    private void validarPuntaje() {
        i++;
        if (op1.isSelected() && testIq.getRespuestaCorrecta() == 1) {
            aciertos[i-1]= dificultad;

        }
        if (op2.isSelected() && testIq.getRespuestaCorrecta() == 2) {
            aciertos[i-1]= dificultad;

        }
        if (op3.isSelected() && testIq.getRespuestaCorrecta() == 3) {
            aciertos[i-1]= dificultad;

        }
        if (op4.isSelected() && testIq.getRespuestaCorrecta() == 4) {
            aciertos[i-1]= dificultad;
        }
        if(aciertos[i-1]!= dificultad){
            aciertos[i-1]= 0;
        }
        if (i < archivo.getPreguntas().length) {
            switch (dificultad) {
                case 1:
                    presentarFaciles();
                    break;
                case 2:
                    presentarMedias();
                    break;
                case 3:
                    presentarDificiles();
                    break;
                default:
                    throw new AssertionError();
            }
        } else {
            btnContinuar.setEnabled(true);
            btnSiguiente.setEnabled(false);
            op1.setEnabled(false);
            op2.setEnabled(false);
            op3.setEnabled(false);
            op4.setEnabled(false);
            i = 0;
            op1.setText(" ");
            op2.setText(" ");
            op3.setText(" ");
            op4.setText(" ");
            preguntaLbl.setText("FINALIZADA Dificultad ");
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

        buttomGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        preguntaLbl = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 600));

        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        op4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnContinuar.setText("Continuar");
        btnContinuar.setEnabled(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Preguntas Fáciles");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Captura de pantalla 2025-02-02 205707.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnContinuar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(preguntaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(op2)
                                        .addComponent(op1)
                                        .addComponent(op3)
                                        .addComponent(op4))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSiguiente)
                .addGap(198, 198, 198))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(80, 80, 80)
                .addComponent(preguntaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(op1)
                .addGap(18, 18, 18)
                .addComponent(op2)
                .addGap(18, 18, 18)
                .addComponent(op3)
                .addGap(18, 18, 18)
                .addComponent(op4)
                .addGap(26, 26, 26)
                .addComponent(btnSiguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnContinuar)
                .addGap(167, 167, 167))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        // TODO add your handling code here:
        btnSiguiente.setEnabled(true);
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        // TODO add your handling code here:
        btnSiguiente.setEnabled(true);
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        // TODO add your handling code here:
        btnSiguiente.setEnabled(true);
    }//GEN-LAST:event_op3ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        // TODO add your handling code here:
        btnSiguiente.setEnabled(true);
    }//GEN-LAST:event_op4ActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        validarPuntaje();
        buttomGroup.clearSelection();
        btnSiguiente.setEnabled(false);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        this.controlador.getTestIQ().setFilas(controlador.getAcum(), aciertos);
        this.controlador.setAcum(controlador.getAcum()+1);
        if (tema < 4) {
            this.tema = tema + 1;
            controlador.mostrarMenu(dificultad, tema);
            controlador.cerrarVista(this);
        } else {
            this.dificultad = dificultad + 1;
            controlador.mostrarMenu(dificultad, 0);
            controlador.cerrarVista(this);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.ButtonGroup buttomGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JLabel preguntaLbl;
    // End of variables declaration//GEN-END:variables
}
