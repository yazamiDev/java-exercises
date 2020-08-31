/**
 * Write a method named countCoins that accepts as its parameter a Scanner for 
 * an input file whose data represents a person's money grouped into stacks of 
 * coins. Your method should add up the cash values of all the coins and print 
 * the total money at the end. The input consists of a series of pairs of 
 * tokens, where each pair begins with an integer and is followed by the type 
 * of coin, which will be either "pennies" (1 cent each), "nickels" (5 cents 
 * each), "dimes" (10 cents each), or "quarters" (25 cents each), 
 * case-insensitively. A given coin might appear more than once on the same 
 * line.
 */

public void countCoins(Scanner input) {
    double total = 0.0;
    
    while(input.hasNext()) {
        int amount = input.nextInt();
        String type = input.next().toLowerCase();
        
        if(type.equals("pennies")) {
            total += amount;
        } else if (type.equals("nickels")) {
            total += 5 * amount;
        } else if (type.equals("dimes")) {
            total += 10 * amount;
        } else if (type.equals("quarters")) {
            total += 25 * amount;
        }
    }
                
    System.out.print("Total money: $" + String.format("%.2f", total / 100));
}