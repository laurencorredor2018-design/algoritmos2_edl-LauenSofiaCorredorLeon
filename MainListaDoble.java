public class MainListaDoble {
    public static void main(String[] args) {

        ListaDoble lista = new ListaDoble();

        // Canciones llaneras
        lista.agregarCancion("El Campesino");
        lista.agregarCancion("Fiesta en Elorza");
        lista.agregarCancion("Ay mi llanura");
        lista.agregarCancion("Laguna vieja");
        lista.agregarCancion("Pajarillo");
        lista.agregarCancion("Quisiera ser golondrina");
        lista.agregarCancion("con lo mio no se meta");

        System.out.println("Lista inicial:");
        lista.mostrarAdelante();

        // avanzar 3 veces
        lista.siguiente();
        lista.siguiente();
        lista.siguiente();

        // retroceder 1
        lista.anterior();

        // eliminar actual
        lista.eliminarActual();

        System.out.println("\nDespués de eliminar:");
        lista.mostrarAdelante();

        System.out.println("\nLista inversa:");
        lista.mostrarAtras();

        // aleatorio
        System.out.println("\nCanción aleatoria: " + lista.modoAleatorio());
    }
}