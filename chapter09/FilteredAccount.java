/**
 * Design a new class called FilteredAccount whose instances can 
 * be used in place of an Account object but which include the 
 * extra behavior of not processing transactions with a value of 
 * 0. More specifically, the new class should indicate that a 
 * zero-valued transaction was approved but shouldn't call the 
 * process method in the Account class to process it.
 */

public class FilteredAccount extends Account {
    int total = 0;
    int zero = 0;
    public FilteredAccount(Client c) {
        super(c);
    }
    
    public boolean process(Transaction t) {
        total++;
        if(t.value() == 0) {
            zero++;
            return true;
        }
        
        return super.process(t);
    }
    
    public double percentFiltered() {
        if(total == 0) {
            return 0.0;
        }
        
        return (double) zero * 100 / total;
    }
}