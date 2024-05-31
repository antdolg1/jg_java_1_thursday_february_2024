package students.ruslan_k.lesson_10.level_4;


class KConverter implements Converter{

    @Override
    public double tConvert(double cTemperature){
        return cTemperature+273.15;
    }

}

class FConverter implements Converter{
    @Override
    public double tConvert(double cTemperature){
        return 1.8*cTemperature+32.0;
    }
}

