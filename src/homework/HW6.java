package homework;

public class HW6 {
    int sum() {
        int result = 0;
        System.out.println("" + result);
        return result;
    }

    int sum(int a) {
        int result1 = a;
        System.out.println("" + result1);
        return result1;
    }

    int sum(int a, int b) {
        int result2 = a + b;
        System.out.println("" + result2);
        return result2;
    }

    int sum(int a, int b, int c) {
        int result3 = a + b + c;
        System.out.println("" + result3);
        return result3;
    }

    int sum(int a, int b, int c, int d) {
        int result4 = a + b + c + d;
        System.out.println("" + result4);
        return result4;
    }

    int sum(int a, int b, int c, int d, int e) {
        int result5 = a + b + c + d + e;
        System.out.println("" + result5);
        return result5;
    }
}

    class HW6Test {
        public static void main(String[] args) {
            HW6 go = new HW6();
            go.sum();
            go.sum(3);
            go.sum(12, 32);
            go.sum(198, 491, 123);
            go.sum(11, 11, 11, 11);
            go.sum(1, 1, 1, 1, 1);
        }
}