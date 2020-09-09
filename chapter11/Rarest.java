/**
 * Write a method rarest that accepts a map whose keys are strings and whose 
 * values are integers as a parameter and returns the integer value that 
 * occurs the fewest times in the map. If there is a tie, return the smaller 
 * integer value. If the map is empty, throw an exception.
 */

public int rarest(Map<String, Integer> map) {
    HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
    int rarest = Integer.MAX_VALUE;
    int rareNum = Integer.MAX_VALUE;
    
    for(String key : map.keySet()) {
        int value = map.get(key);
        
        if(temp.containsKey(value)) {
            temp.put(value, temp.get(value) + 1);
        } else {
            temp.put(value, 1);
        }
    }
    
    for(int key : temp.keySet()) {
        int value = temp.get(key);
        
        if(value < rareNum) {
            rarest = key;
            rareNum = value;
        } else if(value == rareNum) {
            rarest = key < rarest ? key : rarest;
        }
    }
    
    return rarest;

}