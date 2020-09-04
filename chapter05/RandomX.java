/**
 * Write a method named randomX that keeps printing lines, where each line 
 * contains a random number of x characters between 5 and 19 inclusive, until 
 * it prints a line with 16 or more characters.
 */

public void randomX() {
    Random rand = new Random();
    int num;
    
    do {
        num = 5 + rand.nextInt(15);
        for(int i = 0; i < num; i++) {
            System.out.print("x");
        }
        
        System.out.println();
    } while(num < 16);
}