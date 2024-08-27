// Invert a char array
public class ExampleA {

    public static char[] flip(char[] array){
        char[] res = new char[array.length];

        for(int i = 0, j = array.length - 1; i < array.length; i++,j--){
            res[i] = array[j];
        }

        return res;
    }

    public static void main(String[] args) {
        char[] array = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

        char[] flipArray = flip(array);

        for(char c : flipArray){
            System.out.print(c);
        }
    }
}