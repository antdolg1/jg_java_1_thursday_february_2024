package teacher.lesson_3_oop_first_look.lessoncode.solutions;

public class MusicBox {

    String model;
    boolean isOn;
    int volume;

    MusicBox(String model) {
        this.model = model;
        this.isOn = false;
        this.volume = 0;
    }

    void switchOn() {
        this.isOn = true;
        this.volume = 0;
    }

    void switchOff() {
        this.isOn = false;
        this.volume = 0;
    }

    void increaseVolume() {
        if (isOn == true && volume < 10) {
            this.volume = this.volume + 1;
        }
    }

    void decreaseVolume() {
        if (isOn == true && volume > 0) {
            this.volume = this.volume - 1;
        }
    }

    boolean isSwitchedOn() {
        return this.isOn == true;
    }

    boolean isSwitchedOff() {
        return this.isOn == false;
    }

    int getVolume() {
        return this.volume;
    }

}
