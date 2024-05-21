package homework;

public class Lesson8_2 {
    static final double p = 3.14;
   static double ploshad(double radius1, double radius2){
        double ploshad = p * radius2 * radius1;
        System.out.println(ploshad);
        return ploshad;
    }
    static double okruzhnost(double radius3){
        double okruzhnost = 2 * p * radius3;
        System.out.println(okruzhnost);
        return okruzhnost;
 }
}
class Lesson8_2Test{
    public static void main(String[] args) {
        Lesson8_2.okruzhnost(3);
        Lesson8_2.ploshad(2,2);
    }
}