package Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import util.Utilidades;

public class PreguntasTestIQ {

    // Método para leer y presentar preguntas desde un archivo txt
    public static void ejecutarPreguntasDesdeArchivo(String rutaDeArchivo) {
        // Construir la ruta
        Path direccion = Paths.get(rutaDeArchivo);
        // Transformar path a archivo txt
        File archivo = direccion.toFile();

        // Condicion para verificar si el archivo existe
        if (archivo.exists()) {
            // Bloque para leer un archivo evitando la posibilidad de errores
            try (Scanner lectorArchivoTXT = new Scanner(archivo)) {
                // Bucle while para verificar que se lean todas las lineas del archivo txt
                while (lectorArchivoTXT.hasNextLine()) {
                    // Almacenar la linea leida en un String
                    String linea = lectorArchivoTXT.nextLine();
                    //Linea vacia que sera el espacio para mejorar el orden de las preguntas
                    System.out.println("");
                    // Condicion que lee si líneas contienen preguntas separadas por '@'
                    if (linea.contains("@")) {
                        // Arreglo con split para dividir la cadena usando un delimitador "@"
                        String[] partes = linea.split("@");
                        // Bucle for --> Para que recorra todos los elementos del arreglo 'partes' desde
                        // el primer elemento hasta el último
                        for (int i = 0; i < partes.length; i++) {
                            // Presentar cada parte del arreglo separada
                            System.out.println(partes[i]);
                        }
                        
                    } 
                   
            }} catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
        
    }
   
        // Método para identificar la respuesta correcta en una línea de texto
        public static float identificarRespuestaCorrecta(String linea) {
            //Retornar un float
            float totalAciertos = 0.0f;
            //Condicion que se usa para identificar si la respuesta contiene Æ (es respuesta correcta)
            if (linea.contains("Æ")) {
                // Arreglo con split para identificar la respuesta correcta
                String[] respuestaCorrecta = linea.split("Æ");
                //Bucle para las respuestas correctas
                for (int aciertos = 0; aciertos < respuestaCorrecta.length; aciertos++) {
                    //Transformar el string a float, usando trim para quitar los espacios
                   float valor = Utilidades.transformStringFloat(respuestaCorrecta[aciertos].trim()); 
                   //Numero de aciertos
                   totalAciertos += valor;
                }
            }
            return totalAciertos;
        }
    }
    





