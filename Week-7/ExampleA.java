interface ITestOne {
    public abstract void someFunction();
}

class one implements ITestOne {
    @Override
    public void someFunction() {
        System.out.println("Hello World");
    }
}

public class ExampleA {
    public static void main(String[] args) {
        one obj = new one();

        obj.someFunction();
    }
}
