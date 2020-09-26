/**
 * Write a method in the HashIntSet class called containsAll 
 * that accepts another hash set as a parameter and returns 
 * true if your set contains every element from the other set. 
 * For example, if the set stores [-2, 3, 5, 6, 8] and the method 
 * is passed [3, 6, 8], your method would return true. If the 
 * method were passed [3, 6, 7, 8], your method would return false 
 * because your set does not contain the value 7.
 */

public boolean containsAll(HashIntSet s) {
    for(int i=0; i<this.elementData.length; i++) {
        Node n = s.elementData[i];
        
        while(n != null) {
            if(!this.contains(n.data)) {
                return false;
            }
            n = n.next;
        }
    }
    return true;
    
}