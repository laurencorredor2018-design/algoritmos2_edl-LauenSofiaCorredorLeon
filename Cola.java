public class Cola {

    private String[] elementos;
    private int frente;
    private int fin;
    private int capacidad;
    private int tamaño;

    public Cola(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new String[capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamaño = 0;
    }

    // enqueue – agregar (O(1))
    public boolean enqueue(String dato) {
        if (tamaño == capacidad) {
            System.out.println("Cola llena");
            return false;
        }

        fin = (fin + 1) % capacidad;
        elementos[fin] = dato;
        tamaño++;
        return true;
    }

    // dequeue – quitar (O(1))
    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Cola vacía");
            return null;
        }

        String dato = elementos[frente];
        elementos[frente] = null;
        frente = (frente + 1) % capacidad;
        tamaño--;
        return dato;
    }

    // peek – ver frente
    public String peek() {
        if (isEmpty()) return null;
        return elementos[frente];
    }

    public boolean isEmpty() {
        return tamaño == 0;
    }

    public int tamaño() {
        return tamaño;
    }

    // mostrar
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("Cola vacía");
            return;
        }

        int i = frente;
        for (int c = 0; c < tamaño; c++) {
            System.out.print(elementos[i] + " <- ");
            i = (i + 1) % capacidad;
        }
        System.out.println("fin");
    }
}