package ejercicio8y9;

public class ClaseRandom {
    int numero;
    String palabra;

    public ClaseRandom(int numero, String palabra) {
        this.numero = numero;
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "ClaseRandom{" +
                "numero=" + numero +
                ", palabra='" + palabra + '\'' +
                '}';
    }
}
