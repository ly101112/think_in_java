/**
 * 第十一章练习18 HashMap和LinkedHashMap
 */
package class11.test18;

import class11.test1.Gerbil;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, Gerbil> shm = new HashMap<String, Gerbil>();
        shm.put("ccc", new Gerbil(2));
        shm.put("yyy", new Gerbil(4));
        shm.put("eee", new Gerbil(7));
        shm.put("aaa", new Gerbil(9));
        shm.put("rrr", new Gerbil(45));
        shm.put("ttt", new Gerbil(5));
        shm.put("jjj", new Gerbil(1));

        System.out.println(shm);
        System.out.println();
        LinkedHashMap<String, Gerbil> lhm = new LinkedHashMap<String, Gerbil>(new TreeMap<String, Gerbil>(shm));
        System.out.println("sort LinkedHashMap: " + lhm);
    }
}
