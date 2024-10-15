/*
Encapsulation:

Create a class BankAccount with private fields like accountNumber, balance, and public methods like deposit() and withdraw() to modify the balance. Use getters and setters to access the private fields.
Concepts: Encapsulation, getters, setters, access modifiers.
 */
class BankAccount{
    private String accountNumber;
    private double balance;
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(double amount){
        this.balance=amount;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public BankAccount(String accountNumber,double balance){
        this.balance=balance;
        this.accountNumber=accountNumber;
    }
    public void deposit(double amount){
        if(amount>0){
            this.balance=this.balance+amount;
            System.out.println(amount+" Deposited successfully");
            System.out.println("Available balance is : "+this.getBalance());
        }
        else{
            System.out.println("Amount should be positive");
        }

    }
    public void withdraw(double amount){
        if(amount>0 && amount<=this.balance){
            this.balance=this.balance-amount;
            System.out.println(amount+" Withdraw successfully");
            System.out.println("Available balance is : "+this.getBalance());
        }
        else if(amount>this.balance){
            System.out.println("Insufficient balance");
        }
        else{
            System.out.println("Amount should be positive");
        }

    }
}
public class OopsProb2 {
    public static void main(String[] args) {
        BankAccount acc1=new BankAccount("40664375658",50000);
        acc1.deposit(40000);
        acc1.withdraw(30000);
    }
}
