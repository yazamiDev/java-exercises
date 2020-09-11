/**
 * Write a method stretch that takes an integer n as a 
 * parameter and that increases a list of integers by a 
 * factor of n by replacing each integer in the original 
 * list with n copies of that integer. 
 */

public void stretch(int n) {
    int tempSize = n * size;
    ensureCapacity(tempSize);

    for(int i = size - 1; i >= 0; i--) {
        for(int j = 0; j < n; j++) {
            elementData[n * i + j] = elementData[i];
        }
    }

    size = tempSize;
}