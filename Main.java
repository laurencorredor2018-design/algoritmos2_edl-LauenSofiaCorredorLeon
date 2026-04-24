public class Main {
    public static void main(String[] args) {

        GestorDeCalificaciones g = new GestorDeCalificaciones(10);

        // 10 estudiantes (TechStore Yopal)
        g.agregar(3.5);
        g.agregar(2.8);
        g.agregar(4.0);
        g.agregar(1.9);
        g.agregar(3.2);
        g.agregar(4.5);
        g.agregar(2.5);
        g.agregar(3.8);
        g.agregar(4.2);
        g.agregar(3.0);

        System.out.println("Promedio: " + g.promedio());
        System.out.println("Mayor: " + g.mayor());
        System.out.println("Menor: " + g.menor());
        System.out.println("Aprobados (>=3.0): " + g.contarAprobados(3.0));

        System.out.println("Índice de 4.0: " + g.buscarNota(4.0));

        g.ordenarBurbuja();
        System.out.println("Notas ordenadas:");
        for (int i = 0; i < 10; i++) {
            System.out.print(g.obtener(i) + " ");
        }
    }
}