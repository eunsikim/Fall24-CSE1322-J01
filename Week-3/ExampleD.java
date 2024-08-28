public class ExampleD {
    public static void main(String[] args) {
        float f = 3.68823987325f; //368.123...

        int number = (int)f;

        System.out.println(number);

        int number2 = Math.round(f);

        System.out.println(number2);

        float dollars = Math.round(f * 100) / 100f;
        System.out.println(dollars);
        System.out.format("%.2f", f);
    }
}
