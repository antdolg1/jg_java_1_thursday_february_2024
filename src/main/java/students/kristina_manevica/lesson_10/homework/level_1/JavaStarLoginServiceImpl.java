package students.kristina_manevica.lesson_10.homework.level_1;

public class JavaStarLoginServiceImpl implements JavaStarLoginService {

    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}