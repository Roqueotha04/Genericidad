package ejercicio8y9;

import java.util.ArrayList;

public class Contenedor<T extends ClaseRandomHijo> {
    ArrayList<T>elementos;

    public Contenedor() {
        this.elementos = new ArrayList<>();
    }
    public void agregarElemento (T elemento){
        elementos.add(elemento);
    }
    public void mostrar (){
        for (T elemento: elementos) {
            System.out.println(elemento.toString());
        }
    }


}
