package students.nikola_korovacka.lesson_10.level1_task1;

public class Main {
    public static void main(String[] args) {
        JavaStarLoginService service = new JavaStarLoginServiceImpl();
        System.out.println(service.canLogin("javastar", "pass")); // Output: true
        System.out.println(service.canLogin("javastar", "wrongpass")); // Output: false
    }
}
