package ejercicio5;

public class ClasePadreGenerica <T>{
    private T data;

    public ClasePadreGenerica(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
