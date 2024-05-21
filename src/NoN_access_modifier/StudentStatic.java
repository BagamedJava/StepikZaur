package NoN_access_modifier;

public class StudentStatic {
    String name;
    static int course;
    int i;
   static int id; // дефолт значение = 0;

    public StudentStatic(String name2) {
        name = name2;
        course++;
        id++;
        System.out.println("Студент: " + id + " создан  " + course);
    }
}

class StaticTest {
    public static void main(String[] args) {
        StudentStatic s1 = new StudentStatic("Ivan");
        StudentStatic s2 = new StudentStatic("Lesha");
        StudentStatic s3 = new StudentStatic("Andrew" );

    }

}