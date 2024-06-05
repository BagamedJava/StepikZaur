package Lesson18;

class Car {
}

public class MSB {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello my dear friend!");
        StringBuilder sb2 = new StringBuilder("Mutualy!");
        System.out.println(sb2.length() + " - длина sb2");
        System.out.println(sb2.charAt(4) + " - какой символ на 4 индексе в слове: " + sb2);
        System.out.println(sb2.indexOf("!"));
        System.out.println(sb2.indexOf("u", 2));
        System.out.println(sb2.substring(3, 5));
        System.out.println(sb2.append(new Car())); // Ссылка на объект класса Car

        System.out.println(sb1.insert(12, "55"));
        System.out.println(sb1.append(" " + sb2));

        StringBuilder sb10 = new StringBuilder("Hello world");
        sb10.delete(3, 6);
        System.out.println(sb10);
        sb10.reverse();
        System.out.println(sb10);

        StringBuilder sb12 = new StringBuilder("Vsem privet");
        sb12.replace(0, 4, "Pete");

        System.out.println(sb12);
        System.out.println(sb12.capacity());
    }
}
