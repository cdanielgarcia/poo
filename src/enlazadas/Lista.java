package enlazadas;

/**
 *
 * @author Daniel
 */
public class Lista {

    private Nodo cabeza = null;
    private int longitud = 0;

    private class Nodo {

        public Libro libro;
        public Nodo siguiente = null;

        public Nodo(Libro libro) {
            this.libro = libro;
        }

    }

    public void insertarPrincipio(Libro libro) {
        Nodo nodo = new Nodo(libro);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    public void insertarFinal(Libro libro) {
        Nodo nodo = new Nodo(libro);
        Nodo puntero = cabeza;
         if (cabeza == null) {
            cabeza = nodo;
        } else {
        while (puntero.siguiente != null) {
            puntero = puntero.siguiente;
        }
        puntero.siguiente = nodo;
        }
        longitud++; 
    }

    public void insertarDespues(int n, Libro libro) {
        Nodo nodo = new Nodo(libro);
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            Nodo puntero = cabeza;
            int contador = 0;
            while (contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            nodo.siguiente = puntero.siguiente;
            puntero.siguiente = nodo;
        }
        longitud++;
    }

    public Libro obtener(int n) {
        if (cabeza == null) {
            return null;
        } else {
            Nodo puntero = cabeza;
            int contador = 0;
            while (contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            if (contador != n){
                return null;
            }else{
                return puntero.libro;
            }
        }
    }
    
    public int contar(){
       return longitud;
    }
    
    public void eliminarPrincipio(){
        if (cabeza != null){
            Nodo primero = cabeza;
            cabeza = primero.siguiente;
            primero.siguiente = null;
            longitud--;
        }
    }
}