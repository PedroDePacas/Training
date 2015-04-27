package org.anerus.lesson5;

import java.util.Arrays;

public class ArrayHelper {

    public ArrayElement[] mergeArrays(ArrayElement[] objectLeftArray, ArrayElement[] objectRightArray) {
        int counter = 0;
        ArrayElement[] tempArray = new ArrayElement[objectLeftArray.length + objectRightArray.length];
        Arrays.sort(objectLeftArray, new ArrayElementComparator());
        Arrays.sort(objectRightArray, new ArrayElementComparator());
        for (ArrayElement element : objectLeftArray) {
            if (counter==0 || !tempArray[counter-1].equals(element) ) {
                tempArray[counter] = element;
                counter++;
            }
        }
        for (ArrayElement element : objectRightArray) {
            if (Arrays.binarySearch(objectLeftArray, element, new ArrayElementComparator()) < 0) {
                if (counter==0 || !tempArray[counter-1].equals(element) ) {
                    tempArray[counter] = element;
                    counter++;
                }
            }
        }
        return Arrays.copyOfRange(tempArray, 0, counter);
    }


}
