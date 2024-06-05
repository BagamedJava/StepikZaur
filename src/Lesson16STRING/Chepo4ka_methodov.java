package Lesson16STRING;

public class Chepo4ka_methodov {
    public static void main(String[] args) {
        String s1 = "Hello World!";
        String s2 = "Uraaaaaaa!!!";
        String s3 = s1.concat(s2).trim().replace("Uraaaaaaa","Ураааа").substring(6,10);
        System.out.println(s1.substring(s1.indexOf('W')));
        // объекты класса String is immutable
    }
}
