package ClassAndObject;

public class CarTest {
    CarTest(){
        System.out.println("Объект создан!");
    }
    String color ;
    String engine ;
    int speed  ;

    public static void main(String[] args) {

        CarTest car1 = new CarTest();
        System.out.println(car1.color);
        System.out.println(car1.engine);
        System.out.println(car1.speed);
    }
}
