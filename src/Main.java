// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Eingabe with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        anotherAccount b = new anotherAccount("ben" , 0);
        Account a = new Account("Charles" , 1222.02);
        a.deposit();
        a.withdraw();
        a.checkBalance();
        a.transfer(b,20);



    }


}