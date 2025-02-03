/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Projects.FuncionesTest;
import Views.FrmDificultad;
import Views.FrmFinal;
import Views.FrmHome;
import Views.FrmTomarPrueba;

/**
 *
 * @author PC
 */
public class Controlador {
    private FuncionesTest testIQ;
    private FrmHome menu;
    private FrmDificultad frmDificultad;
    private FrmTomarPrueba frmPrueba;
    private FrmFinal informe;
    private int acum=0;
    //IMPORTAR AQUÏ LAS VISTAS DE CADA UNO Y EL MENU

    public FuncionesTest getTestIQ() {
        return testIQ;
    }

    public void setTestIQ(FuncionesTest testIQ) {
        this.testIQ = testIQ;
    }

    public int getAcum() {
        return acum;
    }

    public void setAcum(int acum) {
        this.acum = acum;
    }

    public Controlador() {
        testIQ=new FuncionesTest();
        testIQ.crear(15, 5);
    }
    
     public void mostrarMenu(int dificultad, int tema) {
        menu = new FrmHome(this, dificultad, tema);
        menu.setVisible(true);
    }

    public void mostrarFrmDificultad(int dificultad,int tema) {
        frmDificultad = new FrmDificultad(this, dificultad,tema);
        frmDificultad.setVisible(true);
    }
    public void mostrarFrmPrueba(int dificultad,int tema) {
        frmPrueba = new FrmTomarPrueba(this, dificultad,tema);
        frmPrueba.setVisible(true);
    }
    public void mostrarFrmInforme() {
        informe = new FrmFinal(this);
        informe.setVisible(true);
    }
    
    public void cerrarVista(javax.swing.JFrame vista) {
        vista.dispose();
    }
}
