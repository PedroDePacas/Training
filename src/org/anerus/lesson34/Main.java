package org.anerus.lesson34;

import java.util.Arrays;

public class Main {
    private static int[] leftArray = {1,5,4,23,65,32,78};
    private static int[] rightArray = {3,5,24,4,1,2,34,45,32,5};

    public static void main(String[] args) {
        ArrayElement[] objectLeftArray = generateObjectArray(leftArray);
        ArrayElement[] objectRightArray = generateObjectArray(rightArray);

        printObjectArray(objectLeftArray);
        printObjectArray(objectRightArray);
        TestingArrays testingArrays = new TestingArrays();
        ArrayElement[] objectMergeResultArray = testingArrays.mergeArrays(objectLeftArray, objectRightArray);
        printObjectArray(objectMergeResultArray);
        ArrayElement[] objectInnerUnionResultArray = testingArrays.innerUnionArrays(objectLeftArray, objectRightArray);
        printObjectArray(objectInnerUnionResultArray);
        ArrayElement[] objectOuterUnionResultArray = testingArrays.outerUnionArrays(objectLeftArray, objectRightArray);
        printObjectArray(objectOuterUnionResultArray);

    }

    // Заполнение масивов объектами
    public static ArrayElement[] generateObjectArray(int[] intArray) {
        ArrayElement[] objectArray = new ArrayElement[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            objectArray[i] = new ArrayElement();
            objectArray[i].setElementName(Integer.toString(intArray[i]));
            objectArray[i].setElementValue(intArray[i]);
        }
        return objectArray;
    }

    // Вывод масивов
    public static void printObjectArray(ArrayElement[] objectArray) {
        System.out.println(" ");
        for (ArrayElement x : objectArray) {
            System.out.print(x.getElementName());
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
