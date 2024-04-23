package students.aleksandra_hodjuka.lesson_3.level_7;

class MusicBoxApp {
    public static void main(String[] args) {
        MusicBox musicBox1 = new MusicBox("Sony");

        // Проверяем начальное состояние музыкальной колонки
        System.out.println("Model: " + musicBox1.getModel());
        System.out.println("Volume: " + musicBox1.getVolume());
        System.out.println("Is music speaker on? " + musicBox1.isOn());


        musicBox1.switchOn();
        musicBox1.increaseVolume();
        musicBox1.increaseVolume();


        System.out.println("Model: " + musicBox1.getModel());
        System.out.println("Volume: " + musicBox1.getVolume());
        System.out.println("Is music speaker on? " + musicBox1.isOn());

        musicBox1.switchOff();
        System.out.println("Is music speaker on? " + musicBox1.isOn());
    }
    }







