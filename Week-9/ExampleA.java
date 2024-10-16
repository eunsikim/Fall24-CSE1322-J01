class myException extends Exception {
    public myException(String s) {
        super(s);
    }
}

public class ExampleA {
    public static void main(String[] args) {
        // We are going to have an array binary numbers
        // We are going to handle the array as `char`
        char[] myBinarayArray = new char[5];

        char userInput = '3';

        try {
            myBinarayArray[0] = userInput;
            if (userInput != '1' && userInput != '0') {
                throw new myException("Only enter 1 or 0");
            }
        } catch (myException e) {
            System.out.println("CUSTOM: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("BUILT-IN: " + e.getMessage());
        }

    }
}
