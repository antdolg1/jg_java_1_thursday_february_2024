package students.kristina_manevica.lesson_12.level_2;

import java.util.List;

public class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRole() {
        return roles;
    }
}