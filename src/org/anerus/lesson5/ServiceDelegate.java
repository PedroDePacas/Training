package org.anerus.lesson5;

public class ServiceDelegate {
    private final ArrayHelper arrayHelper;

    public ServiceDelegate(ArrayHelper arrayHelper) {
        this.arrayHelper = arrayHelper;
    }

    public ArrayElement[] mergeArrays(ArrayElement[] objectLeftArray, ArrayElement[] objectRightArray) {
        printObjectArray(objectLeftArray);
        printObjectArray(objectRightArray);
        ArrayElement[] resultArray = arrayHelper.mergeArrays(objectLeftArray, objectRightArray);
        printObjectArray(resultArray);
        return resultArray;
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
