package students.nikita_bortnikovs.lesson_15.hw.level2;

public class Meth {
    public static void main(String[] args) {
        QuadraticEq quadraticEq = new QuadraticEq();
        Roots roots = quadraticEq.calc(1, -3, 2);
        printRoots(roots);
    }

    public static void printRoots(Roots roots) {
        if (roots.hasRoots()) {
            if (roots.getX1() != null && roots.getX2() != null) {
                System.out.println("x1 = " + roots.getX1() + ", x2 = " + roots.getX2());
            } else if (roots.getX1() != null) {
                System.out.println("x = " + roots.getX1());
            }
        } else {
            System.out.println("No roots");
        }
    }
}