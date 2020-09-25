/**
 * Write a method removeLeaves that removes the leaves from a tree. 
 * A leaf node that has empty left and right subtrees. If a variable 
 * tree refers to the first tree below, the call of tree.removeLeaves(); 
 * should remove the four leaves from the tree (the nodes with data 
 * values 1, 4, 6, and 0) leaving the next tree shown below.
 */

public void removeLeaves() {
    overallRoot = removeLeaves(overallRoot);
}

private IntTreeNode removeLeaves(IntTreeNode node) {
    if(node == null) {
        return null;
    }
    
    if(node.left == null && node.right == null) {
        return null;
    }
    
    node.left = removeLeaves(node.left);
    node.right = removeLeaves(node.right);
    return node;
    
}