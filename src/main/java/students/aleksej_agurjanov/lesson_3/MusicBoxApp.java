package students.aleksej_agurjanov.lesson_3;

import students.aleksej_agurjanov.lesson_3.MusicBox;

public class MusicBoxApp {

    public static void main(String[] args) {
        MusicBox musicBox = new MusicBox("S90");


        System.out.println("Is on = " + musicBox.isSwitchedOn());
        System.out.println("Is off = " + musicBox.isSwitchedOff());
        System.out.println("Volume = " + musicBox.getVolume());

        musicBox.switchOn();

        System.out.println("Is on = " + musicBox.isSwitchedOn());
        System.out.println("Is off = " + musicBox.isSwitchedOff());

        musicBox.increaseVolume();
        musicBox.increaseVolume();
        musicBox.increaseVolume();

        System.out.println("Volume = " + musicBox.getVolume());

        musicBox.switchOff();

        musicBox.increaseVolume();
        musicBox.increaseVolume();
        musicBox.increaseVolume();

        System.out.println("Volume = " + musicBox.getVolume());


        musicBox.switchOn();

        musicBox.increaseVolume();
        musicBox.increaseVolume();
        musicBox.increaseVolume();
        musicBox.increaseVolume();
        musicBox.increaseVolume();
        musicBox.increaseVolume();
        musicBox.increaseVolume();
        musicBox.increaseVolume();
        musicBox.increaseVolume();
        musicBox.increaseVolume();
        musicBox.increaseVolume();
        musicBox.increaseVolume();

        System.out.println("Volume = " + musicBox.getVolume());

    }
}
