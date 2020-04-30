/**
 * 第九章练习10 修改第八章练习6，添加Playable接口，并修改tune接受Playable类型作为参数
 */
package class9.test10;

enum Note {
    A, B, C, D, E
}

interface Playable {
    void play(Note note);
}

class Instrument {
    void adjust() {
        System.out.println("Adjusting Instrument");
    }

    @Override
    public String toString() {
        return "Instrument.toString()";
    }
}

class Wind extends Instrument implements Playable {
    @Override
    public String toString() {
        return "Wind.toString()";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }

    @Override
    public void play(Note note) {
        System.out.println("Wind.play() " + note);
        ;
    }
}

class Percussion extends Instrument implements Playable {
    @Override
    public String toString() {
        return "Percussion.toString()";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }

    @Override
    public void play(Note note) {
        System.out.println("Percussion.play() " + note);
        ;
    }
}

class Stringed extends Instrument implements Playable {
    @Override
    public String toString() {
        return "Stringed.toString()";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }

    @Override
    public void play(Note note) {
        System.out.println("Stringed.play() " + note);
        ;
    }
}

class Brass extends Wind implements Playable {
    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }

    @Override
    public void play(Note note) {
        System.out.println("Brass.play() " + note);
    }
}

class WoodWind extends Wind implements Playable {
    @Override
    public String toString() {
        return "WoodWind.toString()";
    }

    @Override
    public void play(Note note) {
        System.out.println("WoodWind.play() " + note);
    }
}

public class Test {
    public static void tune(Playable playable) {
        playable.play(Note.C);
    }

    public static void tuneAll(Instrument[] arr) {
        for (Instrument instrument : arr) {
            tune((Playable) instrument);
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
