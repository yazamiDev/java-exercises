/**
 * Add the following accessor methods to your Rectangle class from the previous
 * exercises:
 *
 * public boolean contains(int x, int y)
 * public boolean contains(Point p)
 *
 * Returns whether the given Point or coordinates lie inside the bounds of this
 * Rectangle. The edges are included; for example, a rectangle with 
 * [x=2,y=5,width=8,height=10] will return true for any point from (2, 5) 
 * through (10, 15) inclusive.
 */

public boolean contains(int x, int y) {
    return (this.x <= x && (this.x + this.width) >= x) && (this.y <= y && (this.y + this.height) >= y);

}

public boolean contains(Point p) {
    return (this.x <= p.x && (this.x + this.width) >= p.x) && (this.y <= p.y && 
                                                                (this.y + this.height) >= p.y);
}