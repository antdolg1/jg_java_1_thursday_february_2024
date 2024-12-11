package students.ruslan_k.lesson_15.level_2;

import java.util.Arrays;

class QuadraticEq {

    private final double a;
    private final double b;
    private final double c;

    private double discriminant;

    public QuadraticEq(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double[] calc() throws NegativeDiscriminantException{
        discriminant = discriminantCalculate();
        if (discriminant >= 0) {
            return rootsWhenDiscriminantPositiveOrZero();
        } else {
            throw new NegativeDiscriminantException("Discriminant is negative");
        }

    }

    private double discriminantCalculate() {
        return b * b - 4 * a * c;
    }



    private double[] rootsWhenDiscriminantPositiveOrZero() {
        double[] roots = new double [2];
        roots[0] = (-b - Math.sqrt(discriminant)) / (2 * a);
        roots[1] = (-b + Math.sqrt(discriminant)) / (2 * a);
        return  roots;

    }

}