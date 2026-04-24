import java.util.Random;

public class ListaDoble {

    private NodoDoble cabeza;
    private NodoDoble cola;
    private NodoDoble actual;
    private int tamanio;

    // Agregar canción al final
    public void agregarCancion(String cancion) {
        NodoDoble nuevo = new NodoDoble(cancion);

        if (cola == null) {
            cabeza = cola = actual = nuevo;
        } else {
            nuevo.anterior = cola;
            cola.siguiente = nuevo;
            cola = nuevo;
        }
        tamanio++;
    }

    // Siguiente
    public String siguiente() {
        if (actual == null || actual.siguiente == null) {
            System.out.println("Ya estás en la última canción.");
            return null;
        }
        actual = actual.siguiente;
        return actual.cancion;
    }

    // Anterior
    public String anterior() {
        if (actual == null || actual.anterior == null) {
            System.out.println("Ya estás en la primera canción.");
            return null;
        }
        actual = actual.anterior;
        return actual.cancion;
    }

    // Eliminar actual
    public void eliminarActual() {
        if (actual == null) return;

        NodoDoble ant = actual.anterior;
        NodoDoble sig = actual.siguiente;

        if (ant != null) ant.siguiente = sig;
        else cabeza = sig;

        if (sig != null) sig.anterior = ant;
        else cola = ant;

        actual = (sig != null) ? sig : ant;
        tamanio--;
    }

    // Mostrar adelante
    public void mostrarAdelante() {
        NodoDoble temp = cabeza;
        System.out.print("Lista -> ");

        while (temp != null) {
            String marca = (temp == actual) ? "*" : "";
            System.out.print(marca + temp.cancion + marca + " <-> ");
            temp = temp.siguiente;
        }

        System.out.println("null");
    }

    // Mostrar atrás
    public void mostrarAtras() {
        NodoDoble temp = cola;
        System.out.print("Inversa -> ");

        while (temp != null) {
            System.out.print(temp.cancion + " <-> ");
            temp = temp.anterior;
        }

        System.out.println("null");
    }

    // 🔥 E5.1 insertar antes de referencia
    public void insertarAntesDe(String referencia, String nueva) {
        NodoDoble temp = cabeza;

        while (temp != null) {
            if (temp.cancion.equals(referencia)) {

                NodoDoble nuevo = new NodoDoble(nueva);

                nuevo.siguiente = temp;
                nuevo.anterior = temp.anterior;

                if (temp.anterior != null)
                    temp.anterior.siguiente = nuevo;
                else
                    cabeza = nuevo;

                temp.anterior = nuevo;

                tamanio++;
                return;
            }
            temp = temp.siguiente;
        }
    }

    // 🔥 E5.2 mover actual al inicio
    public void moverAlInicio() {
        if (actual == null || actual == cabeza) return;

        NodoDoble ant = actual.anterior;
        NodoDoble sig = actual.siguiente;

        if (ant != null) ant.siguiente = sig;
        if (sig != null) sig.anterior = ant;
        else cola = ant;

        actual.anterior = null;
        actual.siguiente = cabeza;
        cabeza.anterior = actual;
        cabeza = actual;
    }

    // 🔥 E5.3 modo aleatorio
    public String modoAleatorio() {
        if (tamanio == 0) return null;

        Random r = new Random();
        int pos = r.nextInt(tamanio);

        NodoDoble temp = cabeza;
        for (int i = 0; i < pos; i++) {
            temp = temp.siguiente;
        }

        return temp.cancion;
    }

    // 🔥 E5.4 invertir lista (CORREGIDO)
    public void invertirLista() {
        NodoDoble temp = null;
        NodoDoble actualNodo = cabeza;

        while (actualNodo != null) {
            temp = actualNodo.anterior;
            actualNodo.anterior = actualNodo.siguiente;
            actualNodo.siguiente = temp;
            actualNodo = actualNodo.anterior;
        }

        if (temp != null) {
            cabeza = temp.anterior;
        }
    }
}
