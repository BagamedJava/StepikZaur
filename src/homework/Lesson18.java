package homework;

public class Lesson18 {

    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        boolean x = false;
        if (sb2==sb1){
            return x;
        }
        else{
            sb1.equals(sb2);
            return x;
        }
    }

    public static void main(String[] args) {
        System.out.println(Lesson18.ravenstvo(new StringBuilder("Hello"), new StringBuilder("Good Bye")));
    }
}
