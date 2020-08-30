/**
 * Write a method named printGPA that calculates a student's grade point 
 * average. The user will type a line of input containing the student's name, 
 * then a number of scores, followed by that many integer scores.
 */

public void printGPA() {
    Scanner console = new Scanner(System.in);
    
    System.out.print("Enter a student record: ");
    String name = console.next();
    int n = console.nextInt();
    double result = 0.0;
    
    for(int i=1; i<=n; i++){
        result += console.nextInt();
    }
    
    System.out.print(name + "'s grade is " + result / n );
}