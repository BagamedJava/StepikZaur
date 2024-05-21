package logical_operations;

public class OR {
    public static void main(String[] args) {
        // ||(или) + |(и) с выполнением след шага.

        int a,b,c;

        a = 1;
        b = 2;
        c = 3;

        boolean e = a<c || ++b==c;
        System.out.println(e); // Если на пути || встретился true, то уже true. Второе условие не выполняется
        System.out.println(b);

        boolean j = a<c | ++b==c;
        System.out.println(j);
        System.out.println(b); // Всё тоже самое, но уже второе условие выполняется, благодаря |.

        // еще один OR(или) - ^. Когда ТОЛЬКО одна переменная true, возращает true.
      boolean b1 = true;
      boolean b2 = true;
      boolean b3 = true;
      boolean b4 = false;
        System.out.println(b1^b2^b3^b4);
         // Всегда false, если нет одного true. Если ТОЛЬКО 1 true, то будет true.
    }
}
