import java.util.Stack;

// Implementación de cola usando dos pilas
public class ColaConPilas {

    private Stack<String> entrada = new Stack<>();
    private Stack<String> salida = new Stack<>();

    // enqueue: se apila en entrada
    public void enqueue(String x) {
        entrada.push(x);
    }

    // dequeue: se invierte el orden pasando a salida
    public String dequeue() {
        if (salida.isEmpty()) {
            while (!entrada.isEmpty()) {
                salida.push(entrada.pop());
            }
        }

        if (salida.isEmpty()) return null;
        return salida.pop();
    }
}