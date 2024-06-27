package students.ruslan_k.lesson_10.level_4;

public class ConverterDemo {

    public static void main(String[] args) {

        double cTemperature = 36.6;

        KConverter kConverter = new KConverter();
        FConverter fConverter = new FConverter();

        System.out.printf("Normal body temperature must be 36.6 Celsius, %.2f Kelvin and %.2f Fahrenheit\n ",
                kConverter.tConvert(cTemperature), fConverter.tConvert(cTemperature));

    }


}
