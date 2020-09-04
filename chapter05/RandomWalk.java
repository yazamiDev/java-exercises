/**
 * Write a method named randomWalk that performs a random one-dimensional 
 * walk, reporting each position reached and the maximum position reached 
 * during the walk. The random walk should begin at position 0. On each step, 
 * you should either increase or decrease the position by 1 (with equal 
 * probability). The walk stops when 3 or -3 is hit.
 */

public void randomWalk() {
    int max = 0;
    int step;
    int pos = 0;
    Random rand = new Random();
    
    while(-3 < pos && pos < 3) {
        System.out.println("position = " + pos);
        step = rand.nextBoolean() ? -1 : 1;
        pos += step;
        max = Math.max(max, pos);
    }
    
    System.out.println("position = " + pos);
    System.out.println("max position = " + max);
}