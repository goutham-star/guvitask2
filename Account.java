package guvitask2;

public class Account {


    private double balance;

    public Account() {
        balance = 0.0;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
       
        Account acc1 = new Account();          
        Account acc2 = new Account(5000);       

        acc1.deposit(1000);
        acc1.withdraw(200);
        acc1.displayBalance();

        System.out.println("----------------");

        acc2.deposit(1500);
        acc2.withdraw(7000);
        acc2.displayBalance();
    }
}

//Output

/*Deposited: 1000.0
  Withdrawn: 200.0
  CUrrent Balance: 800.0
  ---------------------
  
 Deposited: 1500.0
 Insufficient balance!
 Current Balance: 6500.0
 */

