
public class PilaCaracteres {
    private char[] pila = new char[20];
    private int tope = -1;

    public void push(char c) {
        tope++;            // el tope sube una posicion
        pila[tope] = c;    // el caracter queda encima de todos
        System.out.println("push('" + c + "')  -> tope = " + tope);   // solo para ver la traza
    }

    public char pop() {
        char c = pila[tope];   // se toma el caracter de arriba
        tope--;                // el tope baja: el caracter ya "salio"
        System.out.println("pop()  = '" + c + "' -> tope = " + tope);   // solo para ver la traza
        return c;
    }

    public String revertir(String texto) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            push(texto.charAt(i));
        }
        while (tope >= 0) {
            resultado += pop();
        }
        return resultado;
    }

    public static void main(String[] args) {
        PilaCaracteres p = new PilaCaracteres();
        String r = p.revertir("HOLA");
        System.out.println("Resultado: " + r);
    }
}
