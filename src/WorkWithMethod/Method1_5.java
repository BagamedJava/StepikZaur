package WorkWithMethod;

public class Method1_5 {
    int summa(int a, int b, int c){
        int result = a + b + c;
        return result;
    }
    int sredneeArifm(int a1,int b1, int c1) {
int result2 = summa(a1, b1, c1)/3;
return result2;
    }
}
class test21{
    public static void main(String[] args) {
        Method1_5 t = new Method1_5();
        int Summa_3x_Chisel = t.summa(1,2,3);
        System.out.println(Summa_3x_Chisel);
        System.out.println(t.summa(10,3,3));// параметры метода, иногда может называться аргументами
        System.out.println(t.sredneeArifm(20,40,60));


    }
}
