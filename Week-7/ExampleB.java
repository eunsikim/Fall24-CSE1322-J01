import java.util.ArrayList;

/**
 * InnerExampleB
 */
interface IInterfaceOne {

}

class test {
    String type;
}

class one extends test implements IInterfaceOne {
    public one() {
        type = "One";
    }
}

class two extends test {
    public two() {
        type = "Two";
    }
}

public class ExampleB {
    public static void main(String[] args) {
        ArrayList<test> list = new ArrayList<>();

        list.add(new one());
        list.add(new two());
        list.add(new one());
        list.add(new one());
        list.add(new two());

        for (test t : list) {
            if (t instanceof IInterfaceOne) {
                System.out.println("This class is of type " + t.type);
            } else if (t instanceof two) {
                System.out.println("This class is of type " + t.type);
            }
        }
    }
}
