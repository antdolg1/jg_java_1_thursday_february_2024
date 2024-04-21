package students.karina_cmile.lesson_10.level_1_intern;

public class JavaStarLoginServiceImpl implements JavaStarLoginService {

@Override
    public boolean canLogin(String login, String password) {
    return (login != null)
            && login.equals("javastar")
            && (password != null)
            && password.equals("pass");

}

    public static void main(String[] args) {
        JavaStarLoginServiceImpl javaStarLoginServiceImpl = new JavaStarLoginServiceImpl();
        javaStarLoginServiceImpl.canLogin("javastar", "pass");
    }
}
