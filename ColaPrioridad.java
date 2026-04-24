public class ColaPrioridad {

    private static class Nodo {
        String cliente;
        Nodo siguiente;

        Nodo(String c) {
            this.cliente = c;
        }
    }

    private Nodo frente;
    private Nodo fin;

    // VIP al frente
    public void enqueueVIP(String cliente) {
        Nodo nuevo = new Nodo(cliente);

        if (frente == null) {
            frente = fin = nuevo;
        } else {
            nuevo.siguiente = frente;
            frente = nuevo;
        }
    }

    // Normal al final
    public void enqueueNormal(String cliente) {
        Nodo nuevo = new Nodo(cliente);

        if (fin == null) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public void mostrar() {
        Nodo actual = frente;
        System.out.print("Fila -> ");

        while (actual != null) {
            System.out.print("[" + actual.cliente + "] ");
            actual = actual.siguiente;
        }

        System.out.println();
    }
}