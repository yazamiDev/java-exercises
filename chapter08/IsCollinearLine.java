/**
 * Add the following method to your Line class:
 * public boolean isCollinear(Point p)
 * Returns true if the given point is collinear with the points of this line; 
 * that is, if, when this Line is stretched infinitely, it would eventually 
 * hit the given point.
 */

public boolean isCollinear(Point p) { 
    double m1 = ((double)((p1.y - p.y)) / (p1.x - p.x));
    double m2 = ((double)((p2.y - p.y)) / (p2.x - p.x));
    
    if(p1.x == p2.x) {
        return true;
    }
    

    return m1==m2; 
}