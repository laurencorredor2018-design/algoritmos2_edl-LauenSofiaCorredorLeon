public class MainCola {
    public static void main(String[] args) {

        SistemaTurnos cola = new SistemaTurnos();

        // Llegan 8 clientes
        for (int i = 1; i <= 8; i++) {
            cola.enqueue("Cliente " + i);
        }

        cola.mostrarFila();

        // Se atienden de 2 en 2
        int ronda = 1;

        while (!cola.isEmpty()) {
            System.out.println("\n--- Ronda " + ronda + " ---");

            cola.dequeue();
            cola.dequeue();

            cola.mostrarFila();
            ronda++;
        }
    }
}