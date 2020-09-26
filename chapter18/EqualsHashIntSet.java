/**
 * Write a method in the HashIntSet class called equals that accepts 
 * another object as a parameter and returns true if the object is 
 * another HashIntSet that contains exactly the same elements. The 
 * internal hash table size and ordering of the elements does not 
 * matter, only the sets of elements themselves.
 */

public boolean equals(Object obj) {
    if(obj instanceof HashIntSet) {
        HashIntSet set = (HashIntSet) obj;
        
        if(size != set.size()) {
            return false;
        }
        
        for(int i=0; i<elementData.length; i++) {
            Node n = elementData[i];
            
            while(n != null) {
                if(!set.contains(n.data)) {
                    return false;
                }
                n = n.next;
            }
        }
        return true;
    }
    
    return false;
}