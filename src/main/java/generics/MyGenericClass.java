package generics;

public class MyGenericClass<T> {

    private T data;

    public MyGenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
