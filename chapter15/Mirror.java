/**
 * Write a method mirror that doubles the size of a list of 
 * integers by appending the mirror image of the original 
 * sequence to the end of the list.
 */

public void mirror() {
    int tempSize = size * 2;
    ensureCapacity(tempSize);
    
    
    for(int i=0; i<size; i++) {
        elementData[tempSize - i - 1] = elementData[i];
    }
    
    size = tempSize;
}