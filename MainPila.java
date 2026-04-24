public class MainPila {
    public static void main(String[] args) {

        Pila pila = new Pila(10);

        // E3.5 historial navegador
        pila.push("Google");
        pila.push("YouTube");
        pila.push("Facebook");
        pila.push("Instagram");
        pila.push("WhatsApp");
        pila.push("Twitter");

        System.out.println("Historial:");
        pila.mostrar();

        System.out.println("Página actual: " + pila.peek());

        pila.pop();
        System.out.println("Después de Atrás:");
        System.out.println("Nueva actual: " + pila.peek());

        // E3.2
        System.out.println("Balanceo ({[]}): " +
            UtilPila.verificarBalanceo("({[]})"));

        // E3.3
        System.out.println("Invertir Yopal: " +
            UtilPila.invertirTexto("Yopal"));

        // E3.4
        System.out.println("Resultado postfija: " +
            UtilPila.evaluarPostfija("3 4 + 2 *"));
    }
}