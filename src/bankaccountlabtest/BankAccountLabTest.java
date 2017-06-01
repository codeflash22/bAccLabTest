package bankaccountlabtest;

/**
 *
 * @author ASIF
 */
import java.util.Scanner;
public class BankAccountLabTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account Acc = new Account();
        SavingsAccount sAcc = new SavingsAccount();
        CurrentAccount cAcc = new CurrentAccount();
        
        Acc.createAccount();
        
        switch(Acc.getTypeOfAccount()){
            case "Savings":
                sAcc.depAmount();
                sAcc.computeInterest();
                Acc.showAccount();
                sAcc.showBalance();
                System.out.println("Do You Want to Withdraw? if Yes press 1 or if No press 0.");
                int flag=input.nextInt();
                if(flag==1){ sAcc.withdraw();}
                else{ sAcc.showBalance();}
                break;
            
            case "Current":
                cAcc.depAmount();
                cAcc.computeInterest();
                Acc.showAccount();
                cAcc.showBalance();
                System.out.println("Do You Want to Withdraw? if Yes press 1 or if No press 0.");
                flag = input.nextInt();
                if(flag==1){cAcc.withdraw();}
                else{ cAcc.showBalance();}
                break;
            default:
                System.out.println("You can only have savings or current account.");
        }
                
    }
    
}
