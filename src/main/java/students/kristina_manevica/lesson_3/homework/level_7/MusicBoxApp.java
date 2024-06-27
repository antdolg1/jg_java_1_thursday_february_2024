package students.kristina_manevica.lesson_3.homework.level_7;

public class MusicBoxApp {
    public static void main(String[] args) {

        MusicBox musicBox = new MusicBox("Huawei S33");

        System.out.println(musicBox.getSound());
        System.out.println(musicBox.isOn());

        musicBox.switchOn();
        System.out.println(musicBox.isOn());

        musicBox.increaseSound();
        musicBox.increaseSound();
        musicBox.increaseSound();
        musicBox.increaseSound();
        musicBox.increaseSound();
        musicBox.increaseSound();
        musicBox.increaseSound();
        musicBox.increaseSound();
        musicBox.increaseSound();
        System.out.println(musicBox.getSound());

        musicBox.increaseSound();
        System.out.println(musicBox.getSound());

        musicBox.switchOf();
        System.out.println(musicBox.getSound());
        System.out.println(musicBox.isOn());
    }
}
