/**
 * Write a method named doubleSpace that accepts a Scanner for an input file 
 * and a PrintStream for an output file as its parameters, writing into the
 * output file a double-spaced version of the text in the input file.
 */

public void doubleSpace(Scanner input, PrintStream output) { 
    while(input.hasNextLine()) {
        output.println(input.nextLine());
        output.println();
    }
}