/**
 * Write a method removeEvenLength that takes a Set of strings as a parameter
 * and that removes all of the strings of even length from the set.
 */

public void removeEvenLength(Set<String> set)  {
    List<String> temp = new LinkedList<String>();

    for(String s : set) {
        if(s.length() % 2 == 1)
            temp.add(s);
    }

    set.clear();
    set.addAll(temp);
}