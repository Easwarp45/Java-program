import java.util.*;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

interface Transferable {
    void transferTo(Account target, double amount) throws InsufficientBalanceException;
}

abstract class Account implements Transferable {
    protected String accountNumber;
    protected double balance;
    protected List<Transaction> transactions;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("⚠ Invalid deposit amount.");
            return;
        }
        balance += amount;
        transactions.add(new Transaction("Deposit", amount, balance));
        System.out.println("✅ Deposited ₹" + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("⚠ Invalid withdrawal amount.");
            return;
        }
        if (balance < amount) {
            throw new InsufficientBalanceException("❌ Not enough balance.");
        }
        balance -= amount;
        transactions.add(new Transaction("Withdrawal", amount, balance));
        System.out.println("✅ Withdrawn ₹" + amount);
    }

    @Override
    public void transferTo(Account target, double amount) throws InsufficientBalanceException {
        if (target == null) {
            System.out.println("⚠ Invalid target account.");
            return;
        }
        this.withdraw(amount);
        target.deposit(amount);
        transactions.add(new Transaction("Transfer to " + target.accountNumber, amount, balance));
        System.out.println("✅ Transferred ₹" + amount + " to account " + target.accountNumber);
    }

    public void printAccountDetails() {
        System.out.println("\n📄 Account: " + accountNumber);
        System.out.println("💰 Balance: ₹" + balance);
    }

    public void printTransactionHistory() {
        System.out.println("\n📚 Transactions for " + accountNumber + ":");
        if (transactions.isEmpty()) {
            System.out.println("  No transactions yet.");
            return;
        }
        for (Transaction t : transactions) {
            System.out.println("  • " + t);
        }
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }
}

class CheckingAccount extends Account {
    public CheckingAccount(String accountNumber) {
        super(accountNumber);
    }
}

class Transaction {
    String type;
    double amount;
    double postBalance;
    Date timestamp;

    public Transaction(String type, double amount, double postBalance) {
        this.type = type;
        this.amount = amount;
        this.postBalance = postBalance;
        this.timestamp = new Date();
    }

    public String toString() {
        return timestamp + " | " + type + " ₹" + amount + " | Balance ₹" + postBalance;
    }
}

class Customer {
    String name;
    String customerId;
    Account account;

    public Customer(String name, String customerId, Account account) {
        this.name = name;
        this.customerId = customerId;
        this.account = account;
    }

    public void showSummary() {
        System.out.println("\n👤 " + name + " [" + customerId + "]");
        account.printAccountDetails();
    }
}

public class InteractiveBankingApp {
    static Scanner sc = new Scanner(System.in);
    static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n🏦 Welcome to Online Banking System");
            System.out.println("1. Create New Bank Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Funds");
            System.out.println("5. View Account Details");
            System.out.println("6. View Transaction History");
            System.out.println("0. Exit");
            System.out.print("👉 Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> depositMoney();
                case 3 -> withdrawMoney();
                case 4 -> transferFunds();
                case 5 -> showAccountSummary();
                case 6 -> viewTransactions();
                case 0 -> System.out.println("👋 Thank you for banking with us!");
                default -> System.out.println("⚠ Invalid choice.");
            }
        } while (choice != 0);
    }

    static void createAccount() {
        System.out.print("👤 Enter customer name: ");
        String name = sc.nextLine();
        System.out.print("🆔 Enter customer ID: ");
        String id = sc.nextLine();
        System.out.print("🏷️ Enter account number: ");
        String accNo = sc.nextLine();
        System.out.print("💳 Choose account type (1. Savings, 2. Checking): ");
        int type = sc.nextInt();
        sc.nextLine();

        Account account = (type == 1) ? new SavingsAccount(accNo) : new CheckingAccount(accNo);
        Customer customer = new Customer(name, id, account);
        customers.add(customer);
        System.out.println("✅ Account created successfully.");
    }

    static Customer findCustomerByAccountNumber(String accNo) {
        for (Customer c : customers) {
            if (c.account.accountNumber.equals(accNo)) return c;
        }
        return null;
    }

    static void depositMoney() {
        System.out.print("🏦 Enter account number: ");
        String accNo = sc.nextLine();
        Customer cust = findCustomerByAccountNumber(accNo);
        if (cust == null) {
            System.out.println("⚠ Account not found.");
            return;
        }
        System.out.print("💸 Amount to deposit: ₹");
        double amt = sc.nextDouble();
        cust.account.deposit(amt);
    }

    static void withdrawMoney() {
        System.out.print("🏦 Enter account number: ");
        String accNo = sc.nextLine();
        Customer cust = findCustomerByAccountNumber(accNo);
        if (cust == null) {
            System.out.println("⚠ Account not found.");
            return;
        }
        System.out.print("💸 Amount to withdraw: ₹");
        double amt = sc.nextDouble();
        try {
            cust.account.withdraw(amt);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    static void transferFunds() {
        System.out.print("📤 From Account Number: ");
        String fromAcc = sc.nextLine();
        System.out.print("📥 To Account Number: ");
        String toAcc = sc.nextLine();
        Customer from = findCustomerByAccountNumber(fromAcc);
        Customer to = findCustomerByAccountNumber(toAcc);

        if (from == null || to == null) {
            System.out.println("⚠ One or both accounts not found.");
            return;
        }
        System.out.print("💸 Amount to transfer: ₹");
        double amt = sc.nextDouble();
        try {
            from.account.transferTo(to.account, amt);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

    static void showAccountSummary() {
        System.out.print("🔍 Enter account number: ");
        String accNo = sc.nextLine();
        Customer cust = findCustomerByAccountNumber(accNo);
        if (cust != null) {
            cust.showSummary();
        } else {
            System.out.println("⚠ Account not found.");
        }
    }

    static void viewTransactions() {
        System.out.print("📒 Enter account number: ");
        String accNo = sc.nextLine();
        Customer cust = findCustomerByAccountNumber(accNo);
        if (cust != null) {
            cust.account.printTransactionHistory();
        } else {
            System.out.println("⚠ Account not found.");
        }
    }
}