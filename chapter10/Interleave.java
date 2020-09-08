/**
 * Write a method called interleave that accepts two ArrayLists of integers a1 
 * and a2 as parameters and inserts the elements of a2 into a1 at alternating 
 * indexes. If the lists are of unequal length, the remaining elements of the 
 * longer list are left at the end of a1.
 */

public void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
    int i = 0;
    int j = 0;
    int s1 = a1.size();
    int s2 = a2.size();
    boolean flag = true;
    
    
    while(i < s1 || j < s2) {
        if(i < s1 && flag) {
            a1.add(a1.get(i));
            i++;
        }

        if(j < s2 && !flag) {
            a1.add(a2.get(j));
            j++;
        }
        flag = !flag;
    }
    
    a1.subList(0, s1).clear();
}