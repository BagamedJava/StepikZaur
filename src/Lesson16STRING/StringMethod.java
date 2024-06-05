package Lesson16STRING;

public class StringMethod {
    public static void main(String[] args) {
        String s1 = new String("privet");
        System.out.println(s1);
        int a = s1.length();
        System.out.println("Длина: " + a);
        char c = s1.charAt(3);
        System.out.println("Третий индекс: " + c);
boolean b1 = s1.startsWith("abcdefgabcd");
        System.out.println("Начинается с a: " + b1);
        boolean b2 = s1.endsWith("d");
        System.out.println("конец строки: " + b2);


    String s2 = s1.replace('p','z');
        System.out.println(s2);
String s3 = s1.replace("vet", "vivka");
        System.out.println(s3);

        String s21 = "poka";
        String s4 = s21.replace('k','k');
        System.out.println(s21==s4);

        String s5 = "privet";
        String s6 = " drug";
        System.out.println(s5.concat(s6));
    }
}
