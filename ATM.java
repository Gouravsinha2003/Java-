import java.util.Scanner;

class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0)
            balance = initialBalance;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public boolean debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class ATM {
    private Account account;
    private Scanner input;

    public ATM(Account account) {
        this.account = account;
        input = new Scanner(System.in);
    }

    public void start() {
        int choice;
        double amount;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Your account balance is: %.2f\n", account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: ");
                    amount = input.nextDouble();
                    account.credit(amount);
                    System.out.println("Deposit successful!");
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: ");
                    amount = input.nextDouble();
                    if (account.debit(amount)) {
                        System.out.println("Withdrawal successful!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        input.close();
    }

    public static void main(String[] args) {
        Account myAccount = new Account(100.00);
        ATM atm = new ATM(myAccount);
        atm.start();
    }
}