package org.anerus.lesson6;

import org.anerus.lesson5.ArrayElement;

import java.util.HashSet;
import java.util.Set;

public class ServiceDelegate {
    private final CollectionHelper collectionHelper;

    public ServiceDelegate(CollectionHelper collectionHelper) {
        this.collectionHelper = collectionHelper;
    }

    public HashSet<ArrayElement> mergeCollections(HashSet<ArrayElement> objectLeftCollection,  HashSet<ArrayElement> objectRightCollection) {
        printObjectCollections(objectLeftCollection);
        printObjectCollections(objectRightCollection);
        HashSet<ArrayElement> objectResultCollection = collectionHelper.mergeCollections(objectLeftCollection, objectRightCollection);
        printObjectCollections(objectResultCollection);
        return objectResultCollection;
    }

    // Вывод коллекции
    public static void printObjectCollections(HashSet<ArrayElement> objectCollection) {
        ArrayElement[] objectArray = new ArrayElement[objectCollection.size()];
        objectArray = objectCollection.toArray(objectArray);
        System.out.println(" ");
        for (ArrayElement element : objectArray) {
            System.out.print(element.getElementName());
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
