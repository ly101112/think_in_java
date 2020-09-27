package class14.test11.pets;

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter typeCounter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            System.out.println(pet.getClass().getSimpleName());
            typeCounter.count(pet);
        }
        System.out.println(typeCounter);
    }
}
