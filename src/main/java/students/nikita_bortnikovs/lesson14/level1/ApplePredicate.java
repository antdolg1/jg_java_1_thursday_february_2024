//до 12 таска
package students.nikita_bortnikovs.lesson14.level1;

public interface ApplePredicate {
    boolean test(Apple apple);

    class AppleGreenColorPredicate implements ApplePredicate {
        public boolean test(Apple apple) {
            return "green".equals(apple.getColor());
        }
    }

    class AppleRedColorPredicate implements ApplePredicate {
        public boolean test(Apple apple) {
            return "red".equals(apple.getColor());
        }
    }

    class AppleHeavyWeightPredicate implements ApplePredicate {
        public boolean test(Apple apple) {
            return apple.getWeight() > 150;
        }
    }

    class AppleLightWeightPredicate implements ApplePredicate {
        public boolean test(Apple apple) {
            return apple.getWeight() < 150;
        }
    }
}
