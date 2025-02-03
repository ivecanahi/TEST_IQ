/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author mikel
 */
public class GestorArchivos {
    private String[] preguntas;
    private int cantidadPreguntas;

    public String[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String[] preguntas) {
        this.preguntas = preguntas;
    }

    public int getCantidadPreguntas() {
        return cantidadPreguntas;
    }

    public void setCantidadPreguntas(int cantidadPreguntas) {
        this.cantidadPreguntas = cantidadPreguntas;
    }
    
    private void crear(int n){
        preguntas=new String[n];
        cantidadPreguntas=n;
    }
    
    public Boolean cargarArchivo(String pathPreguntas) {
        
        try {

            FileReader fra = new FileReader(pathPreguntas);
            BufferedReader file_preguntas = new BufferedReader(fra);

            crear(Integer.parseInt(String.valueOf(file_preguntas.lines().count())));
            fra.close();
            file_preguntas.close();

            fra = new FileReader(pathPreguntas);
            file_preguntas = new BufferedReader(fra);

            String linea;

            int contador = 0;
            while ((linea = file_preguntas.readLine()) != null) {
                preguntas[contador] = linea;
                contador++;
            }
            fra.close();
            file_preguntas.close();
            
            return true;
        } catch (Exception e) {
            return false;
        }
        //return false;
    }

}
