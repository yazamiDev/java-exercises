/**
 * Write a method removeDuplicates that takes as a parameter a sorted
 * ArrayList of Strings and that eliminates any duplicates from the list.
 */

public void removeDuplicates(ArrayList<String> list) {
    for(int i=0; i<list.size() - 1; i++) {
        String temp = list.get(i);
        if(temp.equals(list.get(i+1))) {
            list.remove(i);
            i--;
        }
    }
}