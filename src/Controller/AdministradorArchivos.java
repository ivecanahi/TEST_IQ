/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author IVETT
 */
public class AdministradorArchivos {
    private String[] preguntas;
    private int numeroPreguntas;

    public String[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String[] preguntas) {
        this.preguntas = preguntas;
    }

    public int getNumeroPreguntas() {
        return numeroPreguntas;
    }

    public void setNumeroPreguntas(int numeroPreguntas) {
        this.numeroPreguntas = numeroPreguntas;
    }
    
     private void crear(int p){
        preguntas = new String[p];
        numeroPreguntas = p;
    }
    
    public Boolean cargarArchivo(String pathPreguntas) {
    try {
        FileReader fra = new FileReader(pathPreguntas);
        BufferedReader file_preguntas = new BufferedReader(fra);

        int numLineas = (int) file_preguntas.lines().count();
        crear(numLineas);

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
    } catch (IOException e) {
        e.printStackTrace(); // Imprime la excepción
        return false;
    }
}
}
