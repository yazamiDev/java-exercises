/**
 * Write a method named isUnique that takes an array of integers as a 
 * parameter and that returns a boolean value indicating whether or not the 
 * values in the array are unique (true for yes, false for no). The values in 
 * the list are considered unique if there is no pair of values that are 
 * equal. Notice that given this definition, a list of 0 or 1 elements would 
 * be considered unique.
 */

public boolean isUnique(int[] list) {
    HashSet<Integer> set = new HashSet<Integer>();
    
    for(int i=0; i<list.length; i++) {
        if(set.contains(list[i])) {
            return false;
        }
        set.add(list[i]);
    }
    
    return true;
}