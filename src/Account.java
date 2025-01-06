import java.util.Scanner;

public class Account {
    String name;
    double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much do you want to deposit?");
        System.out.println("Current amount: " + balance);
        double deposit = scan.nextDouble();
        balance = balance + deposit;
        System.out.println("New amount: " + balance);
    }

    public void withdraw() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much do you want to withdraw?");
        System.out.println("Current amount: " + balance);
        double withdraw = scan.nextDouble();

        if (withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("New amount: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void checkBalance() {
        System.out.printf("This is your current balance: ", + balance);
    }

    // Method to transfer money to another account
    public void transfer(anotherAccount receiverAccount, double transferAmount) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much do you want to withdraw?");
        System.out.println("Current amount: " + balance);

        if (transferAmount <= balance) {
            balance -= transferAmount;
            receiverAccount.balance += transferAmount;
            System.out.println("Transferred " + transferAmount + " to " + receiverAccount.name);
            System.out.println("Your new balance: " + balance);
            System.out.println(receiverAccount.name + "'s new balance: " + receiverAccount.balance);
        } else {
            System.out.println("Insufficient balance for the transfer!");
        }
    }
}


