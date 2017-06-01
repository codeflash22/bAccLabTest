package bankaccountlabtest;

import java.util.Scanner;
public class Account {
    
    private String accountName;
    private String accountNumber;
    private String typeOfAccount;
    private double balance;
    private double annualIntRate;
    
    public Account(){}

    public Account(String accountName, String accountNumber, String typeOfAccount, double balance, double annualIntRate) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.typeOfAccount = typeOfAccount;
        this.balance = balance;
        this.annualIntRate = annualIntRate;
    }
    
    public String getAccountName() { return accountName;}

    public void setAccountName(String accountName) { this.accountName = accountName;}

    public String getAccountNumber() { return accountNumber;}

    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber;}

    public String getTypeOfAccount() { return typeOfAccount;}

    public void setTypeOfAccount(String typeOfAccount) { this.typeOfAccount = typeOfAccount;}

    public double getBalance() { return balance;}

    public void setBalance(double balance) { this.balance = balance;}
  
    
    Scanner userInput = new Scanner(System.in);
    
    public void createAccount(){
        
        System.out.println("Enter Account Name: ");
        setAccountName(userInput.nextLine());
        
        System.out.println("Enter Account Number: ");
        setAccountNumber(userInput.nextLine());
        
        System.out.println("Enter Type of Account (Savings/Current): ");
        setTypeOfAccount(userInput.nextLine());
        
        //depAmount();       
    
    }
    
    public double depAmount(){
        System.out.println("Enter the amount of money you want to store: ");
        setBalance(userInput.nextDouble());         
        return getBalance();
    }
    
    public void showBalance(){
        System.out.println("Balance: " + getBalance());
    }
    
    public void showAccount(){
        System.out.println("Account Name: " + getAccountName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Type (Savings/Current): " + getTypeOfAccount());
    }
    
    public double withdraw(){
        System.out.println("Enter the amount of money you want to withdraw: ");
        double withdrawAmount = userInput.nextDouble();
        
        if((getBalance()-withdrawAmount) < 500 || (getBalance()-withdrawAmount) < 0)
            System.out.println("You can't withdraw. You have to keep atleast minimum of $500 in your account.");          
        else
            balance = getBalance()-withdrawAmount;
        
        System.out.println("You current balance is $"+getBalance());
        return getBalance();
    }
    public double computeInterest(){
        double nYear, compoundInterest;
        System.out.println("Enter compound year: ");
        nYear = userInput.nextDouble();
        double temp1 = (1 + annualIntRate);
        compoundInterest = getBalance() * (java.lang.Math.pow(temp1,nYear)-1);
        setBalance(getBalance()+compoundInterest);
        return getBalance();
    }
    
}
