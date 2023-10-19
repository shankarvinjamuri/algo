
import java.io.IOException;

public class MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        try {
            b.method();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class A {

    public void method() throws IOException {

    }
}

class B extends A {

    public void method() throws Exception {

    }
}
