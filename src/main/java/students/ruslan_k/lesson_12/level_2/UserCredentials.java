package students.ruslan_k.lesson_12.level_2;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    UserCredentials(List<Role> role){
        this.roles= role;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(Role role){
        return roles.contains(role);
    }

    // создайте конструктор класса, в котором вы получаете список ролей

}
