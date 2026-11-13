public class HistorialNavegacion {
    private String[] paginas = new String[15];

    private int tamanio = 0; // cuantas paginas hay guardadas

    public void add(String url) {
        paginas[tamanio] = url;   // se guarda despues de la ultima pagina
        tamanio++;
    }

    public void remove(String url) {
        for (int i = 0; i < tamanio; i++) {
            if (paginas[i].equals(url)) {
                // se recorren a la izquierda las paginas que estaban despues
                for (int k = i; k < tamanio - 1; k++) {
                    paginas[k] = paginas[k + 1];
                }
                paginas[tamanio - 1] = null;  // se limpia la ultima casilla
                tamanio--;
                return;
            }
        }
    }

    public void mostrarHistorial() {
        for (int i = 0; i < tamanio; i++) {
            System.out.println((i + 1) + ". " + paginas[i]);
        }
    }

    public static void main(String[] args) {
        HistorialNavegacion h = new HistorialNavegacion();
        h.add("escuela.edu");
        System.out.println("-- add(\"escuela.edu\")");
        h.mostrarHistorial();
        h.add("biblioteca.org");
        System.out.println("-- add(\"biblioteca.org\")");
        h.mostrarHistorial();
        h.add("noticias.com");
        System.out.println("-- add(\"noticias.com\")");
        h.mostrarHistorial();
        h.remove("biblioteca.org");
        System.out.println("-- remove(\"biblioteca.org\")");
        h.mostrarHistorial();
    }
}
