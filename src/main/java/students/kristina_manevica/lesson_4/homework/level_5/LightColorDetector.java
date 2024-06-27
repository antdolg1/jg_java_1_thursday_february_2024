package students.kristina_manevica.lesson_4.homework.level_5;

class LightColorDetector {

    public String colorDetector(int waveNumber) {
        if (waveNumber >= 380 && waveNumber <= 449) {
            return "Violet";
        } else if (waveNumber >= 450 && waveNumber <= 494) {
            return "Blue";
        } else if (waveNumber >= 495 && waveNumber <= 569) {
            return "Green";
        } else if (waveNumber >= 570 && waveNumber <= 589) {
            return "Yellow";
        } else if (waveNumber >= 590 && waveNumber <= 619) {
            return "Orange";
        } else if (waveNumber >= 620 && waveNumber <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}
