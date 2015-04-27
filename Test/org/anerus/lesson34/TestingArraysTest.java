package org.anerus.lesson34;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestingArraysTest {
    private static int[] leftArray = {1,5,4,23,65,32,78};
    private static int[] rightArray = {3,5,24,4,1,2,34,45,32,5};
    private static int[] mergeExpectedArray = {1,5,4,23,65,32,78,3,24,2,34,45};
    private static int[] innerUnionExpectedArray = {1,5,4,32};
    private static int[] outerUnionExpectedArray = {23,65,78,3,24,2,34,45};

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

        TestingArrays testingArrays = new TestingArrays();
        ArrayElement[] objectResultArray = testingArrays.mergeArrays(objectLeftArray, objectRightArray);
        for (int i = 1; i < objectResultArray.length; i++) {
            Assert.assertNotEquals(objectResultArray[i-1], objectResultArray[i]);
        }
    }

    @Test
    public void testMergeArrays() {
        ArrayElement[] objectLeftArray = Main.generateObjectArray(leftArray);
        ArrayElement[] objectRightArray = Main.generateObjectArray(rightArray);
        ArrayElement[] objectMergeExpectedArray = Main.generateObjectArray(mergeExpectedArray);

        TestingArrays testingArrays = new TestingArrays();
        ArrayElement[] objectResultArray = testingArrays.mergeArrays(objectLeftArray, objectRightArray);
        Assert.assertArrayEquals(objectMergeExpectedArray, objectResultArray);
    }

}
