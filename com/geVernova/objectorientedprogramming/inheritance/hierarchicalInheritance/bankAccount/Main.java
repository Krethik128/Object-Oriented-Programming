package geVernova.objectorientedprogramming.inheritance.hierarchicalInheritance.bankAccount;

public class Main {
    public static void main(String[] args){
        System.out.println("\n--- Bank Account System ---");
        BankAccount savingsAccount = new SavingsAccount(2001, 50000, 4.5);
        BankAccount checkingAccount = new CheckingAccount(2002, 30000, 10000);
        BankAccount depositAccount = new FixedDepositAccount(2003, 100000, 12);

        savingsAccount.displayBalance();
        ((SavingsAccount) savingsAccount).displayAccountType();
        System.out.println();
        checkingAccount.displayBalance();
        ((CheckingAccount) checkingAccount).displayAccountType();
        System.out.println();
        depositAccount.displayBalance();
        ((FixedDepositAccount) depositAccount).displayAccountType();

    }
}
