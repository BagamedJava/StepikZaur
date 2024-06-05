package Lesson16STRING;

public class Employee {

}
class Employe1{
    double salary;
    boolean isManager;
    Employe1(double salary, boolean isManager){
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee{
    public static void main(String[] args) {
        Employe1 e1 = new Employe1(100.5,true);

    }
}