package homework;

public class Student6 {
    Student6(int id1, int YOS1, int math1, int economic1, int language1) {
        id = id1;
        YOS = YOS1;
        math = math1;
        economic = economic1;
        language = language1;

    }

    Student6(int id2, int YOS2, int math2) {
        this(id2,YOS2,math2,0,0);
    }

    Student6() {
        this(0,0,0,0,0);
    }

    int id;
    int YOS; // Год обучения
    int math, economic, language, NumbStud;
}

class Student6Test {
    public static void main(String[] args) {
        Student6 st1 = new Student6(1,1,1,1,1);
        Student6 st2 = new Student6(2,2,2);
        Student6 st3 = new Student6(5,5,5,5,5);
        st3.id = 1;
        st3.YOS =2;
        st3.math = 3;
        st3.economic = 4;
        st3.language = 5;
        System.out.println(st1.id + " " + st1.YOS + " " + st1.math + " " + st1.economic + " " + st1.language);
        System.out.println(st2.id + " " + st2.YOS + " " + st2.math + " "+st2.economic + " " + st2.language );
        System.out.println(st3.id + " " + st3.YOS + " " + st3.math + " " + st3.economic + " " + st3.language);

    }
}