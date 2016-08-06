package fundamentals.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionObjects {

    private Collection collection = new ArrayList();

    public void addToCollection() {
        collection.add("String1");
        collection.add(new String("String1"));
        collection.add(new Integer(1));
    }

    public void removeFromCollection() {
        collection.remove(new Object());
        collection.remove(new Integer(1));
    }

    public void containsInCollection() {
        collection.contains("String1");
    }
}
