package students.kristina_manevica.lesson_4;

class TernaryOperator {
    public static void main(String[] args) {

        int number = 5;
        if (number % 2 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        //v odnu stroku pri pomowi ternary operator   (toljko kogda if + else)
        // uslovije ? znachenije_esli_uslovije_istino : znachenije_esli_lozh;

        String result = (number % 2 == 0) ? "Da" : "Net";  //mozhet podavatsja v metod kak parametr
        System.out.println(result);

        boolean isSpring = false;
        String currentSeason = isSpring ? "Vesna" : "Zima";
        System.out.println(currentSeason);
    }
}
