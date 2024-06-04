package ejercicio5;

public class ClaseHijoGenerica <T extends ClasePadreGenerica<?>> extends ClasePadreGenerica<T> {

    public ClaseHijoGenerica(T data) {
        super(data);
    }



}
