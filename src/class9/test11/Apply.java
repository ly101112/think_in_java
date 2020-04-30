/**
 * 第九章练习11 书本示例代码，有问题，打出来看看。
 */
package class9.test11;

import java.util.Arrays;

//class Processor {
//    public String name() {
//        return getClass().getSimpleName();
//    }
//
//    Object process(Object input) {
//        return input;
//    }
//}

/**
 * 修改版
 */
interface Processor {
    String name();

    Object process(Object input);
}

class GetName {
    public String name() {
        return getClass().getSimpleName();
    }
}

//class Upcase extends Processor {
class Upcase extends GetName implements Processor {

    @Override
    public Object process(Object input) {
        return ((String) input).toUpperCase();
    }
}

//class Downcase extends Processor {
class Downcase extends GetName implements Processor {
    @Override
    public Object process(Object input) {
        return ((String) input).toLowerCase();
    }
}

//class Splitter extends Processor {
class Splitter extends GetName implements Processor {
    @Override
    public Object process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}

/**
 * 修改版
 */
class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform " + id;
    }
}

class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}

class LowPass extends Filter {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }
}

class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }
}

class BadPass extends Filter {
    double lowCutOff, highCutOff;

    public BadPass(double lowCutOff, double highCutOff) {
        this.lowCutOff = lowCutOff;
        this.highCutOff = highCutOff;
    }
}

abstract class StringProcessor implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract String process(Object input);

    public static String s = "if she weighs the same sa a duck, she`s made of wood";

    public static void main(String[] args) {
        Apply.process(new UpCase(), s);
        Apply.process(new DownCase(), s);
        Apply.process(new SplitterCase(), s);
    }
}

class UpCase extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class DownCase extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class SplitterCase extends StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

class FilterAdapter implements Processor {
    Filter filter;

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }
}

class FilterProcessor {
    public static void main(String[] args) {
        Waveform waveform = new Waveform();
//        Apply.process(new FilterAdapter(new LowPass(1.0), waveform)); // 没有双参数的FilterAdapter
    }
}
