package org.anerus.lesson6;

import org.anerus.lesson5.ArrayElement;
import java.util.HashSet;

public class Main {
    private static int[] leftArray = {1,7,11,17,78};
    private static int[] rightArray = {3,5,24,4,1,2,34,45,32,5};

    public static void main(String[] args) {
        HashSet<ArrayElement> objectLeftCollection = generateObjectCollection(leftArray);
        HashSet<ArrayElement> objectRightCollection = generateObjectCollection(rightArray);

        CollectionHelper collectionHelper = new CollectionHelper();
        ServiceDelegate serviceDelegate = new ServiceDelegate(collectionHelper);
        HashSet<ArrayElement> objectResultArray = serviceDelegate.mergeCollections(objectLeftCollection, objectRightCollection);
    }

    // Заполнение колекций объектами
    public static HashSet<ArrayElement> generateObjectCollection(int[] intArray) {
        HashSet<ArrayElement> objectCollection = new HashSet<>();
        for (int element : intArray) {
            ArrayElement newElement = new ArrayElement.Builder()
                    .elementName(Integer.toString(element))
                    .elementValue(element)
                    .build();
            objectCollection.add(newElement);
        }
        return objectCollection;
    }
}
