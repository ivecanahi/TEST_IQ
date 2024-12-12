package Projects;

public class PreguntasTestIQ {
    // variables globales de la clase
    private String pregunta;
    private final String[] respuestas;
    private int respCorrecta;

    /**
     *
     * @param linea Constructor de clase que crea el arreglo respuestas y separa un
     *              string enviado al crear una instancia de esta clase
     */
    public PreguntasTestIQ(String linea) {
        respuestas = new String[4]; //----> inicializa el arreglo de respuestas 
        ejecutarPreguntas(linea); //----> procesa la linea 
    }

    /**
     *
     * @param linea Método que separa las partes de una linea separada por un token
     *              y asigna este contenido a los atributos de esta clase
     */
    private void ejecutarPreguntas(String linea) {
        // Token separador de cada parte del string
        String token = "@";
        // Token verificador de respuesta correcta
        // Æ alt+146
        String verificador = "Æ";
        // Arreglo con split para dividir la cadena usando un delimitador "@"
        String[] partes = linea.split(token);
        // asignamos a la variable global "pregunta" el valor contenido en partes[0]
        pregunta = partes[0];
        // Bucle for --> Para que recorra los demás elementos del arreglo 'partes' desde
        // el segundo elemento hasta el último
        for (int i = 1; i < partes.length; i++) {
            // pregunto si el String en partes[i] contiene el verificador de respuesta
            // correcta
            if (partes[i].contains(verificador)) {
                // En caso de contenerlo se remplaza el verificador del string por cadena vacia
                // (se lo elimina al token del string)
                partes[i] = partes[i].replace(verificador, "");
                // asignamos el valor de 1 a respuesta correcta
                respCorrecta = i;
            }
            // Asignamos en el arreglo respuestas[i-1] los valores contenidos en partes[i]
            // se asigna en respuestas[i-1] ya que el arreglo respuestas empieza desde 0 y
            // lo que recorremos en i es desde 1 a 4
            respuestas[i - 1] = partes[i];
        }
    }

    /**
     * 
     * @return devuelve el atributo "pregunta" a instancias fuera de la clase
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     *
     * @return devuelve el atributo "respuestas[]" a instancias fuera de la clase
     */
    public String[] getRespuestas() {
        return respuestas;
    }

    /**
     *
     * @return devuelve el atributo "respuesta correcta" a instancias fuera de la
     *         clase
     */
    public int getRespuestaCorrecta() {
        return respCorrecta;
    }
}
