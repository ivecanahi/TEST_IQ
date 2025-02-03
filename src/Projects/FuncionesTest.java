package Projects;

import java.util.Random;
import java.util.Scanner;

public class FuncionesTest {

    private int[][] aciertos;
    private int[] correctas;
    private int puntos;

    public int[] getCorrectas() {
        return correctas;
    }

    public void setCorrectas(int[] correctas) {
        this.correctas = correctas;
    }

    public int[][] getAciertos() {
        return aciertos;
    }

    public void setAciertos(int[][] aciertos) {
        this.aciertos = aciertos;
    }

    public void setFilas(int fila, int[] aciertos) {
        this.aciertos[fila] = aciertos;
    }

    public void crear(int temasDificultad, int preguntas) {
        this.aciertos = new int[temasDificultad][preguntas];
        this.correctas = new int[preguntas + 1];
    }

    public void llenarCorrectas() {
        int cont = 0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (aciertos[i][j] != 0) {
                    correctas[cont] = correctas[cont] + 1;
                }
                puntos += aciertos[i][j];
            }
            cont++;
            if (cont == 5) {
                cont = 0;
            }
        }
        for (int i = 0; i < 5; i++) {
            correctas[5] += correctas[i];
        }
    }

    /**
     * genera un pequeño informe de los aciertos obtenidos
     *
     * @param totalAciertos aciertos totales obtenidos en el transcurso del test
     * @param numeroPreguntas cantidad de preguntas evaluadas en el test
     */
    public static void resumenTest(int totalAciertos, int numeroPreguntas) {
        // Cálculo de Media
        float totalMedia;
        totalMedia = (float) totalAciertos / numeroPreguntas;
        System.out.println("La media total de sus aciertos es de: " + totalMedia);

        // Cálculo Porcentaje
        float porcentajeTotal = (float) (totalAciertos * 100) / (numeroPreguntas);
        System.out.println("Su porcentaje de aciertos es de: " + porcentajeTotal);
    }

    public Float puntajeTest() {
        float total = 0.0f;
        total = ((puntos - 92) / 8.91f) * 15 + 100;
        return total;
    }
    /**
     *
     * @param min rango minimo para generar un aleatorio
     * @param max rango maximo para generar un aleatorio
     * @return un entero aleatorio dentro de un rango dado
     */
    public static int generarAleatorio(int min, int max) {
        // Crear un objeto random
        Random random = new Random();
        // Se suma 1 y min para que elija entre el rango de numero max y numero min
        return random.nextInt(((max - min) + 1) + min);
        // Retornamos el numero elegido de manera aleatoria
    }

    /**
     *
     * @param datos datos de pruebas tomadas
     * @return desviacion estandar de los resultados obtenidos
     */
    public static double desviacionEstandar(double[] datos) {
        int n = datos.length;
        if (n == 0) {
            return 0; // Evitar división por cero
        }        // Calcular el promedio (media)
        double suma = 0;
        for (double dato : datos) {
            suma += dato;
        }
        double promedio = suma / n;

        // Calcular la suma de las diferencias al cuadrado
        double sumaDiferencias = 0;
        for (double dato : datos) {
            sumaDiferencias += Math.pow(dato - promedio, 2);
        }
        // Calcular la desviación estándar
        return Math.sqrt(sumaDiferencias / n);
    }

}
