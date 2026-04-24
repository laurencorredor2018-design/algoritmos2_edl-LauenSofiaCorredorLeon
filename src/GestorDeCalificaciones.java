public class GestorDeCalificaciones {

    private double[] calificaciones;
    private int totalEstudiantes;

    public GestorDeCalificaciones(int capacidad) {
        this.calificaciones = new double[capacidad];
        this.totalEstudiantes = 0;
    }

    // Agregar calificación
    public boolean agregar(double nota) {
        if (totalEstudiantes >= calificaciones.length) {
            System.out.println("No hay más espacio en el array.");
            return false;
        }
        calificaciones[totalEstudiantes++] = nota;
        return true;
    }

    // Obtener por índice
    public double obtener(int indice) {
        if (indice < 0 || indice >= totalEstudiantes)
            throw new IndexOutOfBoundsException("Índice inválido");
        return calificaciones[indice];
    }

    // Promedio
    public double promedio() {
        if (totalEstudiantes == 0) return 0;
        double suma = 0;
        for (int i = 0; i < totalEstudiantes; i++)
            suma += calificaciones[i];
        return suma / totalEstudiantes;
    }

    // Mayor
    public double mayor() {
        if (totalEstudiantes == 0) return 0;
        double max = calificaciones[0];
        for (int i = 1; i < totalEstudiantes; i++)
            if (calificaciones[i] > max) max = calificaciones[i];
        return max;
    }

    // Menor
    public double menor() {
        if (totalEstudiantes == 0) return 0;
        double min = calificaciones[0];
        for (int i = 1; i < totalEstudiantes; i++)
            if (calificaciones[i] < min) min = calificaciones[i];
        return min;
    }

    // Buscar nota
    public int buscarNota(double nota) {
        for (int i = 0; i < totalEstudiantes; i++)
            if (calificaciones[i] == nota) return i;
        return -1;
    }

    // Ordenar (Burbuja)
    public void ordenarBurbuja() {
        for (int i = 0; i < totalEstudiantes - 1; i++) {
            for (int j = 0; j < totalEstudiantes - 1 - i; j++) {
                if (calificaciones[j] > calificaciones[j + 1]) {
                    double temp = calificaciones[j];
                    calificaciones[j] = calificaciones[j + 1];
                    calificaciones[j + 1] = temp;
                }
            }
        }
    }

    // Contar aprobados
    public int contarAprobados(double minAprobatoria) {
        int cont = 0;
        for (int i = 0; i < totalEstudiantes; i++)
            if (calificaciones[i] >= minAprobatoria) cont++;
        return cont;
    }
}