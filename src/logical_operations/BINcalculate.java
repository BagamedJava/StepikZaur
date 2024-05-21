package logical_operations;

public class BINcalculate {
    public static void main(String[] args) {
        int x = 5;  // двоичной 101
        int y = 10; // в двоичной: 1010
/*   1010 | 0101(0 в начале не влияет, он добавляется, чтобы уравнять кол-во цифр)= 1111 = 15 в десятичной, оператор | дает сложение.
     1010 & 0101 (0 в начале не влияет, он добавляется, чтобы уравнять кол-во цифр) = 0000 = 0 в десятичной, оператор & дает умножение.

 */
        System.out.println(x|y);
        System.out.println(x&y);



    }
}
