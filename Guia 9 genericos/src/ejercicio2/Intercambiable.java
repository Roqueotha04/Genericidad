package ejercicio2;

public class Intercambiable <T>{
    private T elemento;
    private T elemento2;

    public Intercambiable(T elemento, T elemento2) {
        this.elemento = elemento;
        this.elemento2 = elemento2;
    }

    public void intercambiarValores (){
        T elementoAux;
        elementoAux=elemento;
        elemento=elemento2;
        elemento2=elementoAux;
    }

    public void mostrar (){
        System.out.println("Elemento 1: " + elemento + " Elemento 2: " + elemento2);
    }
}
