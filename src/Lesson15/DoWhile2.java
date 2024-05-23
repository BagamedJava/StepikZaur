package Lesson15;

public class DoWhile2 {
    public static void main(String[] args) {
        int money = 100;
        do {
            System.out.println("Делайте ставку");
            System.out.println("Вы проиграли");
            money -=10;
            System.out.println(money);
        }while (money>50);
    }
}
