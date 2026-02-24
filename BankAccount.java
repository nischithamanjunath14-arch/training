import java.sql.SQLOutput;

public class BankAccount {
    String AccountHolder;
    double Balance;

    public BankAccount(String AccountHolder,double Balance){
        this.AccountHolder=AccountHolder;
        this.Balance=Balance;
    }
    void deposit(double amount){
        Balance+=amount;
        System.out.println("Amount after deposit"+" "+Balance);
    }
    void withdraw(double amount){
        if(amount<=Balance) {
            Balance -= amount;
            System.out.println("Amount after Withdrawal" + " " + Balance);
        } else{
            System.out.println("Insufficient Balance");

        }

    }
    void displayBalance(){
        System.out.println("Account Holder name :"+" "+AccountHolder);
        System.out.println("Current Balance"+" "+Balance);
    }

}
 class main{
     public static void main(String [] args) {
         BankAccount B1 = new BankAccount("Sinchana",10000);
         B1.deposit(1000);
         B1.withdraw(500);
         B1.displayBalance();
         B1.withdraw(20000);


     }
 }
