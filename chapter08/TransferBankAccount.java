/**
 * Write an instance method named transfer that will be placed inside the 
 * BankAccount class to become a part of each BankAccount object's behavior. 
 * The transfer method moves money from this bank account to another account. 
 * The method accepts two parameters: a second BankAccount to accept the money,
 * and a real number for the amount of money to transfer.
 */

public void transfer(BankAccount recipient, double amount) {
    double fee = 5.0;
    double total = amount + fee;
    
    if(this.balance < 5 || amount <= 0) {
        return;
    }
    
    if(this.balance < total) {
        recipient.deposit(balance - fee);
        this.withdraw(this.balance);
    } else {
        recipient.deposit(amount);
        this.withdraw(total);
    }
    
}