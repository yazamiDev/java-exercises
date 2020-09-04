/**
 * Write a method named diceSum that prompts the user for a desired sum, then 
 * repeatedly rolls two six-sided dice until their sum is the desired sum.
 */

public void diceSum() {
    Random rand = new Random();
    Scanner in = new Scanner(System.in);
    System.out.print("Desired dice sum: ");
    int sum = in.nextInt();
    int num1;
    int num2;
    
    do {
        num1 = 1 + rand.nextInt(6);
        num2 = 1 + rand.nextInt(6);
        System.out.println(num1 + " and " + num2 + " = " + (num1 + num2));

    } while(num1 + num2 != sum);
}