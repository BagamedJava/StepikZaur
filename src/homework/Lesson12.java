package homework;

public class Lesson12 {

    int math, economic, language, NumbStud;

    Lesson12(int math, int economic, int language, int NumbStud) {
        this.math = math;
        this.economic = economic;
        this.language = language;
        this.NumbStud = NumbStud;

    }

    public static void sravnenie(int a, int b) {


        if (a > b) {
            System.out.println("У студента 1 балл по экономике больше, чем у студента 2 балл по математике");
        } else {
            System.out.println("У студента 2 балл по математике больше, чем у студента 1 по экономике");
        }
    }

    public static void Sravnenie(int m1, int m2, int e1, int e2, int l1, int l2, int n1, int n2) {
        if (m1 == m2) {
            System.out.println("У студентов совпадает балл по математике");
        }
        else {
            System.out.println("Не совпадает балл по математике");
        }
        if (e1 == e2) {
            System.out.println("Совпадает балл по экономике");
        }
        else {
            System.out.println("Не совпадает балл по экономике");
        }
        if (l1 == l2) {
            System.out.println("Совпадает балл по языку");
        } else {
            System.out.println("Не совпадает балл по языку");
        }
        if (n1 == n2) {
            System.out.println("Совпадает номер студняка");
        }
        else {
            System.out.println("Не совпадает студняк");
        }

    }


    public static void main(String[] args) {
        Lesson12 st1 = new Lesson12(6, 7, 3, 4);
        Lesson12 st2 = new Lesson12(6, 7, 8, 9);

        Lesson12.Sravnenie(st1.math, st2.math, st1.economic, st2.economic, st1.language, st2.language, st1.NumbStud, st2.NumbStud);
    }
}
