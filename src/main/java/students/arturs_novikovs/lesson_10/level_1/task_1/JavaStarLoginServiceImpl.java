package students.arturs_novikovs.lesson_10.level_1.task_1;

public class JavaStarLoginServiceImpl implements JavaStarLoginService{
    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javaMaster")
                && (password != null)
                && password.equals("pass");
    }

    public static void main(String[] args) {
        JavaStarLoginServiceImpl javaStarLoginServiceImpl = new JavaStarLoginServiceImpl();
        javaStarLoginServiceImpl.canLogin("javaMaster", "pass");
    }
}
