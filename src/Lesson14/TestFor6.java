package Lesson14;

public class TestFor6 {
    public static void time() {
       OUTER: for (int hours = 0; hours <= 23; hours++) {

           INNER: for (int minuta = 0; minuta <= 59; minuta++) {

                System.out.println(hours + ":" + minuta);
//                if (hours == 23 & minuta == 59) {
//                    System.out.println("Начался новый день\nCейчас 00:00");
//                }
                if (hours == 23 & minuta == 58){
                    break OUTER;

                }
            }

        }

    }

    public static void main(String[] args) {
        time();
    }
}
