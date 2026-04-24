public class UtilArrays {

    public static double[] unirSinDuplicados(double[] a, double[] b) {

        double[] resultado = new double[a.length + b.length];
        int size = 0;

        // Agregar array A
        for (double x : a) {
            boolean existe = false;
            for (int j = 0; j < size; j++) {
                if (resultado[j] == x) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                resultado[size++] = x;
            }
        }

        // Agregar array B
        for (double x : b) {
            boolean existe = false;
            for (int j = 0; j < size; j++) {
                if (resultado[j] == x) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                resultado[size++] = x;
            }
        }

        return resultado;
    }
}