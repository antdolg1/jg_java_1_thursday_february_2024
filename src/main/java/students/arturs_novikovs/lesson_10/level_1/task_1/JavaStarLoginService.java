package students.arturs_novikovs.lesson_10.level_1.task_1;

public interface JavaStarLoginService {
    default boolean canLogin(String login, String password) {
        return false;
    }
}
