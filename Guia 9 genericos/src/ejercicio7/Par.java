package ejercicio7;

public class Par<T,U> {
    T elemento1;
    U elemento2;

    public Par(T elemento1, U elemento2) {
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
    }

    public void mostrarElementos (){
        System.out.println("Elemento 1: " + elemento1);
        System.out.println("Elemento 2: " + elemento2);
    }
}
