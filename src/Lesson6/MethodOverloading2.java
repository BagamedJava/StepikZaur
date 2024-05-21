package Lesson6;

public class MethodOverloading2 {
    int sum(int a1,int b1){ // overloading
        return a1+b1;
    }
    String sum(String a, String b){ // overloading
        return a+b;
    }

//    protected void sum(int q,int b){
//        System.out.println("PRIVET ");}


}
class MethodOverloading2Test{
    public static void main(String[] args) {
        MethodOverloading2 mO2 = new MethodOverloading2();
        int e = mO2.sum(1,1);
        System.out.println(e);
        String s = mO2.sum("Privet","Hello");

        System.out.println(s);
    }
}