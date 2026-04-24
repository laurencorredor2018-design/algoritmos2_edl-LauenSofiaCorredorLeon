public class UtilPila {

    // E3.2 balanceo
    public static boolean verificarBalanceo(String exp) {
        Pila pila = new Pila(exp.length());

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                pila.push(String.valueOf(c));
            } else if (c == ')' || c == '}' || c == ']') {
                if (pila.isEmpty()) return false;

                char top = pila.pop().charAt(0);

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    // E3.3 invertir texto
    public static String invertirTexto(String texto) {
        Pila pila = new Pila(texto.length());

        for (int i = 0; i < texto.length(); i++) {
            pila.push(String.valueOf(texto.charAt(i)));
        }

        String resultado = "";
        while (!pila.isEmpty()) {
            resultado += pila.pop();
        }

        return resultado;
    }

    // E3.4 postfija
    public static int evaluarPostfija(String exp) {
        Pila pila = new Pila(exp.length());
        String[] tokens = exp.split(" ");

        for (String t : tokens) {
            if (t.matches("\\d+")) {
                pila.push(t);
            } else {
                int b = Integer.parseInt(pila.pop());
                int a = Integer.parseInt(pila.pop());

                int r = 0;
                switch (t) {
                    case "+": r = a + b; break;
                    case "-": r = a - b; break;
                    case "*": r = a * b; break;
                    case "/": r = a / b; break;
                }

                pila.push(String.valueOf(r));
            }
        }

        return Integer.parseInt(pila.pop());
    }
}