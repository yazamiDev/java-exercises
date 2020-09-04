/**
 * Write a method called randomLines that prints between 5 and 10 random 
 * strings of letters (between "a" and "z"), one per line. Each string should 
 * have random length of up to 80 characters.
 */

public void randomLines() {
    Random rand = new Random();
    String letters = "abcdefghijklmnopqrstuvwxyz";
    int lines = 5 + rand.nextInt(6);
    
    for(int i = 0; i < lines; i++) {
        int length = 1 + rand.nextInt(80);
        
        for(int j = 0; j < length; j++) {
            int k = rand.nextInt(26);
            char c = letters.charAt(k);
            System.out.print(c);
        }
        System.out.println();
    }
}