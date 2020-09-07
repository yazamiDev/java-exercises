/**
 * Design a new class MinMaxAccount whose instances can be used in place 
 * of a BankingAccount object but include new behavior of remembering the 
 * minimum and maximum balances ever recorded for the account. You should 
 * provide the same methods as the superclass, as well as the following 
 * new behavior:
 * 
 * public MinMaxAccount(Startup s) -->	constructs a MinMaxAccount object 
 * using information in the Startup object s
 * public int getMin() -->	returns minimum balance in pennies
 * public int getMax() --> 	returns maximum balance in pennies
 * 
 * The account's constructor sets the initial balance based on the Startup 
 * information. Assume that only the debit and credit methods change an 
 * account's balance.
 */

public class MinMaxAccount extends BankingAccount {
    private int minBalance;
    private int maxBalance;
    
    public MinMaxAccount(Startup s) {
        super(s);
        minBalance = s.startup_getBalance();
        maxBalance = s.startup_getBalance();
    }
    
    public void debit(Debit d) {
        super.debit(d);
        int balance = getBalance();
        
        if(balance < minBalance) {
            minBalance = balance;
        }
        
        if(balance > maxBalance) {
            maxBalance = balance;
        }
    }
    
    public void credit(Credit c) {
        super.credit(c);  
        int balance = getBalance();
        
        if(balance < minBalance) {
            minBalance = balance;
        }
        
        if(balance > maxBalance) {
            maxBalance = balance;
        }
    }
    
    public int getMin() {
        return minBalance;
    }
    
    public int getMax() {
        return maxBalance;
    }
}