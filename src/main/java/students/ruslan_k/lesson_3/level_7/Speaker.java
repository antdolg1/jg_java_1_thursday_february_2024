package students.ruslan_k.lesson_3.level_7;

class Speaker {
    String model;
    int soundVol;
    boolean isOn;
    Speaker(String model){
        this.model=model;
        isOn=false;
        soundVol=0;
    }
    void incrVol(){
        if(this.isOn && soundVol<10)
            soundVol++;
    }
    void decrVol(){
        if(soundVol>0) //проверка вкл-выкл не нужна, т.к при выкл звук=0
            soundVol--;
    }
    void setisOn(boolean isOn){
        this.soundVol=0;
        this.isOn=isOn;
    }

    void getIsOn(){
        if(isOn)
            System.out.println(STR."Speaker \{this.model} is ON and sound volume is \{this.soundVol}");
        else
            System.out.println(STR."Speaker \{this.model} is Off");
    }
    int getSoundVol() {
        return soundVol;
    }
    String getModel(){
        return model;
    }

}
