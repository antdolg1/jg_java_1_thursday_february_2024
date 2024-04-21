package students.karina_cmile.lesson_10.level_1_intern;

public interface JavaStarLoginService {

    default boolean canLogin(String login, String password) {
        return false;
    }
}
