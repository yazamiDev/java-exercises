/**
 * Write a method equals that could be added to the IntTree class. 
 * The method accepts another binary tree of integers as a parameter 
 * and compares the two trees to see if they are equal to each other.
 * For example, if variables of type IntTree called t1 and t2 have 
 * been initialized, then the call of t1.equals2(t2) will return true
 * if the trees are equal and false if otherwise.
 */

public boolean equals2(IntTree t2) {
    return equals2(overallRoot, t2.overallRoot);
}

private boolean equals2(IntTreeNode n1, IntTreeNode n2) {
    if(n1 == null && n2 == null) {
        return true;
    }
    
    if(n1 != null && n2 == null) {
        return false;
    }
    
    if(n1 == null && n2 != null) {
        return false;
    }
    
    return n1.data == n2.data && equals2(n1.left, n2.left) && 
        equals2(n1.right, n2.right);
}