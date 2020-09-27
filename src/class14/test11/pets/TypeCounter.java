package class14.test11.pets;

import java.util.HashMap;
import java.util.Map;

public class TypeCounter extends HashMap<Class<?>, Integer> {
    private Class<?> baseType;

    public TypeCounter(Class<?> baseType) {
        this.baseType = baseType;
    }

    public void count(Object obj) {
        Class<?> type = obj.getClass();
        if (!baseType.isAssignableFrom(type)) {
            throw new RuntimeException(obj + " incorrect type: " + type + 
                    ", should be type or subtype of " + baseType);
        }
        countClass(type);
    }
    
    private void countClass(Class<?> type) {
        Integer integer = get(type);
        put(type, integer == null ? 1 : integer + 1);
        Class<?> superclass = type.getSuperclass();
        if (superclass != null && baseType.isAssignableFrom(superclass)) {
            countClass(superclass);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (Map.Entry<Class<?>, Integer> pair : entrySet()) {
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
