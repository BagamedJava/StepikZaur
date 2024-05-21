package Lesson13;

public class TestSwitch {
}

class Student {
    double grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(2);
//        if (st1.grade == 2) {
//            System.out.println("Студент двоешник");
//        } else if (st1.grade == 3) {
//            System.out.println("Студент троешник ");
//        } else if (st1.grade == 4) {
//            System.out.println("Студент хорошист");
//        } else if (st1.grade == 5) {
//            System.out.println("Студент отличник");
//        } else {
//            System.out.println("Оценка неверна");
//        }

        switch ((int) st1.grade) {
            case 1:
                System.out.println("Студент пиздец");
                break;
            case 2:
                System.out.println("Студент двоечник");
                break;
            case 3:
                System.out.println("Студент троечник");
                break;
            case 4:
                System.out.println("Студент хорошист");
                break;
            case 5:
                System.out.println("Студент отличник");
                break;
            default:
                System.out.println("Оценка неверна");
        }
    }
}
