package util;


public class Utilidades {
    public static boolean validate(String num){
        boolean band = true;
        if (num.charAt(0)== '-'){
            num = num.substring(1);
        }
        System.out.println(num);
        int cont_p = 0;
        for (int i = 0; i<num.length(); i++){
            if (!Character.isDigit(num.charAt(i)) && num.charAt(i)!='.'){
                band = false;
                break;
            } else if (num.charAt(i)=='.')
            cont_p++;
        } if (cont_p >= 2)
        band = false;
        return band; 
    }
    public static float transformStringFloat(String num){
        float resp = 0;
        if (Utilidades.validate(num)){
            resp = Float.parseFloat(num);
        }
        return resp;
    }

    public static double desviacionEstandar(double[] datos) {
        int n = datos.length;
        if (n == 0) return 0; // Evitar división por cero
                // Calcular el promedio (media)
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
