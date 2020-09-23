/**
 * Write a method numberNodes that changes the data stored in a 
 * binary tree, assigning sequential integers starting with 1 to 
 * each node so that a pre-order traversal will produce the numbers 
 * in order(1, 2, 3, etc.). For example, given the tree referenced 
 * by tree below at left, the call of tree.numberNodes(); would 
 * overwrite the existing data assigning the nodes values from 1 
 * to 6 so that a pre-order traversal of the tree would produce 1,
 * 2, 3, 4, 5, 6.
 */

public int numberNodes() {
    return numberNodes(overallRoot, 1);
}

private int numberNodes(IntTreeNode node, int num) {
    if(node == null) {
        return 0;
    }
   
    node.data = num;
    int countLeft = numberNodes(node.left, num + 1);
    int countRight = numberNodes(node.right, num + 1 + countLeft);
    
    return 1 + countLeft + countRight;
}