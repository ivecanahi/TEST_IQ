package View;

import Projects.FuncionesTest;
import Projects.PreguntasTestIQ;

public class MainTest {
    public static void main(String[] args) {
        int aciertosTotales = 0;
        // Direccion de los archivos por cada tema
        String[] direcciones = { "Test_IQ/src/Extras/PreguntasRazonamientoLogico.txt",
                "Test_IQ/src/Extras/PreguntasHabilidadesResolucionProblemas.txt",
                "TEST_IQ\\src\\Extras\\RazonamientoVerbal.txt", "TEST_IQ\\src\\Extras\\PercepcionEspacial.txt",
                "TEST_IQ/src/Extras/PreguntasPercepcionyAtencion.txt" };
        // BANCO DE PREGUNTAS DE PRUEBA PARA COMPROBAR EL FUNCIONAMIENTO
        String[] preguntas = {
                "¿Qué ciudad podemos obtener con la palabra “ASIBILAR”?@a) BRUSELAS@b)Æ BRASILIA@c) BOGOTA@d) LIBANO",
                "¿Qué ciudad podemos obtener con la palabra “TANGERINA”?@a) GUATEMALA@b) PORTUGAL@c) EGIPTO@d)Æ ARGENTINA",
                "En la frase “Alpinismo de alto riesgo”, ¿Que nombre se puede formar como anagrama de UNA palabra en la oración?@a) SERGIOÆ@b) PEDRO@c) BABLO@d) ALFONSO",
                "En la frase “La armonia de la naturaleza”, ¿Que nombre se puede formar como anagrama de UNA palabra en la oración?@a) ROSARIO@b)Æ MARIANO@c) NARCIZA@d) MARTINA",
                "En la frase “He firmado un acuerdo comercial”, ¿Que pais se puede formar como anagrama de UNA palabra en la oración?@a) FINLANDIA@b) CAMERUN@c) ÆECUADOR@d)COLOMBIA" };
        // Presentar y Ejecutar las preguntas

        aciertosTotales += FuncionesTest.calculoAciertos(1, 1, 15, preguntas.length, preguntas);
        System.out.println("Aciertos de prueba" + aciertosTotales);
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < 6; j++) {
            }
        }
        // EJECUTAR FUNCIONES

    }
}
