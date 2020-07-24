/**
 * 第十一章练习22
 */
package class11.test22;

import java.util.*;

public class Word {
    static int total = 0;
    private String word;
    private int count;

    Word(String word, int count) {
        this.word = word;
        this.count = count;
        total++;
    }

    @Override
    public String toString() {
        return "word: " + word + ", count: " + count;
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "word", "love", "live", "live", "yes", "yes");
        Set<Word> words = new HashSet<>();
        System.out.println("list: " + strings);

        Iterator<String> it = strings.iterator();
        System.out.println(it.hasNext() + "" + strings.size());
        while (it.hasNext()) {
            String next = it.next();
            int count = 0;
            for (int i = 0; i < strings.size(); i++) {
                if (next.equals(strings.get(i)))
                    count++;
            }
//            Word w = new Word(next, count);
//            words.add(w);
            words.add(new Word(next, count));
        }
        System.out.println("wordsList: " + words);
        System.out.println("count: " + Word.total);
    }
}
