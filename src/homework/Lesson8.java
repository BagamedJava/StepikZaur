package homework;

public class Lesson8 {
static int a(int a1, int a2, int a3){
    int a = a1*a2*a3;
    System.out.println(a);
    return a;
}
static void b(int b1,int b2){
    int b = b1 / b2;
    int b3 = b1%b2;
    System.out.println("целое: " + b + " Остаток: " + b3);
}
}
class TestHW8{
    public static void main(String[] args) {
 Lesson8.a(2,2,2);
 Lesson8.b(5,2);
    }
}