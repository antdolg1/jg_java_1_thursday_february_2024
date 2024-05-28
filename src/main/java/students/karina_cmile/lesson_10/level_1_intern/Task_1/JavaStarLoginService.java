package students.karina_cmile.lesson_10.level_1_intern.Task_1;

public interface JavaStarLoginService {

    default boolean canLogin(String login, String password) {
        return false;
    }
}
