/**
 * 第九章练习9 修改第八章练习6的Instrument为抽象类
 */
package class9.test9;

enum Note {
    A, B, C, D, E
}

abstract class Instrument {
    abstract void play(Note note);

    abstract void adjust();
}

class Wind extends Instrument {
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

class Percussion extends Instrument {
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

class Stringed extends Instrument {
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

class Brass extends Wind {
    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }

    @Override
    void play(Note note) {
        System.out.println("Brass.play() " + note);
    }
}

class WoodWind extends Wind {
    @Override
    public String toString() {
        return "WoodWind.toString()";
    }

    @Override
    void play(Note note) {
        System.out.println("WoodWind.play() " + note);
    }
}

public class Test {
    public static void tune(Instrument instrument) {
        instrument.play(Note.C);
    }

    public static void tuneAll(Instrument[] arr) {
        for (Instrument instrument : arr) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        Instrument[] arr = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new WoodWind(),
        };
        tuneAll(arr);
        for (Instrument instrument : arr) {
            System.out.println(instrument);
        }
    }
}
