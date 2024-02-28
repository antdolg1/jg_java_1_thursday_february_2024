package students.kristina_manevica.lesson_3.homework.level_7;

class MusicBox {

    private String model;
    private int sound;
    private boolean isOn;

    public MusicBox(String model) {
        this.model = model;
        this.sound = 0;
        this.isOn = false;
    }

    public void switchOn() {
        isOn = true;
    }

    public void increaseSound() {
        if ((isOn = true) && (sound < 10)) {
            sound = sound + 1;
        }
    }

    public void switchOf() {
        isOn = false;
        sound = 0;
    }

    public String getModel() {
        return model;
    }

    public int getSound() {
        return sound;
    }

    public boolean isOn() {
        return isOn;
    }
}
