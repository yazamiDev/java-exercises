/**
 * Add the following method to your Rectangle class from the previous
 * exercises:
 * public Rectangle union(Rectangle rect)
 * Returns a new Rectangle that represents the area occupied by the tightest 
 * bounding box that contains both this Rectangle and the given other 
 * Rectangle. Your method should not modify the current Rectangle or the one 
 * that is passed in as a parameter; you should create and return a new 
 * rectangle.
 */

public Rectangle union(Rectangle rect) {
    int x = Math.min(this.x, rect.x);
    int y = Math.min(this.y, rect.y);
    int width = Math.max(rect.x + rect.width - x, this.x + this.width - x);
    int height = Math.max(rect.y + rect.height - y, this.y + this.height - y);
    
    return new Rectangle(x, y, width, height);
}