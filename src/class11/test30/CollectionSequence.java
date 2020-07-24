/**
 * 第十一章练习30 AbstractCollection接口
 */
package class11.test30;

import java.util.Iterator;

class Pet{}

public class CollectionSequence {
    private Pet[] pets = new Pet[8];

    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    public static void main(String[] args) {
        CollectionSequence collectionSequence = new CollectionSequence();
        display(collectionSequence.iterator());
    }
}
