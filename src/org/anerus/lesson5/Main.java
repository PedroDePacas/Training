package org.anerus.lesson5;

public class Main {
    private static int[] leftArray = {1,7,11,17,78};
    private static int[] rightArray = {3,5,24,4,1,2,34,45,32,5};

    public static void main(String[] args) {
        ArrayElement[] objectLeftArray = generateObjectArray(leftArray);
        ArrayElement[] objectRightArray = generateObjectArray(rightArray);

        ArrayHelper arrayHelper = new ArrayHelper();
        ServiceDelegate serviceDelegate = new ServiceDelegate(arrayHelper);
        ArrayElement[] objectResultArray = serviceDelegate.mergeArrays(objectLeftArray, objectRightArray);
    }

    // Заполнение масивов объектами
    public static ArrayElement[] generateObjectArray(int[] intArray) {
        ArrayElement[] objectArray = new ArrayElement[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            objectArray[i] = new ArrayElement.Builder()
                    .elementName(Integer.toString(intArray[i]))
                    .elementValue(intArray[i])
                    .build();
        }
        return objectArray;
    }
}
