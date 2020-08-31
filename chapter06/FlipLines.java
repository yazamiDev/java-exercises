/**
 * Write a method named flipLines that accepts as its parameter a Scanner for 
 * an input file and that writes to the console the same file's contents with 
 * successive pairs of lines reversed in order.
 */

public void flipLines(Scanner input) {    
    while(input.hasNextLine()) {
        String temp = input.nextLine();
        if(!input.hasNextLine()) {
            System.out.println(temp);
            break;
        }
        
        System.out.println(input.nextLine());
        System.out.println(temp);
        
    }
}