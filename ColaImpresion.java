public class ColaImpresion {
    private String[] documentos = new String[10];

    private int frente = 0;
    private int fin = -1; // fin indica el ultimo documento encolado

    // enqueue
    public void encolar(String doc) {
        fin++;                   // se abre lugar al final de la fila
        documentos[fin] = doc;   // el documento se forma al final
        System.out.println("encolar(\"" + doc + "\") -> frente: " + documentos[frente]);   // solo para ver la traza
    }

    // dequeue
    public String desencolar() {
        String doc = documentos[frente];  // sale el que esta al frente
        frente++;                         // el siguiente pasa al frente
        return doc;
    }

    public void imprimirTodo() {
        while (frente <= fin) {
            // en el esqueleto decia dequeue(), pero el metodo se llama desencolar()
            System.out.println("Imprimiendo: " + desencolar());
        }
    }

    public static void main(String[] args) {
        ColaImpresion cola = new ColaImpresion();
        cola.encolar("Tarea");
        cola.encolar("Examen");
        cola.encolar("Boleta");
        cola.imprimirTodo();
    }
}
