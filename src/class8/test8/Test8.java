/**
 * 第八章练习8 修改练习7为随机类型
 */
package class8.test8;

import java.util.Random;

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
        System.out.println("Wind.play() " + note);
        ;
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
        System.out.println("Percussion.play() " + note);
        ;
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
        System.out.println("Stringed.play() " + note);
        ;
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

class NewOne extends Stringed {
    @Override
    void play(Note note) {
        System.out.println("NewOne.play() " + note);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting NewOne");
    }
}

class RandomMusicCreator {
    private Random random = new Random();

    public Instrument next() {
        switch (random.nextInt(6)) {
            case 0:
                return new Wind();
            case 1:
                return new Percussion();
            case 2:
                return new Stringed();
            case 3:
                return new Brass();
            case 4:
                return new WoodWind();
            case 5:
                return new NewOne();
        }
        return null;
    }
}

public class Test8 {
    public static void tune(Instrument instrument) {
        instrument.play(Note.C);
    }

    public static void tuneAll(Instrument[] arr) {
        for (Instrument instrument : arr) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        Instrument[] arr = new Instrument[9];
        RandomMusicCreator randomMusicCreator = new RandomMusicCreator();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomMusicCreator.next();
        }
        tuneAll(arr);
        for (Instrument instrument : arr) {
            System.out.println(instrument);
        }
    }
}
