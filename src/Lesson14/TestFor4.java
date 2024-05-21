package Lesson14;

public class TestFor4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                System.out.println();
                continue;
            }
            System.out.println(i);
        }
    }
}
