package ejercicio8y9;

public class ClaseRandomHijo extends ClaseRandom {
    int numero2;

    public ClaseRandomHijo(int numero, String palabra, int numero2) {
        super(numero, palabra);
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "ClaseRandomHijo{" +
                "numero2=" + numero2 +
                ", numero=" + numero +
                ", palabra='" + palabra + '\'' +
                '}';
    }
}
