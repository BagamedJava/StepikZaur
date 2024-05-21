package ClassAndObject;

public class BankAccount {
    int id;
    String name;
    double balance;
double popolnenie(double popolnenie_Scheta){
    balance+=popolnenie_Scheta;
    return  balance;
}
double snyatie(double snyatie_so_Scheta){
    balance-=snyatie_so_Scheta;
    return balance;
}


}

class BankAccountTest {
    public static void main(String[] args) {


        BankAccount MyAccount = new BankAccount();
        MyAccount.id = 1;
        MyAccount.name = "Yaroslav";
        MyAccount.balance = 228.3;
MyAccount.popolnenie(300);
MyAccount.snyatie(228.3);
        BankAccount HisAccount = new BankAccount();
        HisAccount.id = 2;
        HisAccount.name = "Ekaterina";
        HisAccount.balance = 1488.231;


        BankAccount HerAccount = new BankAccount();
        HerAccount.id = 3;
        HerAccount.name = "Mama";
        HerAccount.balance = 1234_5679.98;

        BankAccount YourAccount = new BankAccount();
        YourAccount.name = "Papa";
        YourAccount.id = 4;
        YourAccount.balance = 50_000.123;

        boolean b = true;
        if (b) {
            System.out.println("Данные о моем аккаунте: \n1.ID: " + MyAccount.id + "\n2.Имя аккаунта: " + MyAccount.name + "\n3.Баланс аккаунта: " + MyAccount.balance + "$");
            System.out.println();
            System.out.println("Данные о Кати аккаунте: \n1.ID: " + HisAccount.id + "\n2.Имя аккаунта: " + HisAccount.name + "\n3.Баланс аккаунта: " + HisAccount.balance + "$");
            System.out.println();
            System.out.println("Данные о Мамы аккаунте: \n1.ID: " + HerAccount.id + "\n2.Имя аккаунта: " + HerAccount.name + "\n3.аланс аккаунта: " + HerAccount.balance + "$");
            System.out.println();
            System.out.println("Данные о Папы аккаунте: \n1.ID: " + YourAccount.name + "\n2.Имя аккаунта: " + YourAccount.id + "\n3.Баланс аккаунта: " + YourAccount.balance + "$");
        }
    }
}