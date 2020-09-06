/**
 * Add the following method to the Point class:
 * public int manhattanDistance(Point other).
 * Returns the "Manhattan distance" between the current Point object and the 
 * given other Point object. The Manhattan distance refers to how far apart two
 * places are if the person can only travel straight horizontally or vertically,
 * as though driving on the streets of Manhattan. In our case, the Manhattan 
 * distance is the sum of the absolute values of the differences in their 
 * coordinates; in other words, the difference in x plus the difference in y 
 * between the points.
 */

public int manhattanDistance(Point other) {
    int dx = Math.abs(other.x - this.x);
    int dy = Math.abs(other.y - this.y);
    return dx + dy;
}