package class14.test11.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();

    private static String[] typeNames = {
            "class14.test11.pets.Mutt",
            "class14.test11.pets.Pug",
            "class14.test11.pets.EgyptianMau",
            "class14.test11.pets.Manx",
            "class14.test11.pets.Cymric",
            "class14.test11.pets.Rat",
            "class14.test11.pets.Mouse",
            "class14.test11.pets.Hamster",
            "class14.test11.pets.Gerbil",
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames) {
                types.add((Class<? extends Pet>) Class.forName(name));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
}
