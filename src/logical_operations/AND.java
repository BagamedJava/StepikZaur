package logical_operations;

public class AND {
    public static void main(String[] args) {
        // &&(и) + &(и) с выполнением след шага.

        int a,b,c;

        a = 1;
        b = 2;
        c = 3;

        boolean e = a>c && ++b==c;
        System.out.println(e); // Если есть один false в &&, то результат false. Второе условие не выполняется
        System.out.println(b);

        boolean j = a>c & ++b==c;
        System.out.println(j);
        System.out.println(b); // Всё тоже самое, но уже второе условие выполняется, благодаря &.
    }
}
