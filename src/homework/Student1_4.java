package homework;

public class Student1_4 {
    String last_name, first_name;
    int YOS; // Год обучения
    int math, economic, language, NumbStud;

    double sredArifo4enka(Student1_4 st){
        double SredArif =(st.math + st.economic + st.language ) / 3;
        System.out.println("Средняя оценка " + st.first_name + ": " + SredArif );
        return SredArif;
    }

}

class StudentTest {
    public static void main(String[] args) {


        Student1_4 Andrew = new Student1_4();
        Andrew.last_name = "Ivanov";
        Andrew.first_name = "Andrew";
        Andrew.YOS = 2024;
        Andrew.math = 3;
        Andrew.economic = 3;
        Andrew.language = 5;
        Andrew.NumbStud = 1; // Номер студенческого
Andrew.sredArifo4enka(Andrew);
        System.out.println("Полное Имя и фамилия Андрея: " + Andrew.last_name + " " + Andrew.first_name + "\nСредний балл Андрея по экзаменам: " + (Andrew.economic + Andrew.language + Andrew.math) / 3.0 + "\nОн имеет номер студенческого: " + Andrew.NumbStud + "\nОн обучался в " + Andrew.YOS + " году.\n");


        Student1_4 Luiza = new Student1_4();
        Luiza.last_name = "Ivanova";
        Luiza.first_name = "Luiza";

        Luiza.YOS = 2021;
        Luiza.math = 4;
        Luiza.economic = 5;
        Luiza.language = 4;
        Luiza.NumbStud = 2; // Номер студенческого
        Luiza.sredArifo4enka(Luiza);
        System.out.println("Полное Имя и фамилия Луизы: " + Luiza.last_name + " " + Luiza.first_name + "\nСредний балл Луизы по экзаменам: " + (Luiza.economic + Luiza.language + Luiza.math) / 3.0 + "\nОна имеет номер студенческого: " + Luiza.NumbStud + "\nОна обучалась в " + Luiza.YOS + " году.\n");

        Student1_4 Artem = new Student1_4();
        Artem.last_name = "Aramakov";
        Artem.first_name = "Artem";
        Artem.YOS = 2019;
        Artem.math = 3;
        Artem.economic = 3;
        Artem.language = 3;
        Artem.NumbStud = 3; // Номер студенческого
        Artem.sredArifo4enka(Artem);
        System.out.println("Полное Имя и фамилия Артема: " + Artem.last_name + " " + Artem.first_name + "\nСредний балл Артема по экзаменам: " + (Artem.economic + Artem.language + Artem.math) / 3.0 + "\nОн имеет номер студенческого: " + Artem.NumbStud + "\nОн обучался в " + Artem.YOS + " году.\n");


    }
}
