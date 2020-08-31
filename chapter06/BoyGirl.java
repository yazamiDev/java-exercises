/**
 * Write a method named boyGirl that accepts a Scanner as a parameter. The 
 * Scanner is reading its input from a file containing a series of names 
 * followed by integers. The names alternate between boys' names and girls' 
 * names. Your method should compute the absolute difference between the sum 
 * of the boys' integers and the sum of the girls' integers. The input could 
 * end with either a boy or girl; you may not assume that it contains an even 
 * number of names.
 */

public void boyGirl(Scanner input) {
    int boyCount = 0;
    int boySum = 0;
    int girlCount = 0;
    int girlSum = 0;
    
    while(input.hasNext()) {
        input.next();
        boyCount++;
        boySum += input.nextInt();
        
        if(!input.hasNext()) {
            break;
        }
        
        input.next();
        girlCount++;
        girlSum += input.nextInt();
        
    }
    
    System.out.println(boyCount + " boys, " + girlCount + " girls");
    System.out.println("Difference between boys' and girls' sums: " + Math.abs(boySum - girlSum));
    
}