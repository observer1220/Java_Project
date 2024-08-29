// Java Code
public class Info<T> {
    private T info;

    public T getInfo() {
        return this.info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}

// Compiler
//public class Info {
//    private Object info;
//
//    public Object getInfo() {
//        return this.info;
//    }
//
//    public void setInfo(Object info) {
//        this.info = info;
//    }
//}