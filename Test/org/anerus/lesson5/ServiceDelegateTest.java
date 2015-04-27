package org.anerus.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class ServiceDelegateTest {
    private static int[] leftArray = {1,7,11,17,78};
    private static int[] rightArray = {3,5,24,4,1,2,34,45,32,5};
    private static int[] mergeExpectedArray = {1,7,11,17,78,3,5,24,4,2,34,45,32};

    @Test
    public void testLeftArray() {
        ArrayElement[] objectLeftArray = Main.generateObjectArray(leftArray);
        Assert.assertNotEquals(objectLeftArray.length, 0);
        Assert.assertNotNull(objectLeftArray);
    }

    @Test
    public void testRightArray() {
        ArrayElement[] objectRightArray = Main.generateObjectArray(rightArray);
        Assert.assertNotEquals(objectRightArray.length, 0);
        Assert.assertNotNull(objectRightArray);
    }

    @Test
    public void testDublicatElements() {
        ArrayElement[] objectLeftArray = Main.generateObjectArray(leftArray);
        ArrayElement[] objectRightArray = Main.generateObjectArray(rightArray);

        ArrayHelper arrayHelper = new ArrayHelper();
        ServiceDelegate serviceDelegate = new ServiceDelegate(arrayHelper);
        ArrayElement[] objectResultArray = serviceDelegate.mergeArrays(objectLeftArray, objectRightArray);
        for (int i = 1; i < objectResultArray.length; i++) {
            Assert.assertNotEquals(objectResultArray[i-1], objectResultArray[i]);
        }
    }

    @Test
    public void testMergeArrays() {
        ArrayElement[] objectLeftArray = Main.generateObjectArray(leftArray);
        ArrayElement[] objectRightArray = Main.generateObjectArray(rightArray);
        ArrayElement[] objectMergeExpectedArray = Main.generateObjectArray(mergeExpectedArray);

        ArrayHelper arrayHelper = new ArrayHelper();
        ServiceDelegate serviceDelegate = new ServiceDelegate(arrayHelper);
        ArrayElement[] objectResultArray = serviceDelegate.mergeArrays(objectLeftArray, objectRightArray);
        Assert.assertArrayEquals(objectMergeExpectedArray, objectResultArray);
    }

}
