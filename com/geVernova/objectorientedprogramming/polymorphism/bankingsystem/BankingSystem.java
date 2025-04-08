package geVernova.objectorientedprogramming.polymorphism.bankingsystem;

public class BankingSystem {
    public static void main(String[] args) {
        // Polymorphism: treating different accounts as BankAccount type
        BankAccount savingsAccount = new SavingsAccount(1001, "Stuti", 50000);
        BankAccount currentAccount = new CurrentAccount(1002, "Sam", 100000);

        // Perform operations
        savingsAccount.deposit(10000);
        savingsAccount.calculateInterest();

        currentAccount.withdraw(30000);
        currentAccount.calculateInterest();

        // instanceof check to access Loanable methods safely
        if (savingsAccount instanceof Loanable) {
            ((Loanable) savingsAccount).applyForLoan();
            ((Loanable) savingsAccount).calculateLoanEligibility();
        }

        if (currentAccount instanceof Loanable) {
            ((Loanable) currentAccount).applyForLoan();
            ((Loanable) currentAccount).calculateLoanEligibility();
        }
    }
}

