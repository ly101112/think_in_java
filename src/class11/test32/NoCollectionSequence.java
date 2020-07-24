/**
 * 第十一章练习32 实现Iterable接口，自定义foreach实现
 */
package class11.test32;

import java.util.*;

public class NoCollectionSequence implements Iterable<Pet> {
    private Pet[] pets;

    public NoCollectionSequence(int x) {
        pets = new Pet[x];
        for (int i = 0; i < x; i++) {
            pets[i] = new Pet();
        }
    }

    @Override
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

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public Iterable<Pet> revered() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    private int index = pets.length - 1;

                    @Override
                    public boolean hasNext() {
                        return index > -1;
                    }

                    @Override
                    public Pet next() {
                        return pets[index--];
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                ArrayList<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        NoCollectionSequence ncs = new NoCollectionSequence(5);
        for (Pet pet : ncs) {
            System.out.println("pet: " + pet);
        }
        System.out.println();
        for (Pet pet : ncs.revered()) {
            System.out.println("pet: " + pet);
        }
        System.out.println();
        for (Pet pet : ncs.randomized()) {
            System.out.println("pet: " + pet);
        }
        System.out.println();
    }
}
