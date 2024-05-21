package p4;
import p1.A;
import p1.p2.p3.C;
import p4.p5.E;
import static  p1.p2.B.x;

public class D {
   // public static int x = 10;  В этом случае используется X из этого класса.
    public static void main(String[] args) {
        C use1 = new C(10,"Kate");
        use1.show_C();
        System.out.println(x);
        E use2 = new E("V8",100);
        use2.show_E();
    }

}
