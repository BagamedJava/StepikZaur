package Lesson14;

public class TestFor2 {
    static int x = 0;

    public static void S() {
        x++;
        if (x == 2) {
            x = 0;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a = 1;
        for (; a <= 10; a++, S()) {
            System.out.println(a);
        }
    }


}

