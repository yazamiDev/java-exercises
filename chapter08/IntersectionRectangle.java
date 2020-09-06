/**
 * Add the following method to your Rectangle class from the previous 
 * exercises:
 * public Rectangle intersection(Rectangle rect)
 * Returns a new rectangle that represents the largest rectangular region 
 * completely contained within both this rectangle and the given other 
 * rectangle. If the rectangles do not intersect at all, returns null. Your 
 * method should not modify the current Rectangle or the one that is passed in 
 * as a parameter; you should create and return a new rectangle.
 */

public Rectangle intersection(Rectangle rect) {
    int x = Math.max(this.x, rect.x);
    int y = Math.max(this.y, rect.y);
    int width = Math.min(rect.x + rect.width - x, this.x + this.width - x);
    int height = Math.min(rect.y + rect.height - y, this.y + this.height - y);
    
    return new Rectangle(x, y, width, height);
}