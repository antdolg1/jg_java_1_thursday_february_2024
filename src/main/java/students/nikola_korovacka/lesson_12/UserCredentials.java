package students.nikola_korovacka.lesson_12;

import java.util.List;

public class UserCredentials {
    private List<Role> roles; // Список ролей пользователя

    public UserCredentials(List<Role> roles) {
        this.roles = roles; // Устанавливаем список ролей пользователя
    }

    public List<Role> getRoles() {
        return roles; // Возвращаем список ролей
    }
}

