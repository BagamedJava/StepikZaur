package homework;

public class MonthSwitch {
    int month;

    public void ShowMonth() {
        
        month = 3;
    }

    public static void main(String[] args) {
        MonthSwitch m1 = new MonthSwitch();
        m1.ShowMonth();
        switch (m1.month) {
            case 1:
                System.out.println("В Январе 2015 года был 31 день");
                break;
            case 2:
                System.out.println("В феврале 2015 года было 28 дней");
                break;
            case 3:
                System.out.println("В марте 2015 года был 31 день");
                break;
            case 4:
                System.out.println("В апреле 2015 года было 30 дней");
                break;
            case 5:
                System.out.println("В мае 2015 года был 31 день");
                break;
            case 6:
                System.out.println("В июне 2015 года было 30 дней");
                break;
            case 7:
                System.out.println("В июле 2015 года был 31 день");
                break;
            case 8:
                System.out.println("В августе 2015 года было 31 дней");
                break;
            case 9:
                System.out.println("В сентябре 2015 года был 30 день");
                break;
            case 10:
                System.out.println("В октябре 2015 года было 31 дней");
                break;
            case 11:
                System.out.println("В ноябре 2015 года был 30 день");
                break;
            case 12:
                System.out.println("В декабре 2015 года был 31 день");
                break;
            default:
                System.out.println("Такого месяца нет");
                break;


        }


    }
}
