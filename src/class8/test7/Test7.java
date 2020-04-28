/**
 * 第八章练习7 新添加类型，测试多态是否作用于新类型
 */
package class8.test7;

enum Note {
    A, B, C, D, E
}

class Instrument1 {
    void play(Note note) {
        System.out.println("Instrument.play() " + note);
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }

    @Override
    public String toString() {
        return "Instrument.toString()";
    }
}

class Wind1 extends Instrument1 {
    @Override
    public String toString() {
        return "Wind.toString()";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }

    @Override
    void play(Note note) {
        System.out.println("Wind.play() " + note);;
    }
}

class Percussion1 extends Instrument1 {
    @Override
    public String toString() {
        return "Percussion.toString()";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }

    @Override
    void play(Note note) {
        System.out.println("Percussion.play() " + note);;
    }
}

class Stringed1 extends Instrument1 {
    @Override
    public String toString() {
        return "Stringed.toString()";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }

    @Override
    void play(Note note) {
        System.out.println("Stringed.play() " + note);;
    }
}

class Brass1 extends Wind1 {
    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }

    @Override
    void play(Note note) {
        System.out.println("Brass.play() " + note);
    }
}

class WoodWind1 extends Wind1 {
    @Override
    public String toString() {
        return "WoodWind.toString()";
    }

    @Override
    void play(Note note) {
        System.out.println("WoodWind.play() " + note);
    }
}

class NewOne extends Stringed1 {
    @Override
    void play(Note note) {
        System.out.println("NewOne.play() " + note);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting NewOne");
    }
}

public class Test7 {
    public static void tune(Instrument1 instrument) {
        instrument.play(Note.C);
    }

    public static void tuneAll(Instrument1[] arr) {
        for (Instrument1 instrument : arr) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        Instrument1[] arr = {
                new Wind1(),
                new Percussion1(),
                new Stringed1(),
                new Brass1(),
                new WoodWind1(),
                new NewOne(),
        };
        tuneAll(arr);
        for (Instrument1 instrument : arr) {
            System.out.println(instrument);
        }
    }
}
