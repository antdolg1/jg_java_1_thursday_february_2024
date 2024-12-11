package students.nikita_bortnikovs.lesson_15.hw.level2;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class TestClass {
        @Test
        public void moreThanZero() {
            QuadEqSrp quadEqSrp = new QuadEqSrp();
            Roots roots = quadEqSrp.calc(1, -3, 2);
            assertNotNull(roots);
            assertEquals(1.0, roots.getX1());
            assertEquals(2.0, roots.getX2());
        }

    @Test
    public void equalsZero() {
        QuadEqSrp quadEqSrp = new QuadEqSrp();
        Roots roots = quadEqSrp.calc(1, -2, 1);
        assertNotNull(roots);
        assertEquals(1.0, roots.getX1());
        assertNull(roots.getX2());
    }

    @Test
    public void lessThanZero() {
        QuadEqSrp quadEqSrp = new QuadEqSrp();
        Roots roots = quadEqSrp.calc(1, 0, 1);
        assertNotNull(roots);
        assertFalse(roots.hasRoots());
        assertNull(roots.getX1());
        assertNull(roots.getX2());
    }
}