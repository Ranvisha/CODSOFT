import java.util.Scanner;
class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    public double checkBalance() {
        return balance;
    }
}
class ATM {
    private BankAccount account;
    private Scanner scanner;
    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }
    public void start() {
        System.out.println("Welcome to Hyderabad ATM ");
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful. Current balance: " + account.checkBalance());
                    } else {
                        System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
                    }
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    if (account.deposit(depositAmount)) {
                        System.out.println("Deposit succeeded! . your Current balance is: " + account.checkBalance());
                    } else {
                        System.out.println("Deposit failed. Thee amount is Invalid.");
                    }
                    break;
                case 3:
                    System.out.println("Your current balance is: " + account.checkBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using Hyderabad ATM. Have a Great Day!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000);
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
