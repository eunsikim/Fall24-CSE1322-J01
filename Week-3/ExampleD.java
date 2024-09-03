public class ExampleD {
    public static void main(String[] args) {
        float f = 3.68823987325f;

        // `number` does not get rounded
        int number = (int)f;
        System.out.println(number);

        // Approach one using `Math.round()` <- Round to the next integer
        int number2 = Math.round(f);
        System.out.println(number2);
        float dollars = Math.round(f * 100) / 100f;
        System.out.println(dollars);

        // Approach 2: Using format
        System.out.format("%.2f", f);
    }
}
