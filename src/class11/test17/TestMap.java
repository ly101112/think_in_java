/**
 * 第十一章练习17 Map
 */
package class11.test17;

import class11.test1.Gerbil;

import java.util.HashMap;
import java.util.Iterator;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Gerbil> gm = new HashMap<>();
        gm.put("aaa", new Gerbil(2));
        gm.put("bbb", new Gerbil(3));
        gm.put("ccc", new Gerbil(4));
        gm.put("ddd", new Gerbil(5));
        gm.put("eee", new Gerbil(6));

        Iterator<String> iterator = gm.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Gerbil gerbil = gm.get(key);
            System.out.println("key: " + key);
            gerbil.hop();
        }
    }
}
