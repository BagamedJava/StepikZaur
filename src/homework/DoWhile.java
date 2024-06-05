package homework;

public class DoWhile {
    static void vremya(){
        int chas = 0;
        OUTER:
        while (chas<6){
            int minuta = -1;
            MIDDLE:
            do {
                minuta++;
                if (chas > 1 && minuta % 10 == 0) {
                    break OUTER;
                }
                int secunda = 0;
                while (secunda<60){
                    if (secunda*chas>minuta){
                        continue MIDDLE;
                    }
                    System.out.println(chas+":"+minuta+":"+secunda);
                }
            }while (minuta<59);
            chas++;
        }
    }

    public static void main(String[] args) {
        vremya();
    }
}

