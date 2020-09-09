/**
 * Write a method called alternate that accepts two Lists of integers as its 
 * parameters and returns a new List containing alternating elements from the 
 * two lists. If the lists do not contain the same number of elements, the 
 * remaining elements from the longer list should be placed consecutively at 
 * the end. Do not modify the parameter lists passed in.
 */

public List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
    List<Integer> list = new LinkedList<Integer>();
    int i = 0;
    int j = 0;
    int s1 = list1.size();
    int s2 = list2.size();
    
    while(i < s1 || j <s2) {
        if(i < s1) {
            list.add(list1.get(i));
            i++;
        } 
        if(j < s2) {
            list.add(list2.get(j));
            j++;
        }
    }
    
    return list;
}