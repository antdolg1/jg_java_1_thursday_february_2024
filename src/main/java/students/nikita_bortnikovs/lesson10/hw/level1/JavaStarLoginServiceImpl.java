package students.nikita_bortnikovs.lesson10.hw.level1;

public class JavaStarLoginServiceImpl {
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
