package exception.edgescenarios;

class MyResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw new RuntimeException("Exception from close()");
    }
}

public class SuppressedException {
    public static void main(String[] args) throws Exception {
        try ( MyResource r = new MyResource()) {
            throw new RuntimeException("Exception from try");
        }
    }
}
