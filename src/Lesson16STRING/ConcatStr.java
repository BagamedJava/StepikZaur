package Lesson16STRING;

public class ConcatStr {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        String s = "ok";
        System.out.println("" +5+6+s);
        System.out.println(""+(5+6)+s);
        System.out.println(5+6+s);
        String s1 = null;
        s+="ok1";
        System.out.println(s1);
        System.out.println(s1+true);
    }
}
