package homework;

public class Employee {
    Employee() {
        id = 1;
        surname = "Nick";
        age = 21;
        salary = 300.0;
        department = "worker";
    }
    double salary_up(double pribavka){
        salary *=pribavka;
        return salary;
    }
    int age(){
        age *= 2;
        return age;
    }
    void show(){
        System.out.println("Name: " + surname + "\nAge: "+age+"\nSalary: " + salary + "\nDepartment: " + department);
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e2.surname = "Andrew";
        e2.salary = 228.1;
        e2.age = 23;
        e2.id = 2;
        e2.salary_up(2);
        e2.show();
        System.out.println();
        e1.salary_up(2);
        e1.show();
        System.out.println(e2.age);
    }
}