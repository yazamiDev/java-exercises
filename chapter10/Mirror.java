/**
 * Write a method mirror that accepts an ArrayList of Strings as a 
 * parameter and produces a mirrored copy of the list as output, 
 * with the original values followed by those same values in the 
 * opposite order. For example, if an ArrayList variable called 
 * list contains the values ["a", "b", "c"], after a call of
 * mirror(list); it should contain ["a", "b", "c", "c", "b", "a"].
 */

public void mirror(ArrayList<String> list) {
    int size = list.size();
    
    for(int i=0; i<size ; i++) {
        String temp = list.get(i);
        list.add(size, temp);    
    }
}