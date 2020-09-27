package class14.test11.pets;

import java.util.LinkedHashMap;
import java.util.Map;

public class PetCount3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
            super();
            for (Class<? extends Pet> pet : LiteralPetCreator.allTypes) {
                put(pet, 0);
            }
        }

        public void count(Pet pet) {
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                if (pair.getKey().isInstance(pet))
                    put(pair.getKey(), pair.getValue() + 1);
            }
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                stringBuilder.append(pair.getKey().getSimpleName());
                stringBuilder.append("=");
                stringBuilder.append(pair.getValue());
                stringBuilder.append(", ");
            }
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    public static void main(String[] args) {
        PetCounter petCounter = new PetCounter();
        for (Pet pet : Pets.createArray(20)) {
            System.out.println(pet.getClass().getSimpleName());
            petCounter.count(pet);
        }
        System.out.println(petCounter);
    }
}
