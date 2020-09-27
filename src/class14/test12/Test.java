package class14.test12;

import class14.test11.pets.TypeCounter;

public class Test {
    public static void main(String[] args) {
        TypeCounter typeCounter = new TypeCounter(Coffee.class);
        for (Coffee coffee : new CoffeeGenerator(20)) {
            System.out.println(coffee);
            typeCounter.count(coffee);
        }
        System.out.println(typeCounter);
    }
}
