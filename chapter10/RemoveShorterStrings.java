/**
 * Write a method removeShorterStrings that takes an ArrayList of Strings as a 
 * parameter and that removes from each successive pair of values the shorter 
 * string in the pair. If there is a tie (both strings have the same length), 
 * your method should remove the first string in the pair. If there is an odd 
 * number of strings in the list, the final value should be kept in the list.
 */

public void removeShorterStrings(ArrayList<String> list) {
    for(int i=0; i<list.size()-1; i++) {
        String temp1 = list.get(i);
        String temp2 = list.get(i+1);
        
        if(temp1.length() <= temp2.length()) {
            list.remove(temp1);
        } else {
            list.remove(temp2);
        }
    }
}