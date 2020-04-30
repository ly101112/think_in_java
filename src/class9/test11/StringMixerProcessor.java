/**
 * 第九章练习11 适配器模式
 * 将输入的任意字符串的每一对字符位置互换
 */
package class9.test11;

class StringMixer {
    static String process(String s) {
        char[] ca = new char[s.length()];
        if ((s.length()) % 2 == 0) {
            for (int i = 0; i < s.length(); i += 2) {
                ca[i] = s.charAt(i + 1);
                ca[i + 1] = s.charAt(i);
            }
        } else {
            for (int i = 0; i < s.length() - 1; i += 2) {
                ca[i] = s.charAt(i + 1);
                ca[i + 1] = s.charAt(i);
            }
            ca[s.length() - 1] = s.charAt(s.length() - 1);
        }
        return new String(ca);
    }
}

class StringMixerAdapter implements Processor {
    public String name() {
        return "StringMixerAdapter";
    }

    StringMixer stringMixer;

    public StringMixerAdapter(StringMixer stringMixer) {
        this.stringMixer = stringMixer;
    }

    public String process(Object input) {
        return stringMixer.process((String) input);
    }
}

public class StringMixerProcessor {
    public static void main(String[] args) {
//        String s = new String(args[0]);
        String s = new String("fhffggfgfgfhgfhgf");
        Apply.process(new StringMixerAdapter(new StringMixer()), s);
    }
}
