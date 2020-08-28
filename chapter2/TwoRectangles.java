/**
 * Write a program called TwoRectangles that uses two integer class 
 * constants called WIDTH and HEIGHT to draw two rectangles of stars 
 * of the given dimensions. The first rectangle should be flush left, 
 * and the second should be indented horizontally by the given width. For 
 * example, if the WIDTH and HEIGHT are 7 and 4 respectively, the 
 * program should draw the following figure:
 * 
 * *******
 * *******
 * *******
 * *******
 *        *******
 *        *******
 *        *******
 *        *******
 */

public class TwoRectangles {
    public static final int WIDTH = 7;
    public static final int HEIGHT = 4;
    
    public static void main(String[] args) {
        for(int i=1; i<=HEIGHT; i++) {
            for(int j=0; j<WIDTH; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=1; i<=HEIGHT; i++) {
            for(int j=0; j<WIDTH; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<WIDTH; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}