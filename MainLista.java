public class MainLista {
    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        // Spotify Yopal
        lista.insertarAlFinal("Ya Borracho");
        lista.insertarAlFinal("Mis Tres Viejas");
        lista.insertarAlFinal("Fin De Semana");
        lista.insertarAlFinal("CRAZYZ");
        lista.insertarAlFinal("Pues Que Le Hago");

        System.out.println("Historial:");
        lista.mostrar();

        
        lista.eliminarAlInicio();
        System.out.println("Después de eliminar la primera:");
        lista.mostrar();

       
        System.out.println("¿Existe Fin De Semana? " + lista.buscar("Fin De Semana"));

      
        System.out.println("Tamaño: " + lista.tamanio());

        System.out.println("Elemento en posición 1: " + lista.obtenerPorIndice(1));

       
        lista.eliminarPorValor("CRAZYZ");
        System.out.println("Después de eliminar CRAZYZ:");
        lista.mostrar();

       
        lista.invertir();
        System.out.println("Lista invertida:");
        lista.mostrar();

        
        System.out.println("¿Tiene ciclo? " + lista.detectarCiclo());
    }
}