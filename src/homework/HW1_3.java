package homework;

public class HW1_3 {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;

        long i = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 - i;
        System.out.println(result);

        int a, b;
        a = 5;
        b = 8;
        int result_a = a-- - --a + ++a + a++ + a;
        System.out.println(result_a);

        int result_b = ++b - b++ + ++b - --b;
        System.out.println(result_b);
    }
}
