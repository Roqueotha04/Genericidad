package ejercicio8y9;

public class ClaseRandomNieto extends ClaseRandomHijo {
    int numero3;
    public ClaseRandomNieto(int numero, String palabra, int numero2) {
        super(numero, palabra, numero2);
        this.numero3=0;
    }

    @Override
    public String toString() {
        return "ClaseRandomNieto{" +
                "numero3=" + numero3 +
                ", numero2=" + numero2 +
                ", numero=" + numero +
                ", palabra='" + palabra + '\'' +
                '}';
    }
}
