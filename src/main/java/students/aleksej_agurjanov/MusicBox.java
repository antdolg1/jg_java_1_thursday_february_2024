package students.aleksej_agurjanov;

public class MusicBox {

    String model;
    boolean isOn;

    int volume;


    MusicBox(String model) {
        this.model = model;
        this.isOn = false;
        this.volume= 0
    }

    void switchOn() {
        this.isOn = true;
    }

   void switchOff() {
        this.isOn = false;
    }

    void increaseVolume() {
        if (isOn == true && volume < 10) {
            this.volume = this.volume + 1;
        }
    }

    boolean isOn() {
        return this.isOn;
    }

    boolean isSwitchedOff() {
        return this.isOn == false;
}
