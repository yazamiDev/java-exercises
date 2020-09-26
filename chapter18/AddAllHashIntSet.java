/**
 * Write a method named addAll that could be placed inside the 
 * HashIntSet class. This method accepts another HashIntSet as 
 * a parameter and adds all elements from that set into the 
 * current set, if they are not already present. For example, if 
 * a set s1 contains [1, 2, 3] and another set s2 contains [1, 
 * 7, 3, 9], the call of s1.addAll(s2); would change s1 to 
 * store [1, 2, 3, 7, 9] in some order.
 */

public void addAll(HashIntSet s) {
    for(int i=0; i<s.elementData.length; i++) {
        Node n = s.elementData[i];
        
        while(n != null) {
            if(!this.contains(n.data)) {
                this.add(n.data);
            }
            n = n.next;
        }
    }
}