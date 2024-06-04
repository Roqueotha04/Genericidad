package ejercicio1;

import java.util.LinkedList;

public class ListaGenerica<T> {
    LinkedList<T>listaGenerica;

    public ListaGenerica() {
        listaGenerica=new LinkedList<>();
    }

    public void agregarElemento (T elemento){
        listaGenerica.add(elemento);
    }

    public void mostrarListaGenerica (){
        for (T elemento:listaGenerica) {
            System.out.println(elemento);
        }
    }

    public void obtenerElementoEnPos (int indice){
        System.out.println(listaGenerica.get(indice));
    }
}
