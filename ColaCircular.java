public class ColaCircular {

    private String[] datos;
    private int frente;
    private int fin;
    private int tamaño;
    private int capacidad;

    public ColaCircular(int capacidad) {
        this.capacidad = capacidad;
        this.datos = new String[capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamaño = 0;
    }

    public boolean enqueue(String x) {
        if (tamaño == capacidad) return false;

        fin = (fin + 1) % capacidad;
        datos[fin] = x;
        tamaño++;
        return true;
    }

    public String dequeue() {
        if (tamaño == 0) return null;

        String x = datos[frente];
        frente = (frente + 1) % capacidad;
        tamaño--;
        return x;
    }
}