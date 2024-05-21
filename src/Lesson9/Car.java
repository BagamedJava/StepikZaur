package Lesson9;

public class Car {

    String color;
    int a = 10;
    String engine;
    static int count;

    Car(String color2, String engine2) {
        count++;
        color = color2;
        engine = engine2;
    }

    public void ShowColor() {
        System.out.println("Цвет машины: " + color);
    }

    public void ChangeColor(String color3) {
        System.out.println("Цвет машины изменился");
        int cena = 5000;
        color = color3;
        cena += 1000;
    }

}
