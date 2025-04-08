package geVernova.classesandobject.atm;

public class ATM {
    public static void main(String[] args){
        BankAccount account=new BankAccount("Krethik","MKPK54321",50000);
        account.displayBalance();
    }
}
