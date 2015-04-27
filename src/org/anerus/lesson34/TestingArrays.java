package org.anerus.lesson34;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class TestingArrays {

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

    public ArrayElement[] innerUnionArrays(ArrayElement[] objectLeftArray, ArrayElement[] objectRightArray) {
        int counter = 0;
        ArrayElement[] tempArray = new ArrayElement[objectLeftArray.length];
        Arrays.sort(objectLeftArray, new ArrayElementComparator());
        Arrays.sort(objectRightArray, new ArrayElementComparator());
        for (ArrayElement element : objectRightArray) {
            if (Arrays.binarySearch(objectLeftArray, element, new ArrayElementComparator()) >= 0) {
                if (counter==0 || !tempArray[counter-1].equals(element) ) {
                    tempArray[counter] = element;
                    counter++;
                }
            }
        }
        return Arrays.copyOfRange(tempArray, 0, counter);
    }

    public ArrayElement[] outerUnionArrays(ArrayElement[] objectLeftArray, ArrayElement[] objectRightArray) {
        int counter = 0;
        ArrayElement[] tempArray = new ArrayElement[objectLeftArray.length + objectRightArray.length];
        Arrays.sort(objectLeftArray, new ArrayElementComparator());
        Arrays.sort(objectRightArray, new ArrayElementComparator());
        for (ArrayElement element : objectRightArray) {
            if (Arrays.binarySearch(objectLeftArray, element, new ArrayElementComparator()) < 0) {
                tempArray[counter] = element;
                counter++;
            }
        }
        for (ArrayElement element : objectLeftArray) {
            if (Arrays.binarySearch(objectRightArray, element, new ArrayElementComparator()) < 0) {
                tempArray[counter] = element;
                counter++;
            }
        }
        return Arrays.copyOfRange(tempArray, 0, counter);
    }

}
