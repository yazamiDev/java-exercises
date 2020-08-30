/**
 * Write a method called printTriangleType that accepts three integer 
 * arguments representing the lengths of the sides of a triangle and prints 
 * what type of triangle it is. The three types are equilateral, isosceles, 
 * and scalene.
 */

public void printTriangleType (int a, int b, int c) {
    if(a == b && b == c) {
        System.out.print("equilateral");
    } else if (a == b || b == c || a == c ) {
        System.out.print("isosceles");
    } else {
        System.out.print("scalene");
    }
}