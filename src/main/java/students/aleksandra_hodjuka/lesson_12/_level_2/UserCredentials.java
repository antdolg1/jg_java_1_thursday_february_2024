package students.aleksandra_hodjuka.lesson_12._level_2;


import java.util.List;

class UserCredentials {
    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasSearchClientsRole() {
        return roles.contains(Role.CAN_SEARCH_CLIENTS);
    }

}
