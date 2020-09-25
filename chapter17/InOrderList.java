/**
 * Write a method inOrderList that could be added to the IntTree 
 * class. The method returns a list containing the sequence of 
 * values obtained from an in-order traversal of your binary tree
 * of integers.
 */

public List<Integer> inOrderList() {
    List<Integer> list = new ArrayList<Integer>();
    inOrderList(overallRoot, list);
    return list;
}

private void inOrderList(IntTreeNode node, List<Integer> list) {
    if(node == null) {
        return;
    }
    
    inOrderList(node.left, list);
    list.add(node.data);
    inOrderList(node.right, list);
} 