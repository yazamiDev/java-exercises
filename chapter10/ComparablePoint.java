/**
 * Modify the class to be Comparable by adding an appropriate 
 * compareTo method. Points should be compared relative to their 
 * distance from the origin, with points closer to the origin 
 * considered "less" than points farther from it. The distance 
 * between two points is defined as the square root of the sum of 
 * the squares of the differences between the x and y coordinates.
 */

public int compareTo(Point2D point) {
    Point2D origin = new Point2D(0, 0);
    double difference = this.distance(origin) - point.distance(origin);

    if(difference < 0) {
        return -1;
    } else if(difference > 0) {
        return 1;
    }
    
    return 0;
}