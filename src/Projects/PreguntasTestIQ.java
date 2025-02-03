package Projects;

public class PreguntasTestIQ {

    private String pregunta;
    private final String[] respuestas;
    private int respCorrecta;

    
    public PreguntasTestIQ(String linea) {
        respuestas = new String[4];
        ejecutarPreguntas(linea);
    }

   
    private void ejecutarPreguntas(String linea) {
        
        String token = "@";
        
        String verificador = "Æ";
        
        String[] partes = linea.split(token);
       
        pregunta = partes[0];
        
        for (int i = 1; i < partes.length; i++) {
            
            if (partes[i].contains(verificador)) {
               
                partes[i] = partes[i].replace(verificador, "");
              
                respCorrecta = i;
            }
           
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
