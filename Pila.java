public class Pila {
    private String[] elementos;
    private int tope;
    private int capacidad;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new String[capacidad];
        this.tope = -1;
    }

    // push
    public boolean push(String elemento) {
        if (tope == capacidad - 1) {
            System.out.println("Pila llena (Stack Overflow)");
            return false;
        }
        elementos[++tope] = elemento;
        return true;
    }

    // pop
    public String pop() {
        if (isEmpty()) {
            System.out.println("Pila vacía (Stack Underflow)");
            return null;
        }
        return elementos[tope--];
    }

    // peek
    public String peek() {
        if (isEmpty()) return null;
        return elementos[tope];
    }

    public boolean isEmpty() {
        return tope == -1;
    }

    public int tamanio() {
        return tope + 1;
    }

    // E3.1 mostrar
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("Pila vacía");
            return;
        }

        for (int i = tope; i >= 0; i--) {
            System.out.println(elementos[i]);
        }
    }
}