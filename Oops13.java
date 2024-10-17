/*
Write a class Account that represents a bank account with
attributes like accountNumber, accountHolderName, and balance.
 Add methods to deposit and withdraw amounts and show the updated balance.
 */
class Account{
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public Account(String accountNumber,String accountHolderName,int balance){
        this.balance=balance;
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
    }
    public void deposit(int amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Amount deposited Sucessfully");
            System.out.println("Updated Balance : "+balance);
        }
        else{
            System.out.println("Enter correct amount");
        }
    }
    public void withdraw(int amount){
        if(amount>0 && amount<=balance){
            balance=balance-amount;
            System.out.println("Amount debited Succesfully");
            System.out.println("Updated Balance : "+balance);
        }
        else if(amount>balance){
            System.out.println("Balance is insufficient");
        }
        else{
            System.out.println("Enter correct amount");
        }
    }
    double getBalance(){
        return balance;
    }
}
class Oops13{
    public static void main(String[] args) {
        Account a1=new Account("25654854854854","Robin hood",200000);
        a1.deposit(45000);
        a1.withdraw(300000);
        a1.withdraw(50000);
        System.out.println("final Balance : "+a1.getBalance());
    }
}