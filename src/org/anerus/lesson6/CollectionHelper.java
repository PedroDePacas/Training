package org.anerus.lesson6;

import org.anerus.lesson5.ArrayElement;

import java.util.HashSet;
import java.util.Set;

public class CollectionHelper {
    public HashSet<ArrayElement> mergeCollections(HashSet<ArrayElement> objectLeftCollection,  HashSet<ArrayElement> objectRightCollection) {
        objectLeftCollection.addAll(objectRightCollection);
        return objectLeftCollection;
    }
}
