package Lesson16STRING;

public class Еуые8 {
    public static void main(String[] args) {
        String s1 = "Hello! My name is Yaroslav, i'm from Russia. How are you?";
              String s2 = s1.toUpperCase();
              char c1;
              char c2;
        for (int i = 0; i <s1.length();i++){
            c1=s1.charAt(i);
            c2=s2.charAt(i);
            if (c1!='.' && c1!='!' && c1!= ' ' && c1!= ',' && c1!= '?' && c1!='\'' && c1==c2){
                System.out.println();
                System.out.println(c1);
                continue;
            }

        }


    }
}
