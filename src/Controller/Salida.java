/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author IVETT
 */
public class Salida extends AbstractTableModel{
    private Controlador controlador;
    public enum temas {
        Razonamiento_Logico, Percepcion_Espacial, Percepcion_y_Atencion, Razonamiento_Verbal, Razonamiento_Cuantitativo,Total
    }
    

    public Controlador getCongrolador() {
        return controlador;
    }

    public void setCongrolador(Controlador controlador) {
        this.controlador = controlador;
    }
    
    @Override
    public int getRowCount() {
       return 6;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return temas.values()[rowIndex].name().replace("_", " ");
            case 1: return controlador.getTestIQ().getCorrectas()[rowIndex];
            default: return null;
        }
    }
    @Override
    public String getColumnName(int i) {
        switch(i){
            case 0: return "TEMAS";
            case 1: return "ACIERTOS";
            default: return null;
        }
    }
    
}
