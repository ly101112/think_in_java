/**
 * 第九章练习16 适配器模式的接口
 */
package class9.test16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class Test implements Readable {
    public static Random random = new Random();
    private int count;

    public Test(int count) {
        this.count = count;
    }

    public char next() {
        return (char) random.nextInt(128);
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0)
            return -1;
        String result = Character.toString(next());
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new Test(10));
        while (scanner.hasNext())
            System.out.println(scanner.next());
    }
}
