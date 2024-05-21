package Lesson6;

public class Employee {
    Employee(int id2, String surname2, int age2) {
       this(id2,surname2,age2,0.0,null);
    }

   public Employee(String surname3, int age3) {
       this(0,surname3,age3,0.0,null);
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    int id, age;
    String surname, department;
    double salary;
}

//class EmployeeTest {
//    public static void main(String[] args) {
//        Employee emp = new Employee(1, 25, "Ivanov");
//        Employee candidat = new Employee("Matew", 43);
//        Employee candidat2 = new Employee(12, "Andrew");
//        Employee candidat3 = new Employee("Petrow", 30);
//    }
//}