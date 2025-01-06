public class anotherAccount {
    String name;
    double balance;

    public anotherAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void checkBalance() {
        System.out.printf("This is your current balance: ", + balance);
    }
}