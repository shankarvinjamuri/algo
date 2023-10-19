
public class MethodOverloading {

    public void methodTest(Object object) {
        System.out.println("Calling object method");
    }

    public void methodTest(String object) {
        System.out.println("Calling String method");
    }

    public static void main(String args[]) {
        MethodOverloading moe = new MethodOverloading();
        moe.methodTest(null);
    }
}

//When we have two overloaded version of same method, JVM will always call most specific method.
