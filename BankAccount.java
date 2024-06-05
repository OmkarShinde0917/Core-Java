public interface BankAccount {
    public void deposit(double amount); //Deposit method
    public void withdraw(double amount); //Withdraw method
}

class CheckingAccount implements BankAccount {//Bankaccount class property implement in this class
    private double balance;

    public CheckingAccount(double balance) {
        super();
        this.balance = balance;
    }

    public static void main(String[] args) {
        CheckingAccount check = new CheckingAccount(10000); // Making Object
        check.deposit(5000); //For Output
        check.withdraw(2000);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}