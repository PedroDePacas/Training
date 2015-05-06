package org.anerus.lesson6;

import org.anerus.lesson5.ArrayElement;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class ServiceDelegateTest {
    private static int[] leftArray = {1,7,11,17,78};
    private static int[] rightArray = {3,5,24,4,1,2,34,45,32,5};
    private static int[] mergeExpectedArray = {1,7,11,17,78,3,5,24,4,2,34,45,32};

    @Test
    public void testLeftArray() {
        HashSet<ArrayElement> objectLeftCollection = Main.generateObjectCollection(leftArray);
        Assert.assertNotEquals(objectLeftCollection.size(), 0);
        Assert.assertNotNull(objectLeftCollection);
    }

    @Test
    public void testRightArray() {
        HashSet<ArrayElement> objectRightCollection = Main.generateObjectCollection(rightArray);
        Assert.assertNotEquals(objectRightCollection.size(), 0);
        Assert.assertNotNull(objectRightCollection);
    }

    @Test
    public void testDublicatElements() {
        HashSet<ArrayElement> objectLeftCollection = Main.generateObjectCollection(leftArray);
        HashSet<ArrayElement> objectRightCollection = Main.generateObjectCollection(rightArray);
        CollectionHelper collectionHelper = new CollectionHelper();
        ServiceDelegate serviceDelegate = new ServiceDelegate(collectionHelper);
        HashSet<ArrayElement> objectResultCollection = serviceDelegate.mergeCollections(objectLeftCollection, objectRightCollection);
        ArrayElement[] objectResultArray = new ArrayElement[objectResultCollection.size()];
        objectResultArray = objectResultCollection.toArray(objectResultArray);
        for (int i = 1; i < objectResultArray.length; i++) {
            Assert.assertNotEquals(objectResultArray[i-1], objectResultArray[i]);
        }
    }

    @Test
    public void testMergeArrays() {
        HashSet<ArrayElement> objectLeftCollection = Main.generateObjectCollection(leftArray);
        HashSet<ArrayElement> objectRightCollection = Main.generateObjectCollection(rightArray);
        HashSet<ArrayElement> objectMergeExpectedCollection = Main.generateObjectCollection(mergeExpectedArray);
        CollectionHelper collectionHelper = new CollectionHelper();
        ServiceDelegate serviceDelegate = new ServiceDelegate(collectionHelper);
        HashSet<ArrayElement> objectResultCollection = serviceDelegate.mergeCollections(objectLeftCollection, objectRightCollection);
        ArrayElement[] objectResultArray = new ArrayElement[objectResultCollection.size()];
        objectResultArray = objectResultCollection.toArray(objectResultArray);
        ArrayElement[] objectExpectedArray = new ArrayElement[objectMergeExpectedCollection.size()];
        objectExpectedArray = objectMergeExpectedCollection.toArray(objectExpectedArray);
        Assert.assertArrayEquals(objectExpectedArray, objectResultArray);
    }

}
