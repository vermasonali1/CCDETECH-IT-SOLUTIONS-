import java.util.*;

class user_Bank{
    double total_Balance;
    user_Bank(double balance){
        this.total_Balance=balance;
    }
    
    // create an method to getbalance
    double getBalance(){
        return total_Balance;
    }
    
    // create an method to withdraw
    public void withdraw(double amt){
        if(total_Balance>amt){
            total_Balance=total_Balance-amt;
            System.out.println("Withdraw successful!");
            System.out.println("Total balance is Rs : "+total_Balance);
        }
        else{
            System.out.println("Transaction failed! insufficient balance");
        }
    }
    
    // create an method to deposit
    public void deposit(double amt){
        total_Balance=total_Balance+amt;
        System.out.println("Deposit successful!");
        System.out.println("Total balance is Rs : "+total_Balance);
    }
}
// . Connect the ATM class with the user's bank account class to access and modify the account balance.
class ATM{
    user_Bank user_Account;
    ATM(user_Bank user_Account){
        this.user_Account=user_Account;
    }
    public void option(){
        System.out.println("Here are some options select any one option according to your transaction");
        System.out.println("1 for check balance");
        System.out.println("2 for withdraw");
              System.out.println("3 for deposit");
    }
    public void input_Options(int op){
        Scanner s=new Scanner(System.in);
        switch(op){
            case 1:System.out.println("Total balance is Rs : "+user_Account.getBalance());
            break;

            case 2:System.out.println("Enter withdraw amount Rs : ");
            user_Account.withdraw(s.nextDouble());
            break;

             case 3:System.out.println("Enter deposit amount Rs : ");
             user_Account.deposit(s.nextDouble());
            break;


            default:System.out.println("Invalid option");
            
            
        }
    }
}
public class ATM_Machine{
    public static void main(String[] args) {
        user_Bank user_Account=new user_Bank(100000);
        ATM a=new ATM(user_Account);
        while(true){
            a.option();

            Scanner s=new Scanner(System.in);
            System.out.println("Enter option :");
            int input=s.nextInt();

            a.input_Options(input);
            break;
        }
    }
}
