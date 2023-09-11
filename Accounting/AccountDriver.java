import java.util.ArrayList;
import java.util.Scanner;

public class AccountDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accountList = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add account");
            System.out.println("2. Display individual account");
            System.out.println("3. Display all accounts");
            System.out.println("4. Deposit to individual account");
            System.out.println("5. Withdraw from individual account");
            System.out.println("6. Financial Year ending");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addAccount(scanner, accountList);
                    break;
                case 2:
                    displayIndividualAccount(scanner, accountList);
                    break;
                case 3:
                    displayAllAccounts(accountList);
                    break;
                case 4:
                    depositToIndividualAccount(scanner, accountList);
                    break;
                case 5:
                    withdrawFromIndividualAccount(scanner, accountList);
                    break;
                case 6:
                    financialYearEnding(accountList);
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to add an account to the ArrayList
    private static void addAccount(Scanner scanner, ArrayList<Account> accountList) {
        System.out.print("Enter customer ID: ");
        String custID = scanner.next();
        System.out.print("Enter customer name: ");
        String custName = scanner.next();
        System.out.print("Enter customer address: ");
        String custAddress = scanner.next();
        System.out.print("Enter customer phone: ");
        String custPhone = scanner.next();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        Account account = new Account(custID, custName, custAddress, custPhone, balance);
        accountList.add(account);

        System.out.println("Account added successfully.");
    }

    // Method to display an individual account
    private static void displayIndividualAccount(Scanner scanner, ArrayList<Account> accountList) {
        System.out.print("Enter customer ID: ");
        String custID = scanner.next();

        for (Account account : accountList) {
            if (account.getCustID().equals(custID)) {
                System.out.println(account);
                return;
            }
        }

        System.out.println("Account not found.");
    }

    // Method to display all accounts
    private static void displayAllAccounts(ArrayList<Account> accountList) {
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    // Method to deposit to an individual account
    private static void depositToIndividualAccount(Scanner scanner, ArrayList<Account> accountList) {
        System.out.print("Enter customer ID: ");
        String custID = scanner.next();
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();

        for (Account account : accountList) {
            if (account.getCustID().equals(custID)) {
                account.add(amount);
                System.out.println("Deposit successful.");
                return;
            }
        }

        System.out.println("Account not found.");
    }

    // Method to withdraw from an individual account
    private static void withdrawFromIndividualAccount(Scanner scanner, ArrayList<Account> accountList) {
        System.out.print("Enter customer ID: ");
        String custID = scanner.next();
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();

        for (Account account : accountList) {
            if (account.getCustID().equals(custID)) {
                if (account.getBalance() >= amount) {
                    account.subtract(amount);
                    System.out.println("Withdrawal successful.");
                } else {
                    System.out.println("Insufficient balance.");
                }
                return;
            }
        }

        System.out.println("Account not found.");
    }

    // Method to apply yearly interest to all accounts
    private static void financialYearEnding(ArrayList<Account> accountList) {
        for (Account account : accountList) {
            account.yearlyInterest();
        }
        System.out.println("Yearly interest applied to all accounts.");
    }
}
