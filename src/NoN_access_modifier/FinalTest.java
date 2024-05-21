package NoN_access_modifier;

public class FinalTest {
    public final int a; // = 10;

    FinalTest() {
        a = 20;
    }

    public void abc(final short s) {
        final byte b;
        b = 10;
        System.out.println(s + b);
    }

    public static void main(String[] args) {
        FinalTest gex = new FinalTest();

// gex.a *= 2; Ошибка компилятора. Final = константа = финальное значение, которое нельзя изменить. У final переменных нет дефолт значений
        System.out.println(gex.a);
    }

}