package NoN_access_modifier;

public class FinalClass {
    int speed = 10;
     String engine = "V6"; // если это сделать final, то не получится изменить 17 поле
    String color = "blue";
    FinalClass(){}

static class Human{
        String name = "Ivan";
        FinalClass c = new FinalClass();

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.c = new FinalClass();
        h1.c = new FinalClass();
        System.out.println(h1.c.engine);
        h1.c.engine = "V8";
        System.out.println(h1.c.engine);

    }
}

}
