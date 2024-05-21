package NoN_access_modifier;

public class Static2 {
    String name;
    int course;
    static int count;
    int a;

    public Static2(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Кол-во count: " + count);
    }

    public static void showCount() {
        System.out.println("Vsego count: " + count);
    }

    public void showInfo() {
        System.out.println("Welcome to the Static!!!");
    }

    void abc() {
        a++;
    }

    public static void main(String[] args) {
    }
}
