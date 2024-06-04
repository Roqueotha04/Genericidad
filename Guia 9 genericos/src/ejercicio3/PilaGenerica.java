package ejercicio3;

import java.util.Stack;

public class PilaGenerica <T extends Number>{
    Stack<T>pilaGenerica;

    public PilaGenerica() {
        this.pilaGenerica = new Stack<>();
    }

    public void cargarElementosPila(T elemento){
        pilaGenerica.push(elemento);
    }

    public void mostrarPila (){
        while (!pilaGenerica.isEmpty()){
            System.out.println(pilaGenerica.pop());
        }
    }
}
