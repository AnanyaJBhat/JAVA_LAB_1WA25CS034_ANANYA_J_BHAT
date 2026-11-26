package transaction;

public class Account {

    private int accountNo;
    private double balance;

    public Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("amount deposited:" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("amount withdrawn:" + amount);
        }
    }

    public int getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }
}
package reports;

import transaction.Account;

public class TransactionReport {

    public void generateReport(Account acc) {

        System.out.println("---TRANSACTION REPORT---");

        System.out.println("AccountNo:" + acc.getAccountNo());

        System.out.println("Balance:" + acc.getBalance());
    }
}
import transaction.Account;
import reports.TransactionReport;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account(101, 10000);

        acc.deposit(10000);

        acc.withdraw(1000);

        acc.deposit(100000);

        TransactionReport report = new TransactionReport();

        report.generateReport(acc);
    }
}
