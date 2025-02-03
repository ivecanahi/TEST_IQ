/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.Arrays;

/**
 *
 * @author IVETT
 */
public class Test_IQ {

    private String pregunta;
    private String[] respuestas;
    private int respuestaCorrecta;

    public String getPregunta() {
        return pregunta;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    

    public Test_IQ(String linea) {
        respuestas = new String[4];
        ejecutarPreguntas(linea);
    }
    
    private void ejecutarPreguntas(String linea) {
        String separador = "@";
        String anotador = "Æ";
        String[] divisiones = linea.split(separador);
        pregunta = divisiones[0];
        for (int i = 1; i < divisiones.length; i++) {
            if (divisiones[i].contains(anotador)) {
                divisiones[i] = divisiones[i].replace(anotador, "");
                respuestaCorrecta = i;
            }
            respuestas[i - 1] = divisiones[i];
        }
    }
    
    

}
