package students.ruslan_k.lesson_15.level_2;


import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEqTest {

    QuadraticEq testEqDMoreThanZero = new QuadraticEq(1, -5, 6);
    QuadraticEq testEqWhereDiscriminantEqZero = new QuadraticEq(1, -8, 16);
    QuadraticEq testEqWhereDiscriminantLessZero = new QuadraticEq(1, 1, 1);



    @Test
    public void quadraticEqTest_WhenDiscriminantMoreThanZero() throws NegativeDiscriminantException{
        double[] expectRoots = {2.0, 3.0};
        double[] actualResult;
        actualResult= testEqDMoreThanZero.calc();

        assertArrayEquals(expectRoots, actualResult, 0);
    }


    @Test
    public void quadraticEqTest_WhenDiscriminantEqualZero() throws NegativeDiscriminantException{
        double[] expectRoots = {4.0, 4.0};
        double[] actualResult;
        actualResult= testEqWhereDiscriminantEqZero.calc();

        assertArrayEquals(expectRoots,actualResult,0);
    }

    @Test(expected = NegativeDiscriminantException.class)
    public void shouldThrowException_WhenDiscriminantLessZero() throws NegativeDiscriminantException{
        testEqWhereDiscriminantLessZero.calc();
    }
}