package students.aleksandra_hodjuka.lesson_3.level_7;

class MusicBox {
    private String model;
    private int volume;
    private boolean isOn;


    public MusicBox(String model) {
        this.model = model;
        this.volume = 0;
        this.isOn = false;
    }


    public void switchOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Music speaker switched ON");
        } else {
            System.out.println("Music speaker is already ON");
        }

    }


    public void increaseVolume() {
        if (isOn) {
            if (volume < 10) {
                volume++;
                System.out.println("Volume increased. Current volume level: " + volume);
            } else {
                System.out.println("Volume is already at maximum level (10)");
            }
        } else {
            System.out.println("Cannot increase volume. Music speaker is switched off.");
        }
    }


    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }


    public boolean isOn() {
        return isOn;
    }

    public void switchOff() {
        if (isOn) {
            isOn = false;
            volume = 0;
        System.out.println("Music speaker switched OFF");
        } else {
            System.out.println("Music speaker is already switched OFF");
        }
    }
}
