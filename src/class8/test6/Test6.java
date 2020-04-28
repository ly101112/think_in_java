/**
 * 第八章练习6
 */
package class8.test6;

enum Note {
    A, B, C, D, E
}

class Instrument {
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

public class Test6 {
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
