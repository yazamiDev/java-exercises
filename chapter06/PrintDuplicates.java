/**
 * Write a method named printDuplicates that accepts as its
 * parameter a Scanner for an input file containing a series 
 * of lines. Your method should examine each line looking for 
 * consecutive occurrences of the same token on the same line 
 * and print each duplicated token along how many times it 
 * appears consecutively. Non-repeated tokens are not printed. 
 * Repetition across multiple lines (such as if a line ends 
 * with a given token and the next line starts with the same 
 * token) is not considered in this problem.
 */

public void printDuplicates(Scanner input) {
    while(input.hasNextLine()) {
        Scanner line = new Scanner(input.nextLine());
        int count = 0; 
        String current = "";

        while(line.hasNext()) {
            String next = line.next();
            if(next.equals(current)) {
                count++;
            } else {
                if(count > 1) {
                    System.out.print(current + "*" + count + " ");
                }
                current = next;
                count = 1;
            }
        }

        if(count > 1) {
            System.out.print(current + "*" + count);
        }

        System.out.println();
    }
}